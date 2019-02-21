package com.mobility.entity;

import java.net.URL;
import java.sql.Time;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.lucene.analysis.core.KeywordTokenizerFactory;
import org.apache.lucene.analysis.core.LowerCaseFilterFactory;
import org.apache.lucene.analysis.core.StopFilterFactory;
import org.apache.lucene.analysis.miscellaneous.WordDelimiterFilterFactory;
import org.apache.lucene.analysis.ngram.EdgeNGramFilterFactory;
import org.apache.lucene.analysis.ngram.NGramFilterFactory;
import org.apache.lucene.analysis.pattern.PatternReplaceFilterFactory;
import org.apache.lucene.analysis.standard.StandardTokenizerFactory;
//import org.apache.lucene.analysis.KeywordAnalyzer;
//import org.hibernate.annotations.Filter;
//import org.hibernate.annotations.Filters;
import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;
//import org.hibernate.annotations.Sort;
//import org.hibernate.annotations.SortNatural;
import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Analyzer;
import org.hibernate.search.annotations.AnalyzerDef;
import org.hibernate.search.annotations.AnalyzerDefs;
//import org.hibernate.search.annotations.Analyzer;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Fields;
import org.hibernate.search.annotations.FullTextFilterDef;
import org.hibernate.search.annotations.FullTextFilterDefs;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;
import org.hibernate.search.annotations.Parameter;
import org.hibernate.search.annotations.Spatial;
import org.hibernate.search.annotations.Store;
import org.hibernate.search.annotations.TokenFilterDef;
import org.hibernate.search.annotations.TokenizerDef;
import org.hibernate.search.spatial.Coordinates;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity(name="provider")
@Indexed
@NamedQuery(name = "findAllProviders", query = "SELECT p FROM provider p ORDER BY p.enName asc")
/*@FullTextFilterDefs({@FullTextFilterDef(name="payerFilter", impl = PayerFilterFactory.class),
		@FullTextFilterDef(name="categoryFilter", impl=CategoryFilterFactory.class),
		@FullTextFilterDef(name="openFilter", impl=OpenFilterFactory.class),
		@FullTextFilterDef(name="cityFilter", impl=CityFilterFactory.class)})*/
@AnalyzerDefs({

@AnalyzerDef(name = "autocompleteEdgeAnalyzer",

// Split input into tokens according to tokenizer
tokenizer = @TokenizerDef(factory = KeywordTokenizerFactory.class),

filters = {
 // Normalize token text to lowercase, as the user is unlikely to
 // care about casing when searching for matches
 @TokenFilterDef(factory = PatternReplaceFilterFactory.class, params = {
   @Parameter(name = "pattern",value = "([^a-zA-Z0-9\\.])"),
   @Parameter(name = "replacement", value = " "),
   @Parameter(name = "replace", value = "all") }),
 @TokenFilterDef(factory = LowerCaseFilterFactory.class),
 @TokenFilterDef(factory = StopFilterFactory.class),
 // Index partial words starting at the front, so we can provide
 // Autocomplete functionality
 @TokenFilterDef(factory = EdgeNGramFilterFactory.class, params = {
   @Parameter(name = "minGramSize", value = "3"),
   @Parameter(name = "maxGramSize", value = "50") }) }),
   @AnalyzerDef(name = "autocompleteNGramAnalyzer",

// Split input into tokens according to tokenizer
tokenizer = @TokenizerDef(factory =  StandardTokenizerFactory.class),

filters = {
 // Normalize token text to lowercase, as the user is unlikely to
 // care about casing when searching for matches
 @TokenFilterDef(factory = WordDelimiterFilterFactory.class),
 @TokenFilterDef(factory = LowerCaseFilterFactory.class),
 @TokenFilterDef(factory = NGramFilterFactory.class, params = {
   @Parameter(name = "minGramSize", value = "3"),
   @Parameter(name = "maxGramSize", value = "5") }),
 @TokenFilterDef(factory = PatternReplaceFilterFactory.class, params = {
   @Parameter(name = "pattern",value = "([^a-zA-Z0-9\\.])"),
   @Parameter(name = "replacement", value = " "),
   @Parameter(name = "replace", value = "all") })
}),

@AnalyzerDef(name = "standardAnalyzer",

// Split input into tokens according to tokenizer
tokenizer = @TokenizerDef(factory = StandardTokenizerFactory.class),

filters = {
 // Normalize token text to lowercase, as the user is unlikely to
 // care about casing when searching for matches
 @TokenFilterDef(factory = WordDelimiterFilterFactory.class),
 @TokenFilterDef(factory = LowerCaseFilterFactory.class),
 @TokenFilterDef(factory = PatternReplaceFilterFactory.class, params = {
   @Parameter(name = "pattern", value = "([^a-zA-Z0-9\\.])"),
   @Parameter(name = "replacement", value = " "),
   @Parameter(name = "replace", value = "all") })
})
})
public class Provider {

	public static final String findAll = "findAllProvider";

	@Id
	private String id;

	@Column(name = "name_en")
	//@Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
	//@Analyzer(impl=KeywordAnalyzer.class)
	//@Analyzer(impl=Tokenizer.class)
	@Fields({
		  @Field(name = "name_en", index = Index.YES, store = Store.YES,
		analyze = Analyze.YES, analyzer = @Analyzer(definition = "standardAnalyzer")),
		  @Field(name = "edgeNGramName", index = Index.YES, store = Store.NO,
		analyze = Analyze.YES, analyzer = @Analyzer(definition = "autocompleteEdgeAnalyzer")),
		  @Field(name = "nGramName", index = Index.YES, store = Store.NO,
		analyze = Analyze.YES, analyzer = @Analyzer(definition = "autocompleteNGramAnalyzer"))
		})
	private String enName;

	@Column(name = "name_ar")
	private String arName;

	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "category")
	@IndexedEmbedded
	private Category category;

	@Embedded
	@IndexedEmbedded
	private Location place;

	/*
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="provider_id")
	@IndexedEmbedded
	private Set<TimePeriod> periods;
	*/
	
	//private byte[] icon;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "provider_id")
	@IndexedEmbedded
	private Set<Association> associations;
	
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy="provider", optional=false)
	@LazyToOne(value = LazyToOneOption.PROXY)
	private Photo photo;
	
	
	/*
	@Column(name="url")
	private URL website;
	*/

	
	@Column(name="reception_phone")
	private String phone;

	//@Transient
	//private String formattedPhoneNumber;

	//@Transient
	//private String internationalPhoneNumber;

	public Provider() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Location getPlace() {
		return place;
	}

	public void setPlace(Location place) {
		this.place = place;
	}

	/*
	public byte[] getIcon() {
		return icon;
	}

	public void setIcon(byte[] icon) {
		this.icon = icon;
	}
	*/

	public String getEnName() {
		return enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	public String getArName() {
		return arName;
	}

	public void setArName(String arName) {
		this.arName = arName;
	}

	public Set<Association> getAssociations() {
		return associations;
	}

	public void setAssociations(Set<Association> associations) {
		this.associations = associations;
	}
	
	/*
	public boolean isOpenNow(String day, String time) {
		TimePeriod found = null;
		boolean open=false;
		int dayInt = Integer.parseInt(day);
		for(TimePeriod period : periods) {
			if(period.getDay()==dayInt){
				found=period;
				break;
			}
		}
		if(null!=found){
			if(Time.valueOf(time).getTime() >= found.getOpen().getTime()
					&& Time.valueOf(time).getTime() < found.getClose().getTime()){
				open = true;
			}
		}
		return open;
	}
	*/

	@Spatial(name = "geometry")
	public Coordinates getGeometry() {
		return new Coordinates() {
			@Override
			public Double getLatitude() {
				if (place.getGeometry() == null) {
					return null;
				}
				return place.getGeometry().getLat();// latitude;
			}

			@Override
			public Double getLongitude() {
				if (place.getGeometry() == null) {
					return null;
				}
				return place.getGeometry().getLng();// longitude;
			}
		};
	}
	
	public String getPhone() {
		return phone;
	}
	
	/*
	public Set<TimePeriod> getPeriods() {
		return periods;
	}

	public URL getWebsite() {
		return website;
	}
	*/
	
	public Photo getPhoto() {
		return photo;
	}
}


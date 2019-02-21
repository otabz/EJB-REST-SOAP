package com.mobility.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "photo")
public class Photo {

	@Id
	@Column(name = "place_id")
	private String place;

	private byte[] image;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="place_id")
	private Provider provider;

	public String getPlaceId() {
		return place;
	}

	public void setPlaceId(String placeId) {
		this.place = placeId;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
}

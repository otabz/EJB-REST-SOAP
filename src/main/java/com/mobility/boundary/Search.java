package com.mobility.boundary;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.mobility.entity.Location.City;



@Stateless
public class Search {

	@PersistenceContext
	EntityManager em;
	
	public List<City> fetchAllCities() {
		return em.createNamedQuery("City.findAll", City.class).getResultList();
	}
}

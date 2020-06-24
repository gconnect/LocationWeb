package com.glory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glory.entities.Location;
import com.glory.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepository repository;

	@Override
	public Location saveLocation(Location location) {
		return repository.save(location);
	}


	@Override
	public Location updateLocation(Location location) {
		return repository.save(location);
	}

//	@Override
//	public void deleteLocation(Location location) {
//		return repository.delete(location);
//
//	}
//
//	@Override
//	public Location getLocationById(int id) {
//		return repository.findById(id);
//	}

	@Override
	public List<Location> getAllLocations() {
		return repository.findAll();
	}

	public LocationRepository getRepository() {
		return repository;
	}

	public void setRepository(LocationRepository repository) {
		this.repository = repository;
	}


	@Override
	public void deleteLocation(Location location) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Location getLocationById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

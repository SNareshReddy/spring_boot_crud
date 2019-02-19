package com.naresh.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naresh.example.entities.Location;
import com.naresh.example.repositories.LocationRepository;


@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	LocationRepository locationRepository;
	
	@Override
	public Location saveLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public Location updateLcoation(Location location) {
		
		return locationRepository.save(location);
	}

	@Override
	public void deleteLcoation(Location location) {
		
		locationRepository.delete(location);
	}

	@Override
	public Location getLocationById(long id) {
		return locationRepository.findOne(id);
	}

	@Override
	public List<Location> getAllLocations() {
	
		return locationRepository.findAll();
	}
	
	
	public LocationRepository getLocationRepository() {
		return locationRepository;
	}

	public void setLocationRepository(LocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}
}

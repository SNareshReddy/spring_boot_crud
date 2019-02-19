package com.naresh.example.services;

import java.util.List;

import com.naresh.example.entities.Location;

public interface LocationService {

	Location saveLocation(Location location);

	Location updateLcoation(Location location);

	void deleteLcoation(Location location);

	Location getLocationById(long id);

	List<Location> getAllLocations();

}

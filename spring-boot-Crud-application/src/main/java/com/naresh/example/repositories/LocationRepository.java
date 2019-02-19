package com.naresh.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.naresh.example.entities.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

	@Query("select type,count(type) from Location group by type")
	public List<Object[]> findTypeAndCount();
}

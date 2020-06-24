package com.glory.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glory.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer>{
	

}

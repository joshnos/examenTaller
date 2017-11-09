package com.ucbcba.proyecto.proyecto.Repositories;

import com.ucbcba.proyecto.proyecto.Entities.City;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface CityRepository extends CrudRepository<City, Integer> {
}

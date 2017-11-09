package com.ucbcba.proyecto.proyecto.Services;

import com.ucbcba.proyecto.proyecto.Entities.City;

public interface CityService {

    Iterable<City> listAllCitys();

    City getCityById(Integer id);

    City saveCity(City city);

    void deleteCity(Integer id);
}

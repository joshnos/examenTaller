package com.ucbcba.proyecto.proyecto.Services;

import com.ucbcba.proyecto.proyecto.Entities.City;
import com.ucbcba.proyecto.proyecto.Repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CityServiceImpl implements CityService {

    private CityRepository cityRepository;

    @Autowired
    @Qualifier(value = "cityRepository")
    public void setCityRepository(CityRepository cityRepository){
        this.cityRepository=cityRepository;
    }


    @Override
    public Iterable<City> listAllCitys() {
        return cityRepository.findAll();
    }

    @Override
    public City getCityById(Integer id) {
        return cityRepository.findOne(id);
    }

    @Override
    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public void deleteCity(Integer id) {
        cityRepository.delete(id);
    }
}

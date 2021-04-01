package com.lambdaschool.foodtruck.repositories;

import com.lambdaschool.foodtruck.models.Truck;
import org.springframework.data.repository.CrudRepository;

public interface TruckRepository extends CrudRepository<Truck, Long> {
}

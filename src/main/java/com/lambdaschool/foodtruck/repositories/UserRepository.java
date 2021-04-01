package com.lambdaschool.foodtruck.repositories;

import com.lambdaschool.foodtruck.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}

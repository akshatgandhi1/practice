package com.einfochips.Test.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.einfochips.Test.Model.FoodMenu;

@Repository
public interface FoodRepo extends MongoRepository<FoodMenu, Long> {

}

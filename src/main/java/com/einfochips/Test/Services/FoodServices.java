package com.einfochips.Test.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.einfochips.Test.Model.FoodMenu;
import com.einfochips.Test.Repository.FoodRepo;
@Service
public class FoodServices implements Food  {

	@Autowired
	FoodRepo FR;
	
	@Override
	public List<FoodMenu> getFoodMenu() {
		return  FR.findAll();
	}

	@Override
	public FoodMenu getAddFood(FoodMenu food) {
		FR.save(food);
		return food;
	}

	@Override
	public List<FoodMenu> GetFood() {
		return null;
	}

}

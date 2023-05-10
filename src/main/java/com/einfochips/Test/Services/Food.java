package com.einfochips.Test.Services;

import java.util.List;

import com.einfochips.Test.Model.FoodMenu;

public interface Food  {

	List<FoodMenu> getFoodMenu();

	FoodMenu getAddFood(FoodMenu food);

	List<FoodMenu> GetFood();

}

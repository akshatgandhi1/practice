package com.einfochips.Test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.einfochips.Test.Model.FoodMenu;
import com.einfochips.Test.Repository.FoodRepo;
import com.einfochips.Test.Services.Food;

@Controller
@CrossOrigin("http://localhost:3000")
public class UserController {

	@Autowired
	private Food Fd; 
	@Autowired
	private FoodRepo Fr;
	
	@GetMapping("/")
	public String getHome() {
		return "Home";
	}
	
	@RequestMapping("StoreData")
	public ModelAndView getStoreDate(@RequestParam String id,String image,String desc,String price) {
		FoodMenu FM=new FoodMenu(Long.parseLong(id),desc,image,Integer.parseInt(price));
		Fr.save(FM);
		return new ModelAndView("success");
	}
	
	@GetMapping("/GetFood")
	public List<FoodMenu> getFoodMenu() {
		return Fd.getFoodMenu();
	}
	
	@PostMapping("/AddFood")
	public FoodMenu GetAddFood(@RequestBody FoodMenu Food) {
		return Fd.getAddFood(Food);
	}
	
	
}

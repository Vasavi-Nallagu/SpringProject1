package com.example.products.Controller;



import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.products.Model.CategoryService;
import com.example.products.Repo.CategoryRepo;

@CrossOrigin("*")
@RestController
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	private CategoryRepo categoryRepo;
	
	 Logger log =Logger.getAnonymousLogger();
     
	
	
	@GetMapping("/getAll")
	public List<CategoryService> getAll() {
		log.info("Hello");
		return categoryRepo.findAll(); 
		
	}

}

	
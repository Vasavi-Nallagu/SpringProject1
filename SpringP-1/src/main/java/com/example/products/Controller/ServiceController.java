package com.example.products.Controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.products.Model.Service;
import com.example.products.Repo.ServiceRepo;

@CrossOrigin("*")
@RestController
@RequestMapping("/service")
public class ServiceController {
	
	@Autowired
	private ServiceRepo serviceRepo;
	 Logger log =Logger.getAnonymousLogger();
	
	
	@GetMapping("/getAll")
	public List<Service> insert() {
		return serviceRepo.findAll();
	}
	
	@PostMapping("/save")
	public void create(@RequestBody Service s ){
		 log.info("Hi service");
		 serviceRepo.save(s);
	 }
	
	@GetMapping("/servicesbyid/{id}")
	public List<Service> findByCategoryId(@PathVariable("id") int id ){
		return serviceRepo.findByCategoryId(id);
	}
	

}

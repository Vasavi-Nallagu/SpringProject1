package com.example.products.Controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.products.Model.JobpostService;
import com.example.products.Model.Service;
import com.example.products.Repo.JobpostRepo;
import com.example.products.Repo.ServiceRepo;


@CrossOrigin("*")
@RestController
@RequestMapping("/jobpost")
public class JobPostController {
	 
	

		
		@Autowired
		private JobpostRepo jobpostrepo;
		 Logger log =Logger.getAnonymousLogger();
		
		
		@GetMapping("/getAll")
		public List<JobpostService> insert() {
			return jobpostrepo.findAll();
		}
		
		@PostMapping("/save")
		public void create(@RequestBody JobpostService s ){
			 log.info("Hi service");
			 jobpostrepo.save(s);
		 }

	


}

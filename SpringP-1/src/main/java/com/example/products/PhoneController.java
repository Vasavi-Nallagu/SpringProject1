
package com.example.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200")
@RestController

public class PhoneController {

	@Autowired
	PhoneDAO service;

	@GetMapping("get")
	public List<Phone> getallproducts() {
		return service.getall();
	}

	@PostMapping("post")
	public String createproduct(@RequestBody Phone p) {
		service.create(p);
		return "data inserted successfully";
	}

	
	  @DeleteMapping("delete/{id}") 
	  public void delete(@PathVariable("id") int id)
	 { 
		  service.deletephonebyid(id); }
	  
	  @PutMapping("{name}") 
	  public void update( @RequestBody Phone p){
	  service.updatephonebyid(p); }
	/*
	 * @PutMapping("{id}") public ResponseEntity<Object> updatePhone(@PathVariable
	 * int id, @RequestBody Phone newPhone) {
	 * 
	 * Phone phone = service.updatePhone(id, newPhone); if (phone != null) return
	 * ResponseEntity.ok("Object deleted"); else return
	 * ResponseEntity.ok("No Product Available to Update"); }
	 */

}

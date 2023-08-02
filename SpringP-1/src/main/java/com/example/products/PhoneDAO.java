
 package com.example.products;
 
 import java.util.List;
 
 import org.springframework.beans.factory.annotation.Autowired; import
 org.springframework.stereotype.Service;
 
 @Service 
 public class PhoneDAO {
 
 @Autowired 
 PhoneRepository repo; 
 
 public List<Phone> getall() {
	 return repo.findAll(); 
	}
 
 public Phone create(Phone p ){
	 return repo.save(p);
 }

   public void deletephonebyid(int id){
	 repo.deleteById(id);
 }
   public void updatephonebyid(Phone p){
	     repo.save(p);
	}
   public Phone updatePhone(int id,Phone newPhone) {
	   if(repo.findById(id).isPresent()) {
		   Phone oldphone=repo.findById(id).get();
		   oldphone.setId(newPhone.getId());
		   oldphone.setName(newPhone.getName());
		   return repo.save(oldphone);
	   }
	   return null;
	  
   }
 
 
   
 }

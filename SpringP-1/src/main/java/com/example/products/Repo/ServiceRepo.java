package com.example.products.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.products.Model.Service;



@Repository
public interface ServiceRepo extends JpaRepository<Service, Integer>{

	  
	  public List<Service> findByCategoryId(int categoryId);
}

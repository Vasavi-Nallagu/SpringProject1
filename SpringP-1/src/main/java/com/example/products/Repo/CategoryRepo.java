package com.example.products.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.products.Model.CategoryService;
import com.example.products.Model.Service;



@Repository
public interface CategoryRepo extends JpaRepository<CategoryService, Integer>{
   
}

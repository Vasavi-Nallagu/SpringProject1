package com.example.products.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.products.Model.JobpostService;


@Repository
public interface JobpostRepo extends JpaRepository<JobpostService, Integer>{

}

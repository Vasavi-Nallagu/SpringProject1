package com.example.products.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name ="service", uniqueConstraints = {
		@UniqueConstraint(columnNames ="id")
})
public class Service {
	
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "category_id")
    private int categoryId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	

}

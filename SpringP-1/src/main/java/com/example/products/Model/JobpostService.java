package com.example.products.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="job" , uniqueConstraints= {
		@UniqueConstraint(columnNames="id")
})
public class JobpostService {

	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	@Column(name = "category_id")
	private int category_id;
	
	@Column(name = "service_id")
	private int service_id;
	
	@Column(name = "address")
	private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public int getService_id() {
		return service_id;
	}
	public void setService_id(int service_id) {
		this.service_id = service_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

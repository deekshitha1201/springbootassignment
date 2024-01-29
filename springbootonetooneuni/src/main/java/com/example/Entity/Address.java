package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAddress() {
		return address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int address) {
		super();
		this.address = address;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + "]";
	}
	
	

}

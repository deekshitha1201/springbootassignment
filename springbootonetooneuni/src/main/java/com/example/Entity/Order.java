package com.example.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String ordername;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id",referencedColumnName = "id")
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(String ordername, Address address) {
		super();
		this.ordername = ordername;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", ordername=" + ordername + ", address=" + address + "]";
	}
	
	

}

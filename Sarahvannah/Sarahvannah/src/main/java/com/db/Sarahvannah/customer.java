package com.db.Sarahvannah;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class customer {
	@Autowired
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String first_name;
	private String last_name;
	private String street_number;
	private String street_name;
	private String city_name;
	private String state_name;
	private String zip_code;
	private String contact_number;
	private String email;
	private String password;
	
	
	public customer() {
		//super();
	}
	public customer(String first_name, String last_name, String contact_number, String email, String password) {
		// TODO Auto-generated constructor stub
	}
	
	public customer(String first_name, String last_name, String street_number, String street_name,
			String city_name, String state_name, String zip_code, String contact_number, String email, String password) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.street_number = street_number;
		this.street_name = street_name;
		this.city_name = city_name;
		this.state_name = state_name;
		this.zip_code = zip_code;
		this.contact_number = contact_number;
		this.email = email;
		this.password = password;
		
		
	}
	public static void postNewcustomer(String first_name2, String last_name2, String street_number2,
			String street_name2, String city_name2, String state_name2, String zip_code2, String contact_number2,
			String email2, String password2) {
		// TODO Auto-generated method stub
		
	}

	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getStreet_number() {
		return street_number;
	}
	public void setStreet_number(String street_number) {
		this.street_number = street_number;
	}
	public String getStreet_name() {
		return street_name;
	}
	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}


package com.db.Sarahvannah;



import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RRcustomer extends CrudRepository<customer, Integer>{
	
	List<customer> findById(int id);
	List<customer> findByEmail(String email);
	
	@Modifying
	@Transactional
	@Query(value = "insert into customer (first_name, last_name, street_number, street_name, city_name, state_name, zip_code, contact_number, email, password)"
		+ "values(:newfirst_name, :newlast_name, NULL, NULL, NULL, NULL, NULL, :newcontact_number, :newemail, "
		+ ":newpassword)", nativeQuery = true) 
	void postNewSignUp(String newfirst_name,  String newlast_name, String newcontact_number, String newemail, String newpassword);
	
	/*
	@Modifying
	@Transactional
	@Query(value = "insert into customer (first_name, last_name, street_number, street_name, city_name, state_name, zip_code, contact_number, email)"
		+ "values(:newfirst_name, :newlast_name, :newstreet_number, :newstreet_name, :newcity_name, :newstate_name, :newzip_code, :newcontact_number, :newemail"
		+ ":newpassword)", nativeQuery = true) 
	void postNewcustomer(String newfirst_name,  String newlast_name, String newstreet_number, String newstreet_name, String newcity_name, 
			 String newstate_name, String zip_code, String newcontact_number, String newemail, String newpassword);
	*/
	@Modifying
	@Transactional
	@Query(value = "update customer set first_name = :newfirst_name, last_name = :newlast_name, street_number = :newstreet_number, "
			+ "street_name = :newstreet_name, city_name = :newcity_name, state_name = :newstate_name, zip_code = :newzip_code, "
			+ "contact_number = :newcontact_number, email = :newemail where id = 1", nativeQuery = true) 
		void updateCustomer(String newfirst_name,  String newlast_name, String newstreet_number, String newstreet_name, String newcity_name, 
				 String newstate_name, String newzip_code, String newcontact_number, String newemail);
	
	@Modifying
	@Transactional
	@Query(value = "update customer set first_name = :newfirst_name, last_name = :newlast_name, street_number = :newstreet_number, "
			+ "street_name = :newstreet_name, city_name = :newcity_name, state_name = :newstate_name, zip_code = :newzip_code "
			+ "where id = 1", nativeQuery = true) 
		void updateCustomershipping(String newfirst_name,  String newlast_name, String newstreet_number, String newstreet_name, String newcity_name, 
				 String newstate_name, String newzip_code);
	
	@Query(value ="select * from customer where first_name like '%' + :first_name1 + '%' and last_name like '%' + :last_name1 + '%' and street_number like '%' +"
			+ ":street_number1 + '%' and street_name like '%' + :street_name1 + '%' and city_name like '%' + :city_name1 + '%' and state_name like "
			+ "'%' + :state_name1 + '%' and zip_code like '%' + :zip_code1 + '%' and contact_number like '%' + :contact_number1 + '%' and email "
			+ "like '%' + :email1 + '%' and password like '%%' ", nativeQuery=true)
	ArrayList<customer> findCustomer(String first_name1,  String last_name1, String street_number1, String street_name1, String city_name1, 
			 String state_name1, String zip_code1, String contact_number1, String email1);
	
	@Query(value = "select * from customer where first_name = :searchfirst_name", nativeQuery = true)
	List<customer> findCustomerByFirstName(String searchfirst_name);
	
	@Query(value = "select * from customer where last_name = :searchlast_name", nativeQuery = true)
	List<customer> findCustomerByLastName(String searchlast_name);
	
	@Query(value = "select * from customer where state_name = :searchstate_name", nativeQuery = true)
	List<customer> findCustomerByStateName(String searchstate_name);

	@Query(value = "select * from customer where zip_code = :searchzip_code", nativeQuery = true)
	List<customer> findCustomerByZipCode(String searchzip_code);
	

}
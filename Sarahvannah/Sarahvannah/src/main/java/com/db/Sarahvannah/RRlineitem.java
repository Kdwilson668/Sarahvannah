package com.db.Sarahvannah;




import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RRlineitem extends CrudRepository<lineItem, Integer>{
	@Modifying
	@Transactional
	@Query(value = "insert into line_item (name, order_id, price, customer_id, quantity)"
		+ "values('Lavender', 0, 7*:quantity, 1, :quantity)", nativeQuery = true) 
	void addLav(int quantity);
	@Modifying
	@Transactional
	@Query(value = "insert into line_item (name, order_id, price, customer_id, quantity)"
		+ "values('Aspen', 0, 7*:quantity, 1, :quantity)", nativeQuery = true) 
	void addAspen(int quantity);
	@Modifying
	@Transactional
	@Query(value = "insert into line_item (name, order_id, price, customer_id, quantity)"
		+ "values('Honey Oat', 0, 7*:quantity, 1, :quantity)", nativeQuery = true) 
	void addHoney(int quantity);
	@Modifying
	@Transactional
	void deleteById(int id);
	

	
}	
	

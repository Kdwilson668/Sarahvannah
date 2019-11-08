package com.db.Sarahvannah;




import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RRorders extends CrudRepository<orders, Integer>{
	@Modifying
	@Transactional
	@Query(value = "insert into orders (shipping, subtotal, line_item_id, customer_id, order_date)"
		+ "values(:shipping, :subtotal, :line_item_id, :customer_id, :order_date)", nativeQuery = true) 
	void postNewOrder(String shipping, float subtotal, int line_item_id, int customer_id, String order_date);
	
}
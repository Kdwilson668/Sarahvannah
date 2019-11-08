package com.db.Sarahvannah;



import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RRshipping extends CrudRepository<shipping, Integer>{
	/*
	void postNewshipping(int order_id, String shipping_address, String shipping_name, int customer_id,
			String billing_address);
	
	 * @Modifying
	 * 
	 * @Transactional
	 * 
	 * @Query(value =
	 * "insert into shipping (order_id, shipping_address, shipping_name, customer_id, billing_address)"
	 * +
	 * "values(:shipping, :shipping_address, :shipping_name, :customer_id, :billing_address)"
	 * , nativeQuery = true) void postNewOrder(int order_id, String
	 * shipping_address, String shipping_name, int customer_id, String
	 * billing_address);
	 */

//	void postNewshipping(int order_id, String shipping_address, String shipping_name, int customer_id,
		//	String billing_address);
}
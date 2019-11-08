package com.db.Sarahvannah.rest;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.db.Sarahvannah.RRcustomer;
import com.db.Sarahvannah.customer;
import com.db.Sarahvannah.RRlineitem;
import com.db.Sarahvannah.RRorders;
import com.db.Sarahvannah.lineItem;
import com.db.Sarahvannah.orders;
import com.db.Sarahvannah.RRproduct;
import com.db.Sarahvannah.RRshipping;
import com.db.Sarahvannah.product;
@RestController
public class SVcontrol2 {
	
	@Autowired
	RRcustomer ControlCustomer;
	@Nullable
	@Autowired
	RRlineitem ControlLineItem;
	@Autowired
	RRorders ControlOrders;
	@Autowired
	RRshipping ControlShipping;
	@Autowired
	RRproduct ControlProduct;

	
	
/*-------------------Customer Controls------------------*/	
	@CrossOrigin(origins="*")
	@PostMapping(value = "/NewSignUp")
    @ResponseStatus
    public void Post(@RequestParam("first_name") String first_name, @RequestParam("last_name") String last_name,
    		@RequestParam("email")String email, @RequestParam("contact_number")String contact_number, @RequestParam("password")String password) {
                
	      ControlCustomer.postNewSignUp(first_name, last_name, email, contact_number, password);
    }
	
	/*@PostMapping(value = "/Newcustomer/{first_name}/{last_name}/{street_number}/{street_name}/{city_name}/{state_name}/{zip_code}/{contact_number}/{email}/{password}")
    public boolean postNewcustomer(@PathVariable("first_name")String first_name, @PathVariable("last_name")String last_name,
            @PathVariable("street_number")String street_number, @PathVariable("street_name")String street_name, @PathVariable("city_name")String city_name,
            @PathVariable("state_name")String state_name, @PathVariable("zip_code")String zip_code, @PathVariable("contact_number")String contact_number,
            @PathVariable("email")String email, @PathVariable("password")String password) {
		boolean res = true;
        ControlCustomer.postNewcustomer(first_name, last_name, street_number, street_name, city_name, state_name, zip_code, contact_number, email, password);
        return res;
	}*/
	@CrossOrigin(origins="*")
	@PutMapping(value = "/Updatecustomer")
	@ResponseStatus
	public int updateCustomer(@RequestParam("first_name")String first_name, @RequestParam("last_name")String last_name,
			@RequestParam("street_number")String street_number, @RequestParam("street_name")String street_name, @RequestParam("city_name")String city_name,
			@RequestParam("state_name")String state_name, @RequestParam("zip_code")String zip_code, @RequestParam("contact_number")String contact_number,
			@RequestParam("email")String email) {
		ControlCustomer.updateCustomer(first_name, last_name, street_number, street_name, city_name, state_name, zip_code, contact_number, email);
        return 1;
	}
	@CrossOrigin(origins="*")
	@PostMapping(value = "/Updatecustomershipping/{first_name}/{last_name}/{street_number}/{street_name}/{city_name}/{state_name}/{zip_code}/{id}")
	@ResponseStatus
	public boolean updateCustomershipping(@PathVariable("first_name")String first_name, @PathVariable("last_name")String last_name,
            @PathVariable("street_number")String street_number, @PathVariable("street_name")String street_name, @PathVariable("city_name")String city_name,
            @PathVariable("state_name")String state_name, @PathVariable("zip_code")String zip_code, @PathVariable("id")int id) {
		boolean res = true;
        ControlCustomer.updateCustomershipping(first_name, last_name, street_number, street_name, city_name, state_name, zip_code);
        return res;
	}
	@CrossOrigin(origins="*")
	@GetMapping(value = "/FindCustomer")
	public ArrayList<customer> findCustomer(@RequestParam("first_name")String first_name, @RequestParam("last_name")String last_name,
			@RequestParam("street_number")String street_number, @RequestParam("street_name")String street_name, @RequestParam("city_name")String city_name,
			@RequestParam("state_name")String state_name, @RequestParam("zip_code")String zip_code, @RequestParam("contact_number")String contact_number,
			@RequestParam("email")String email) {
    		String first_name1 = first_name;
    		String last_name1 = last_name;
    		String street_number1 = street_number;
    		String street_name1 = street_name;
    		String city_name1 = city_name;
    		String state_name1 = state_name;
    		String zip_code1 = zip_code;
    		String contact_number1 = contact_number;
    		String email1 = email;
    		
		return ControlCustomer.findCustomer(first_name1, last_name1, street_number1, street_name1, city_name1, state_name1, zip_code1, contact_number1, email1);
        
	}

    @GetMapping(value = "/findFirstName/{text}")
    	public List<customer> findFirstName(@PathVariable("text") String text) {
    	String searchfirst_name = text;
    	return ControlCustomer.findCustomerByFirstName(searchfirst_name);
    }
	@GetMapping(value = "/findLastName/{text}")
		public List<customer> findLastName(@PathVariable("text") String text) {
		String searchlast_name = text;
		return ControlCustomer.findCustomerByLastName(searchlast_name);
    }
	@GetMapping(value = "/findStateName/{text}")
		public List<customer> findStateName(@PathVariable("text") String text) {
		String searchstate_name = text;
		return ControlCustomer.findCustomerByStateName(searchstate_name);
    }
	@GetMapping(value = "/findZipCode/{text}")
		public List<customer> findZipCode(@PathVariable("text") String text) {
		String searchzip_code = text;
		return ControlCustomer.findCustomerByZipCode(searchzip_code);
    }

/*-------------------Line Item Controls--------------*/
	@CrossOrigin(origins="*")
	@PostMapping(value="/addLav")
	@ResponseStatus
	public void addLav(@RequestParam("quantity")int quantity) {
		ControlLineItem.addLav(quantity);
	}
	
	@CrossOrigin(origins="*")
	@PostMapping(value="/addAspen")
	@ResponseStatus
	public void addAspen(@RequestParam("quantity")int quantity) {
		ControlLineItem.addAspen(quantity);
	}
	
	@CrossOrigin(origins="*")
	@PostMapping(value="/addHoney")
	@ResponseStatus
	public void addHoney(@RequestParam("quantity")int quantity) {
		ControlLineItem.addHoney(quantity);
	}
	@CrossOrigin(origins="*")
	@PostMapping(value="/dropFromCart")
	@ResponseStatus
	public void dropFromCart(@RequestParam("id")int id) {
		ControlLineItem.deleteById(id);
	}
	@CrossOrigin(origins="*")
	@GetMapping(value = "/showCart")
	public Iterable<lineItem> findCart() {
		return ControlLineItem.findAll();
	}
	
			
/*-----------Order Controls------------------*/	
	
	@GetMapping(value = "/findOrders")
		public Iterable<orders> findOrders(){
			
			
		//orders ThisOrder = ControlOrders.save(entity);
		//ControlLineItem.updateCustomerOrder( ThisOrder.getId(), Customer)
		return ControlOrders.findAll();
		}
		
	@PostMapping(value = "/NewOrder/{shipping}/{subtotal}/{line_item_id}/{customer_id}/{order_date}")
	 public boolean postNewOrder(@PathVariable("shipping")String shipping, @PathVariable("subtotal")float subtotal,
	            @PathVariable("line_item_id")int line_item_id, @PathVariable("customer_id")int customer_id, @PathVariable("order_date")
	 			String order_date)
	             {
			boolean res = true;
	        ControlOrders.postNewOrder(shipping, subtotal, line_item_id, customer_id, order_date);
	        return res;
	             }
			
/*-------------------Product Controls------------------*/	

	@GetMapping(value = "/findProduct")
		public Iterable<product> findProduct(){
		return ControlProduct.findAll();
		}
		
/*-------------------Shipping Controls------------
	@PostMapping(value = "/NewShipping/{order_id}/{shipping_address}/{shipping_name}/{customer_id}/{city_name}/{billing_address}")
	 public boolean postNewOrder(@PathVariable("order_id")int order_id, @PathVariable("shipping_address")String shipping_address,
	            @PathVariable("shipping_name")String shipping_name, @PathVariable("customer_id")int customer_id, @PathVariable("billing_address")
	 			String billing_address)
	             {
			boolean res = true;
	        ControlShipping.postNewshipping(order_id, shipping_address, shipping_name, customer_id, billing_address);
	        return res;
	}
	@GetMapping(value = "/findShipping")
		public Iterable<shipping> findShipping(){
		return ControlShipping.findAll();
		}		
-*/
}

package com.db.Sarahvannah;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class orders {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String shipping;
	private float subtotal;
	private int line_item_id;
	private int customer_id;
	private String order_date;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShipping() {
		return shipping;
	}
	public void setShipping(String shipping) {
		this.shipping = shipping;
	}
	public int getLine_Item_id() {
		return line_item_id;
	}
	public void setLine_Item_id(int lineItem_id) {
		this.line_item_id = lineItem_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
}
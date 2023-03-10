package edu.poly.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CartItem {
	
	@SuppressWarnings("unused")
	private int productId;
	
	@SuppressWarnings("unused")
	private String name;
	
	@SuppressWarnings("unused")
	private int quantity;
	
	@SuppressWarnings("unused")
	private  double unitPrice;

}

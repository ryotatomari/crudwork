package curdwork.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;

@EntityScan
@Data
public class Tentity {
	private int id;
	
	private String product_name;
	
	private int quantity;
	
	public Tentity(int id, String product_name, int quantity) {
		
		this.id = id;
		
		this.product_name = product_name;
		
		this.quantity = quantity;
	}

}

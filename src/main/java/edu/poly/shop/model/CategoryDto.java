package edu.poly.shop.model;

import java.io.Serializable;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class CategoryDto implements Serializable  {
	
	private Long categoryId;
	@NotEmpty
	@Min(value = 5)
	private String name;
	
}

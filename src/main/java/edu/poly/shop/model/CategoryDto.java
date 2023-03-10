package edu.poly.shop.model;

import java.io.Serializable;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




public class CategoryDto implements Serializable  {
	
	@SuppressWarnings("unused")
	private Long categoryId;
	@NotEmpty
	@Min(value = 5)
	private String name;
	
	public CategoryDto() {
		// TODO Auto-generated constructor stub
	}

	public CategoryDto(Long categoryId, @NotEmpty @Min(5) String name) {
		super();
		this.categoryId = categoryId;
		this.name = name;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

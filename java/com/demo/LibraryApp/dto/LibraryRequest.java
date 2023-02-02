package com.demo.LibraryApp.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class LibraryRequest {
	@Pattern(regexp = "^.{7}$", message="invalid author")
	String author;
	
	@NotBlank(message = "title should not be blank")
	String title;
	
	@NotNull(message = "cost should not be null")
	@Min(1)
	@Max(80)
	Double cost;
}
package com.demo.LibraryApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "LIBRARY_TBL")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class Library {
	@Id
	@GeneratedValue
	Integer bookId;
	String author;
	String title;
	Double cost;
	
	
}

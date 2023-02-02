package com.demo.LibraryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.LibraryApp.model.Library;

public interface LibraryRepository extends JpaRepository <Library, Integer> {
	Library findByTitle(String title);
	Library findByAuthor(String author);
	Library findByBookId(Integer id);
}

package com.demo.LibraryApp.service;

import java.util.List;

import com.demo.LibraryApp.dto.LibraryRequest;
import com.demo.LibraryApp.exception.LibraryNotFoundException;
import com.demo.LibraryApp.model.Library;


public interface LibraryService {
	List<Library> getAllBooks();
	Library getBookById(Integer id) throws LibraryNotFoundException;
	Library getBookByTitle(String title) throws LibraryNotFoundException;
	Library getBookByAuthor(String author) throws LibraryNotFoundException;
	Library createBook(LibraryRequest bookRequest);
	Library updateBook(LibraryRequest bookRequest) throws LibraryNotFoundException;
	void deleteBook(Integer id) throws LibraryNotFoundException;
	
}

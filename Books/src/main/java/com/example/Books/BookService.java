package com.example.Books;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {
	
	@Autowired
	public BooksRepository repository;

	public List<Books> getAllBooks() {
		List<Books> books=new ArrayList<>();
		repository.findAll().forEach(books::add);
		return books;
		
	}
	

	public void addBooks(Books books) {
		// TODO Auto-generated method stub
		repository.save(books);
	}
	

	public void updateBooks(String id, Books books) {
		// TODO Auto-generated method stub
		repository.save(books);
	}
	
	public void deleteBooks(String id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}

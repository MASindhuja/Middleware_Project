package com.example.Books;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
	@Autowired
	private BookService service;
	
	@RequestMapping(method=RequestMethod.GET,value="/msg")
	
	public String message(){
		return "hello world";
		
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/books")
	
	public List<Books> getAllBooks(){
		return service.getAllBooks();
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/books")
	public void addBooks(@RequestBody Books books) {
		service.addBooks(books);
	}
	@RequestMapping(method=RequestMethod.POST, value="/books/{id}")
	public void addBooks(@PathVariable String id,@RequestBody Books books) {
		service.updateBooks(id,books);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/books/{id}")
	public void DeleteBooks(@PathVariable String id) {
		service.deleteBooks(id);
	}
}

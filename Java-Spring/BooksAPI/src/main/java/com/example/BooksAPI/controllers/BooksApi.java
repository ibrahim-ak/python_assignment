package com.example.BooksAPI.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.BooksAPI.models.Book;
import com.example.BooksAPI.services.BookServices;

@RestController
public class BooksApi {
	private final BookServices bookService;

	public BooksApi(BookServices bookService) {
		this.bookService = bookService;
	}

	// other methods removed for brevity
	@RequestMapping(value = "/api/books/{id}", method = RequestMethod.PUT)
	public Book update(@PathVariable("id") Long id, @RequestParam(value = "title") String title,
			@RequestParam(value = "description") String desc, @RequestParam(value = "language") String lang,
			@RequestParam(value = "pages") Integer numOfPages) {
		Book book = bookService.updateBook(id, title, desc, lang, numOfPages);

		return book;
	}
	
	@RequestMapping("value/getbook_by_title/{title}")
	public List<Book> getbyTitle(@PathVariable("title") String title )
	{	
		return bookService.getBookByTitle(title);
	}

	@RequestMapping(value = "/api/books/{id}", method = RequestMethod.DELETE)
	public void destroy(@PathVariable("id") Long id) {
		bookService.destroy(id);
	
	}

	@RequestMapping("/api/books")
	public List<Book> index() {
		return bookService.allBooks();
	}

	@RequestMapping(value = "/api/books", method = RequestMethod.POST)
	public Book create(@RequestParam(value = "title") String title, @RequestParam(value = "description") String desc,
			@RequestParam(value = "language") String lang, @RequestParam(value = "pages") Integer numOfPages) {
		Book book = new Book(title, desc, lang, numOfPages);
		return bookService.createBook(book);
	}

	@RequestMapping("/api/books/{id}")
	public Book show(@PathVariable("id") Long id) {
		Book book = bookService.findBook(id);
		return book;
	}

}

package com.example.BooksAPI.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.BooksAPI.models.Book;


	@Repository
	public interface BookRepo extends CrudRepository<Book, Long>{
	    // this method retrieves all the books from the database
	    @Override
		List<Book> findAll();
	    // this method finds books with descriptions containing the search string
	    List<Book> findByDescriptionContaining(String search);
	    // this method counts how many titles contain a certain string
	    Long countByTitleContaining(String search);
	    // this method deletes a book that starts with a specific title
	    Long deleteByTitleStartingWith(String search);
	    Book  findById(long id );
//	    Book getBookByTitle(String title);
	    List <Book>findByTitle(String title);
	}



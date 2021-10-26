package com.bookapp.service;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

import com.bookapp.bean.Book;
import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;

public class BookImpl implements BookInter {

	List<Book> bookList = new ArrayList<>();
	List<Book> filteredAuthorList = new ArrayList<>();// test
	List<Book> filteredCategoryList = new ArrayList<>();// test

	@Override
	public void addBook(Book book) {
		bookList.add(book);
	}

	@Override
	public List<Book> getAllBooks() {
		Collections.sort(bookList, (book1, book2) -> {
			return book1.getTitle().compareTo(book2.getTitle());
		});
		return bookList;
	}

	@Override
	public List<Book> getBookbyAuthor(String author) throws AuthorNotFoundException {

		try {

			for (Book book : bookList) {
				if (book.getAuthor().equalsIgnoreCase(author)) {
					filteredAuthorList.add(book);
				} else {
					throw new AuthorNotFoundException("author not found :there is no author");
				}
			}

		}

		catch (AuthorNotFoundException e) {
			System.out.println(e.getMessage());
		}

		return filteredAuthorList;

	}

	@Override
	public List<Book> getBookbycategory(String category) throws CategoryNotFoundException {

		try {

			for (Book book : bookList) {
				if (book.getCategory().equalsIgnoreCase(category)) {
					filteredCategoryList.add(book);
				} 
				else {

					throw new CategoryNotFoundException("category not found: there is no category");
				}
			}

		}

		catch (CategoryNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return filteredCategoryList;
	}

}

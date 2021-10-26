package com.bookapp.main;

import java.util.List;
import java.util.Scanner;

import com.bookapp.bean.Book;
import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;
import com.bookapp.service.BookImpl;
import com.bookapp.service.BookInter;

public class Client {

	public static void main(String[] args) throws AuthorNotFoundException, CategoryNotFoundException {
		BookInter bookInter = new BookImpl();
//		System.out.println(bookInter.getAllBooks());
		// Number of books
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number of books to store: ");
		int numberOfBooks = scanner.nextInt();

		for (int i = 0; i < numberOfBooks; i++) {
			Book book = new Book();

			scanner.nextLine();
			System.out.println("Enter Book Title: ");
			String title = scanner.nextLine();

			book.setTitle(title);

			System.out.println("Enter Author Name: ");
			String author = scanner.nextLine();

			book.setAuthor(author);

			System.out.println("Enter Book Category: ");
			String category = scanner.nextLine();

			book.setCategory(category);

			System.out.println("Enter BookId: ");
			int bookId = scanner.nextInt();

			book.setBookid(bookId);

			System.out.println("Enter Book Price: ");
			int price = scanner.nextInt();
			System.out.println();

			book.setPrice(price);

			bookInter.addBook(book);

		}

		int k = 0;// k is for looping if input is wrong
		System.out.println("Do you want to filter books If YES Press 1|NO Press 2");
		int searchFilter = scanner.nextInt();

		switch (searchFilter) {

		case 1:
			k = 0;
			while (k < 1) {
				System.out.println("Search By Author (or) Category");
				String decision1 = scanner.next();

				if (decision1.equalsIgnoreCase("Author")) {
					System.out.println("Enter author name to search: ");
					scanner.nextLine();
					String authorNameSearch = scanner.nextLine();
					List authName = bookInter.getBookbyAuthor(authorNameSearch);
					if (!authName.isEmpty()) {
						System.out.println(authName);

					}

					k += 1;
					break;
				}

				else if (decision1.equalsIgnoreCase("Category")) {
					System.out.println("Enter category name to search: ");

					String categorySearch = scanner.next();
					System.out.println(bookInter.getBookbycategory(categorySearch));
					List catergoryName = bookInter.getBookbyAuthor(categorySearch);
					if (!catergoryName.isEmpty()) {
						System.out.println(catergoryName);

					}
					k += 1;
					break;
					
					
				} else {
					System.out.println("Please enter correct input");
					System.out.println();
				}

			}
			break;

		case 2:
			k = 0;
			System.out.println("You have added: " + numberOfBooks + " Books");
			System.out.println(bookInter.getAllBooks());
			System.exit(0);

		default:
			System.out.println("Please enter the correct input");
			k += 1;
		}

		scanner.close();

	}

}

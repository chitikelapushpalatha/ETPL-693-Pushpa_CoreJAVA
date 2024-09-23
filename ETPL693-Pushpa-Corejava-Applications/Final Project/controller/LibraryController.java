package com.capg.library.controller;

import java.util.List;
import java.util.Scanner;

import com.capg.library.bean.BookBean;
import com.capg.library.service.LibraryService;

public class LibraryController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryService libraryService = new LibraryService();

        int choice = 0;
        while (choice != 5) {
            System.out.println("1. Add New Book");
            System.out.println("2. View All Books");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    System.out.print("Enter Book Title: ");
                    String title = scanner.next();
                    System.out.print("Enter Author Name: ");
                    String author = scanner.next();
                    libraryService.addBook(bookId, title, author);
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    List<BookBean> books = libraryService.viewAllBooks();
                    for (BookBean book : books) {
                        System.out.println("Book ID: " + book.getBookId() + ", Title: " + book.getTitle() +
                                ", Author: " + book.getAuthor() + ", Available: " + book.isAvailable());
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Borrow: ");
                    int borrowId = scanner.nextInt();
                    if (libraryService.borrowBook(borrowId)) {
                        System.out.println("Book borrowed successfully!");
                    } else {
                        System.out.println("Book is not available or invalid ID.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = scanner.nextInt();
                    if (libraryService.returnBook(returnId)) {
                        System.out.println("Book returned successfully!");
                    } else {
                        System.out.println("Invalid Book ID.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
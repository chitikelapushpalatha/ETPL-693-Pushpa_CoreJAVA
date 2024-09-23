package com.capg.library.service;

import com.capg.library.bean.BookBean;
import com.capg.library.dao.LibraryDAO;

import java.util.List;

public class LibraryService {
    LibraryDAO libraryDAO = new LibraryDAO();

    public int addBook(int bookId, String title, String author) {
        BookBean book = new BookBean();
        book.setBookId(bookId);
        book.setTitle(title);
        book.setAuthor(author);
        book.setAvailable(true);
        return libraryDAO.addBook(book);
    }

    public List<BookBean> viewAllBooks() {
        return libraryDAO.getAllBooks();
    }

    public boolean borrowBook(int bookId) {
        int result = libraryDAO.borrowBook(bookId);
        return result != 0;
    }

    public boolean returnBook(int bookId) {
        int result = libraryDAO.returnBook(bookId);
        return result != 0;
    }
}
package com.capg.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.capg.library.bean.BookBean;

public class LibraryDAO {

    public int addBook(BookBean book) {
        try (Connection con = LibraryDBConnection.getConnection()) {
            String query = "INSERT INTO books (book_id, title, author, is_available) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, book.getBookId());
            pstmt.setString(2, book.getTitle());
            pstmt.setString(3, book.getAuthor());
            pstmt.setBoolean(4, book.isAvailable());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List<BookBean> getAllBooks() {
        List<BookBean> books = new ArrayList<>();
        try (Connection con = LibraryDBConnection.getConnection()) {
            String query = "SELECT * FROM books";
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                BookBean book = new BookBean();
                book.setBookId(rs.getInt("book_id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setAvailable(rs.getBoolean("is_available"));
                books.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }

    public int borrowBook(int bookId) {
        try (Connection con = LibraryDBConnection.getConnection()) {
            String query = "UPDATE books SET is_available = false WHERE book_id = ? AND is_available = true";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, bookId);
            return pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int returnBook(int bookId) {
        try (Connection con = LibraryDBConnection.getConnection()) {
            String query = "UPDATE books SET is_available = true WHERE book_id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, bookId);
            return pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
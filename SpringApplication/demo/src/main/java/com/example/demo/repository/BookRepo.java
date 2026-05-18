package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book , Long> {
    public Book getBooksById(Long id);

    default Book saveBook(Book bookDetails){
        Book book = new Book();
        book.setAuthor(bookDetails.getAuthor());
        book.setBookName(bookDetails.getBookName());
        book.setPrice(bookDetails.getPrice());
        save(book);
        return book;
    }
}

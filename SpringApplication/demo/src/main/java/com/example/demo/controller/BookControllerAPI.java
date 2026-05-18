package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import jdk.jfr.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book/")

public class BookControllerAPI {

    @Autowired
    BookService bookService;

    @GetMapping(value= "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getBookById(@PathVariable Long id){
         return bookService.getBookById(id);
     }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public Book saveBook(@RequestBody Book book){
        return bookService.save(book);
    }



}

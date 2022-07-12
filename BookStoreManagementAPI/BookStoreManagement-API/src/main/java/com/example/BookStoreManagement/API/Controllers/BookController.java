package com.example.BookStoreManagement.API.Controllers;

import java.util.*;
import com.example.BookStoreManagement.API.Repository.BookRepository;
import com.example.BookStoreManagement.API.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/book")

public class BookController {

    @Autowired
    BookRepository b;

    @GetMapping("/")
    List<Book> allBooks(){
          return b.findAll();
    }

    @PostMapping("/addBook")
    Book addBook(@RequestBody Book st){
          st=b.save(st);
         return st;
    }       //swagger-io

    @GetMapping("/isbn/{isbn}")
    public Book getBookByIsbn(@PathVariable Long isbn){
        Book st=b.findByIsbn(isbn);
        return st;
    }

    @DeleteMapping("/deleteBook/{isbn}")
    public String deleteBook(@PathVariable long isbn){
        try{
            b.deleteById((long)isbn);   //by primary key 'isbn' is p key
        }catch(Exception e){
            return "Not Found";
        }   
        return "Done"; 
    }

    @GetMapping("/name/{name}")
    public Book getBookByname(@PathVariable String name){
        Book st=b.findByName(name);
        return st;
    }
}


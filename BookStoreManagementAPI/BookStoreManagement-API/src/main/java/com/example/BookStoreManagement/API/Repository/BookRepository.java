package com.example.BookStoreManagement.API.Repository;

import com.example.BookStoreManagement.API.Entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{

    Book findByIsbn(Long isbn);

    Book findByName(String name);
    
    
}

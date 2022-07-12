package com.example.BookStoreManagement.API.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_book")

public class Book {

    public Book(){}
    
    public Book(String name, String author, int edition) {
        this.name = name;
        this.author = author;
        this.edition = edition;
    }
    @Id //to mention this is primary key
    @GeneratedValue//to automatically create the primary key
    @Column(name="ISBN")
    private long isbn;

    @Column(name="NAME")
    private String name;

    @Column(name="AUTHOR")
    private String author;

    @Column(name="EDITION")
    private int edition;

    

    public long getIsbn() {
        return isbn;
    }
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getEdition() {
        return edition;
    }
    public void setEdition(int edition) {
        this.edition = edition;
    }


    @Override
    public String toString() {
        return "Book [author=" + author + ", edition=" + edition + ", isbn=" + isbn + ", name=" + name + "]";
    }

    


}

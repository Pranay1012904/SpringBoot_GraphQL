package com.springboot.graphQL.controller;

import com.springboot.graphQL.records.Book;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    @QueryMapping
    public List<Book> books(){
        return Book.books;
    }
}
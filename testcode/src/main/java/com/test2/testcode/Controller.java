package com.test2.testcode;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.services.BookService;


    
    @RestController
    public class Controller {
        
        private BookService bookService=new BookService();

        @GetMapping("/books")
        
        public List<Book> getBooks()
        {
            
            return this.bookService.getAllBooks();

        }
        @GetMapping("/books/{Id}")
        public Book getBook(@PathVariable("Id") int Id)
        {
            return bookService.getBookById(Id);
        }
        
    }
    


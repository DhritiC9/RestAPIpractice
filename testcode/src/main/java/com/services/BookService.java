package com.services;
import java.util.ArrayList;
import java.util.List;
import com.services.BookService;
    
import com.test2.testcode.Book;
public class BookService {
    private static List<Book> list= new ArrayList<>();

    static{
        list.add(new Book(1, "java","tom"));
        list.add(new Book(3, "c++","mat"));
        list.add(new Book(4, "javascript","mason"));
        list.add(new Book(5, "swift","toby"));
    }

    //get all books 
    public List<Book> getAllBooks()
    {
        return list;
    }
    // get single book by id
    public Book getBookById(int Id)
    {
        Book book= null;
        book=list.stream().filter(e->(e.getId()==Id)).findFirst().get();
        return book;
    }
}

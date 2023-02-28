
package com.test2.testcode;


    

public class Book{
    private int Id;
    private String title;
    private String author;
    public Book(int Id, String title, String author) {
        this.Id = Id;
        this.title = title;
        this.author = author;
    }
    public Book() {
    }
    
    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book [id=" + Id + ", title=" + title + ", author=" + author + "]";
    }
    



    
}
 
    


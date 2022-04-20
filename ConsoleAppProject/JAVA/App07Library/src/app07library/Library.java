/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app07library;
import java.io.*;
import java.util.*;
/**
 *
 * @author willi
 */
public class Library {
    // Reference to refer to list of books
    private final List<Book> books;
 
    // Library class contains list of books
    Library(List<Book> books)
    {
 
        // Referring to same book as
        // this keyword refers to same instance itself
        this.books = books;
    }
 
    // Method
    // To get total number of books in library
    public List<Book> getTotalBooksInLibrary()
    {
 
        return books;
    }
}

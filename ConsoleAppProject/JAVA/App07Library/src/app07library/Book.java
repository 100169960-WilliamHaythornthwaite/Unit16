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
public class Book {
    // Attributes of book
    public String title;
    public String author;
 
    // Constructor of Book class
    Book(String title, String author)
    {
 
        // This keyword refers to current instance itself
        this.title = title;
        this.author = author;
    }
}

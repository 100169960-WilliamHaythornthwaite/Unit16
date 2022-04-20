/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app06college;
import java.io.*;
import java.util.*;
/**
 *
 * @author willi
 */
public class Student {
      // Attributes of student
    String name;
    int id;
    String dept;
 
    // Constructor of student class
    Student(String name, int id, String dept)
    {
 
        // This keyword refers to current instance itself
        this.name = name;
        this.id = id;
        this.dept = dept;
    }
}

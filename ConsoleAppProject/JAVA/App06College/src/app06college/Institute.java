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
public class Institute {
     String instituteName;
    private List<Department> departments;
 
    // Constructor of institute class
    Institute(String instituteName,List<Department> departments)
    {
        // This keyword refers to current instance itself
        this.instituteName = instituteName;
        this.departments = departments;
    }
 
    // Method of Institute class
    // Counting total students of all departments
    // in a given institute
    public int getTotalStudentsInInstitute()
    {
        int noOfStudents = 0;
        List<Student> students;
 
        for (Department dept : departments) {
            students = dept.getStudents();
 
            for (Student s : students) {
                noOfStudents++;
            }
        }
 
        return noOfStudents;
    }
}

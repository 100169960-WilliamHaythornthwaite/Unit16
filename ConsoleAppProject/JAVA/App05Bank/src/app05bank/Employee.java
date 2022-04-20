/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app05bank;

/**
 *
 * @author willi
 */
public class Employee {
    private String name;
    // Employee name
    Employee(String name)
    {
        // This keyword refers to current instance itself
        this.name = name;
    }
 
    // Method of Employee class
    public String getEmployeeName()
    {
        // returning the name of employee
        return this.name;
    }
}


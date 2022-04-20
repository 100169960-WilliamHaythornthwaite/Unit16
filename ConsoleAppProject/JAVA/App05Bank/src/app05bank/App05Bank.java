/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app05bank;

/**
 *
 * @author willi
 */
public class App05Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creating objects of bank and Employee class
        Bank bank = new Bank("ICICI");
        Employee emp = new Employee("Ridhi");
 
        // Print and display name and
        // corresponding bank of employee
        System.out.println(emp.getEmployeeName()
                           + " is employee of "
                           + bank.getBankName());
    }
    
}



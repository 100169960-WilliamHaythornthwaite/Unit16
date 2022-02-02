/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author 100169960
 */
public class mainClass {
        public static void main(String[] args){
            Calculator c1 = new Calculator();
            Calculator c2 = new Calculator();
            
            
            c1.name = "Calc1";
            c2.name = "Calc2";
            
            System.out.println(c1.name +" calculated "+ c1.add(3,4));
            System.out.println(c2.name + " calculated " + c2.modulus(29,5));



    }
    
}

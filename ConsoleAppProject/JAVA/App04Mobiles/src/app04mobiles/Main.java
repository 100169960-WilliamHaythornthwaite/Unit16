/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app04mobiles;

/**
 *
 * @author 100169960
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Samsung s = new Samsung();
        s.setColour("Black");
        s.setCost(30000);
        s.setRAM("4GB");
        s.setAndroid_Version("Andoid Pie");
        System.out.println("Samsung Details: ");
        System.out.println("Colour: "+s.getColour());
        System.out.println("Cost: "+ s.getCost());
        System.out.println("RAM"+ s.getRAM());
        System.out.println(" Samsung android version: " + s.getAndroid_Version());
        
    }
    
}

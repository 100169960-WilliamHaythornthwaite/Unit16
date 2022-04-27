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
        Nokia n = new Nokia();
        Xiaomi x = new Xiaomi();
        
        s.setAndroid_Version("Android Pie");
        s.setColour("Black");
        s.setCost(3000);
        s.setRAM("4GB");
        System.out.println("Samsung mobile details");
        System.out.println("Cost: "+s.getCost());
        System.out.println("Colour: "+s.getColour());
        System.out.println("RAM: "+s.getRAM());
        System.out.println("Android version: "+s.getAndroid_Version());
        
        n.setColour("Silver");
        n.setCost(40000);
        n.setRAM("4GB");
        n.setAndroid_Version("Andoid Msarshmelo");

        x.setColour("Red");
        x.setCost(50000);
        x.setRAM("6GB");
        x.setAndroid_Version("Andoid Kitkat");

        System.out.println("Samsung Details: ");
        System.out.println("Colour: "+s.getColour());
        System.out.println("Cost: "+ s.getCost());
        System.out.println("RAM"+ s.getRAM());
        System.out.println("RAM: "+ s.getRAM());
        System.out.println(" Samsung android version: " + s.getAndroid_Version());

        System.out.println("Nokia Details: ");
        System.out.println("Colour: "+n.getColour());
        System.out.println("Cost: "+ n.getCost());
        System.out.println("RAM: "+ n.getRAM());
        System.out.println(" Nokia android version: " + n.getAndroid_Version());

        System.out.println("Xiaomi Details: ");
        System.out.println("Colour: "+x.getColour());
        System.out.println("Cost: "+ x.getCost());
        System.out.println("RAM: "+ x.getRAM());
        System.out.println(" Xiaomi android version: " + x.getAndroid_Version());
    }
    
}

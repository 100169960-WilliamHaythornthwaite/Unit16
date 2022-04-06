/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cars;

// Java Program to Illustrate Difference between
// Aggregation and Composition
 
// Importing I/O classes
// Engine class which will
// be used by car. so 'Car'
// class will have a field
// of Engine type.
class Engine {
 
    // Method to starting an engine
    public void work()
    {
 
        // Print statement whenever this method is called
        System.out.println(
            "Engine of car has been started ");
    }
}
 
// Class 2
// Engine class
final class Car {
 
    // For a car to move,
    // it needs to have an engine.
 
    // Composition
    private final Engine engine;
 
    // Note: Uncommented part refers to Aggregation
    // private Engine engine;
 
    // Constructor of this class
    Car(Engine engine)
    {
 
        // This keywords refers to same instance
        this.engine = engine;
    }
 
    // Method
    // Car start moving by starting engine
    public void move()
    {
 
        // if(engine != null)
        {
            // Calling method for working of engine
            engine.work();
 
            // Print statement
            System.out.println("Car is moving ");
        }
    }
}
 
// Class 3
// Main class
class GFG {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Making an engine by creating
        // an instance of Engine class.
        Engine engine = new Engine();
 
        // Making a car with engine so we are
        // passing a engine instance as an argument
        // while creating instance of Car
        Car car = new Car(engine);
 
        // Making car to move by calling
        // move() method inside main()
        car.move();
    }
}

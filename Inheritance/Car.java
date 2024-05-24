package Inheritance;

public class Car extends Vehicle {

    int wheels = 4;
    
    Car(String name, int year){
        super(name, year); // super() is a method which is used to initialize an instance of a parent class within a sub class
    }


}

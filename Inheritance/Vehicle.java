package Inheritance;

public abstract class Vehicle { // This class is abstract hence there cannot be an instance of this class called in the main function
    String name;
    int year;
    boolean isDriving = false;
    
    Vehicle(String name, int year){
        this.name = name;
        this.year = year;
    }

    void drive(){
        this.isDriving = true;
        System.out.println(this.name + " is being driven");
    }

    void stop(){
        this.isDriving = false;
        System.out.println(this.name + " is stopped");
    }
}

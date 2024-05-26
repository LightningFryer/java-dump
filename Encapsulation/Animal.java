package Encapsulation;

// This is an abstract class and hence we can just create an instance of this in the main code
public abstract class Animal {
    // These variables are private and hence can never be accessed in the main code so we need to use getters and setters to manipulate these
    private String name;
    private int age;
    private int numberOfLegs;


    // Defining the setters
    void setAnimalName(String inputAnimalName){
        this.name = inputAnimalName;
    }

    void setAnimalAge(int inputAnimalAge){
        this.age = inputAnimalAge;
    }

    void setAnimalLegs(int inputNumberOfLegs){
        this.numberOfLegs = inputNumberOfLegs;
    }

    // Defining the getters
    String getAnimalName(){
        return this.name;
    }

    int getAnimalAge(){
        return this.age;
    }

    int getAnimalLegs(){
        return this.numberOfLegs;
    }

}

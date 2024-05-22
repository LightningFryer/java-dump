package Classes;

public class Human {
    // Delcaration of constructor/method variables
    String name;
    int age;
    
    // This is a constrcutor. It basically handles the initialization of a class instance in the Main.java file
    // But first what is 'this'? 'this' is basically a keyword to refer to the object's atrributes. Think of it as a placeholder or
    // a temporary name to be used instead of the actual class's variable name in the main code. If you look in the Main.java file
    // you'll see that there is a class instance of Human called rahul and I can access its name by writing rahul.name
    // Same thing here but with 'this' instead

    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Methods of this class
    void getAge(){
        System.out.println(this.name + " is " + this.age + " years old");
    }

    void modifyName(String newName){
        System.out.println("Name of " + this.name + " has been modified");
        this.name = newName;
    }

    void modifyAge(int newAge){
        this.age = newAge;
        System.out.println("Age of " + this.name + " has been modified");
    }

}

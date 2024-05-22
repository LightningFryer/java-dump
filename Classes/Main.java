package Classes;

public class Main {
    public static void main(String[] args) {
        // Initialization of a new instance of the Human class
        Human human_1 = new Human("Rahul", 18);
        Human human_2 = new Human("Sonia", 19);

        System.out.println(human_1.name + " is " + human_1.age + " years old");
        System.out.println(human_2.name + " is " + human_2.age + " years old");

        // We call also achieve the same thing by using a method instead
        human_1.getAge();
        human_2.getAge();

        // Let's modify their names and age using methods too
        human_1.modifyAge(22);
        System.out.println(human_1.name + " is now " + human_1.age + " years old");

        human_2.modifyName("John");
    }
}

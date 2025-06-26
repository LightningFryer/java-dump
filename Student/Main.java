package Student;

class Student{
    int reg;
    static int student = 1;
    String name;
    String doj;
    short sem;
    float gpa;
    float cgpa;

    Student(String name, String doj, short sem, float gpa, float cgpa){
        this.name = name;
        this.doj = doj;
        this.sem = sem;
        this.gpa = gpa;
        this.cgpa = cgpa;
    }

    void assignReg(){
        String[] splitDoj = this.doj.split("/");
        // char[] year = new char[2];
        // year[0] = splitDoj[2].charAt(2);
        // year[1] = splitDoj[3].charAt(2);
        this.reg += splitDoj[2].String.valueOf(char);
    }
}

public class Main {
    
}

package lab_5;
import java.util.Scanner;

class Student{
    static int count = 1;
    int reg_no;
    String name;
    String dob;
    short semester;
    float gpa, cgpa;

    void calc_reg(){
        int join_date = Integer.parseInt(this.dob.substring(8, 9));
        int result = (join_date*1000) + Student.count;
        this.reg_no = result;
        Student.count++;
    }

    Student(String name, String dob, int i, float gpa, float cgpa){
        this.name = name;
        this.dob = dob;
        this.semester = i;
        this.gpa = gpa;
        this.cgpa = cgpa;
        calc_reg();
    }

}

public class Q3 {
    public static void main(String[] args) {
        Student stu = new Student("Yes", "20/12/2005", 1, 10, 10);
        System.out.println(stu.reg_no);
    }
}

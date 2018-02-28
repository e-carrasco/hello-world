package com.ex.pojo.run;

import java.util.*;

import com.ex.io.StudentIO;
import com.ex.pojo.Student;

public class Main {
        
public static void main(String[] args) {
        Student a = new Student("Genesis", 55);
        Student b = new Student("Billy", 75);
        Student c = new Student("Silk", 23);
        Student d = new Student("Gardens", 12);
        
        StudentIO io = new StudentIO();
        
        io.writeStudent(a);
        io.writeStudent(b);
        io.writeStudent(c);
        io.writeStudent(d);
        
        List<Student> students = io.readStudents();
        for(Student s : students) {
                System.out.println(s.getName() + " is " + String.valueOf( s.getAge() ) );
        }
        
} // end of main function

public static void getNewStudent() {
        Scanner sc = new Scanner(System.in);
        String newStudentName = new String();
        int newStudentAge = 0;
        Student s = new Student();
        System.out.print("Input a Student name : ");
        if(sc.hasNextLine()) {
                newStudentName = sc.nextLine();
        }
        System.out.print("Input age : ");
        if(sc.hasNextInt()) {
                newStudentAge = sc.nextInt();
        }
        sc.close();
        s.setName(newStudentName);
        s.setAge(newStudentAge);
        
        StudentIO io = new StudentIO();
        io.writeStudent(s);
}

}// end of class Main

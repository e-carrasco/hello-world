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
                
        }

}

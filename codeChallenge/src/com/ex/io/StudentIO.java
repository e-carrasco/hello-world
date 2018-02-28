package com.ex.io;

import java.io.*;
import java.util.*;

import com.ex.pojo.Student;

public class StudentIO {
        
        static final String filename = "/src/data/students.dat";
        
        public void writeStudent(Student student) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true) ) ){
                        bw.write(student.toString());
                } catch (IOException e) {
                        e.printStackTrace();
                } 
        }
        
        public List<Student> readStudents(){
                List<Student> students = new ArrayList<Student>();
                try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                        
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();
                }
                return students;
        }

}

package com.ex.pojo;

import java.io.Serializable;

public class Student implements Serializable{
        
        /**
         * 
         */
        private static final long serialVersionUID = 3172927766523945461L;
        private String name;
        private int age;
        
        public Student() {}
        
        public Student(String name, int age) {
                super();
                this.name = name;
                this.age = age;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        @Override
        public String toString() {
                return name + "@" + age;
        }
        
        
}

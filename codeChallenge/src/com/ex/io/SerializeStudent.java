package com.ex.io;

import java.io.*;

import com.ex.pojo.SecureStudent;

public class SerializeStudent {
        
        static final String file = "./serialized.txt";
        
        public static void main(String[] args) {
                SecureStudent s = new SecureStudent();
                
                s.setName("Myself");
                s.setPassword("reallybad");
                s.setUsername("yum");
                
                serialize(s);
                
                System.out.println(s);
                
        }
        
        static void serialize(SecureStudent student) {
                try (ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream(file) ) ) {
                        oos.writeObject(student);
                        
                } catch (FileNotFoundException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
        }

        static SecureStudent deserialize() {
                SecureStudent s = new SecureStudent();
                try (ObjectInputStream ois = new ObjectInputStream(
                                new FileInputStream(file))){
                        s = (SecureStudent) ois.readObject();
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();
                } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                }
                return s;
        }
}

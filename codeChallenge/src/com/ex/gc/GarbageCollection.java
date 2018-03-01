package com.ex.gc;

public class GarbageCollection {

        public static void main(String[] args) {
                String a = new String("stuff");
                String b = new String("alphabet");
                String c = new String("yum");
                
                a = null;
                
                //send request to jvm to run garbage collector
                System.gc();
                
                //another way to request garbage collection
                Runtime.getRuntime().gc();
                System.out.println("end of main");
        }
        
        /*
         * (non-Javadoc)
         * @see java.lang.Object.Objectfinalize()
         * 
         * finalize method is called on an object once
         * before it is garbage collected
         */
        @Override
        protected void finalize() throws Throwable {
                System.out.println("Garbage collector is called on " + this);
        }

}

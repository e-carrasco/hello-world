package codeChallenges;

import java.util.*;

public class ChallengeOne {
        public static void doOperation(int opt) {
                //byte[] userIO = new byte[255];
                int num = -1;
                String userStr = null;
                switch (opt) {
                case 1 :
                        System.out.print("Please input a whole number : ");
                        try {
                                Scanner sc = new Scanner(System.in);
                                if(sc.hasNextInt())
                                        num = sc.nextInt();
                                sc.close();
                        } catch (IllegalStateException rd_err) {
                                
                        }
                        double result = Math.sqrt(num);
                        System.out.println("The square root of " + String.valueOf(num) + " is " + String.valueOf(result));
                        break;
                case 2 :
                        //Calendar now = Calendar.getInstance();
                        Date date = new Date();
                        System.out.println(date.toString());
                        break;
                case 3 : 
                        try {
                                String inpLine = null;
                                int count = 0;
                                System.out.print("Give me a string : ");
                                Scanner sc = new Scanner(System.in);
                                if(sc.hasNextLine()) {
                                        inpLine = sc.nextLine();
                                }
                                sc.close();
                                String [] words = inpLine.split(" ");
                        } catch (IllegalStateException rd_err) {
                                
                        }
                        break;
                default : break;
                }
        }
        public static void main(String[] args) {
                doOperation(3);
        }

}

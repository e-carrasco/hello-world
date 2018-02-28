package codeChallenges;

public class ChallengeTwo {
        
        public static String findDay(int year, int month, int day) {
                int dayOfWeek = -1;
                int temp = (26*(month + 1))/10;
                int yrOfCentury = (year % 100);
                int century = year/100;
                
                if((month == 1) || (month == 2)) {
                        month = month + 12;
                }
                
                dayOfWeek = (day + temp + yrOfCentury + (yrOfCentury/4) + (century/4) + 5*century) % 7;
                switch(dayOfWeek){
                case 0 : return "Saturday";
                case 1 : return "Sunday";
                case 2 : return "Monday";
                case 3 : return "Tuesday";
                case 4 : return "Wednesday";
                case 5 : return "Thursday";
                case 6 : return "Friday";
                }
                return null;
        }
        
        public static void main(String[] args) {
                
        }
}

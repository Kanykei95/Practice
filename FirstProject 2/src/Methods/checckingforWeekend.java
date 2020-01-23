package Methods;

public class checckingforWeekend {
    //Write a method that will tell you if it is the weekday or not. The method takes a String, Saturday and Sunday
    // are the only weekend days
    //Create a method that will count how many even numbers there is from the given array and return the value

    public static void main(String[] args) {
        System.out.println(valid("monday"));
    }


    public static boolean valid(String str) {
        String[] weekday = {"monday", "tuesday", "wednesday", "thursday", "friday"};
        String[] weekend = {"Saturday", "Sunday"};

        for (String name : weekday) {
            if (str.equals("monday") || name.equals("tuesday") || name.equals("wednesday") || name.equals("thursday")
                    || name.equals("friday")) {
                return true;
            } else {
                return false;
            }


        }
        return false;
    }

}




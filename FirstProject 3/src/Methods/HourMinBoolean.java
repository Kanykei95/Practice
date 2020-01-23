package Methods;

import javax.swing.*;

public class HourMinBoolean {
    public static void main(String[] args) {
//Write a method that will take three arguments: the hour, the minutes, and a boolean ( AM will be true, PM will be false) Use the given information to print out the time in this format:
//Hours : minutes amOrPM
//— Hours should be in the range 1-12, minutes should be in the range from 1 to 59. If either of those information provided is not valid, do not continue your program, just print “Invalid time information given
//input: 4, 39, true
//Output: 4 : 39 AM
        PrintTime(3,50,true);


    }
    public static void PrintTime(int hours, int min, boolean Am) {
        if((hours>0 && hours<13) && (min>=0 && min<60)) {
            String date = hours+" : "+min;

            if(Am){
                date+="Am";
            }else{
                date+="Pm";

            }
            System.out.println(date);



        }else{
            System.out.println("Invalid data");
        }

    }
}

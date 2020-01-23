package Arrays;

public class ForLoopTask {
    public static void main(String[] args) {

        //Write a program and create String array called cities. Initialize the cities with cities below:
        //Chicago, New York, Madison, Miami, Washington
        //Iterate through each city and check if Chicago is inside the cities.
        //Print "Windy city found" if Chicago exists in the array. "Windy city not found" otherwise.

        String [] arrayCity = {"Chicago", "New York", "Madison", "Miami", "Washington"};
        int count=0;
       for(String name: arrayCity){
           if(name.equals("Chicago")){
               count++;

               System.out.println(name +" Windy city found " + count + " times");
           }else{
               System.out.println(name+" windy city not found");
           }

           }

       //other way:
        // String[] cities{};
        // boolean check = false;

        // for(String city: cities){
        // if (city.equalsIgnoreCase(anotherString: "Chicago")){
        // check=true;
        //}
        //}
        // if(check){
        //System.out.println("Windy city found");
        //}else{
        // System.out.println("Windy city not found");
        //}






       }
    }


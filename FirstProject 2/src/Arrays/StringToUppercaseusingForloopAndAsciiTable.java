package Arrays;

public class StringToUppercaseusingForloopAndAsciiTable {
    public static void main(String[] args) {
        //Given a String array with value of:
        //"Bread", "cucumber", "Apples", "Orange", "cookies", “Cake"
        //Print out how many of the words begin with uppercase letters
        String[] array = {"Bread","cucumber", "Apples", "Apples", "Orange", "cookies", "Cake"};
        int count = 0;
        for(String name: array){
            if(name.charAt(0) >= 65 && name.charAt(0) <= 90){
                count++;
                System.out.println(name);
            }
        }
        System.out.println(count+" words begin with uppercase letters. ");
    }
}

        //other Way

//      if(Character.isUpperCase(variableName));--takes character
//      count++;

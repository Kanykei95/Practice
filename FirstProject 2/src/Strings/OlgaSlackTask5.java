package Strings;

public class OlgaSlackTask5 {
    public static void main(String[] args) {
        //You have the string
        //«Cybertek school».
        //-Find the index of the space
        //- print out substring from 0 to this space
        //- print out substring from the space till the end of the string

        String word = "Cybertek school";
        int space= word.indexOf(" ");
        int length = word.length();

        System.out.println(space);

        System.out.println();

        System.out.println(word.substring(0,space));

        System.out.println(word.substring(space+1,length));









    }
}

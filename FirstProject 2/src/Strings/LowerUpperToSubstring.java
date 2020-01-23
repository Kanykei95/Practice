package Strings;

public class LowerUpperToSubstring {
    public static void main(String[] args) {
        String word = "java";

        String fixed = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        System.out.println(fixed);


        String word2 = "Kevin fell from his bike";

        int from = word2.indexOf(" from");

        String word3 = word2.substring(0,from); //(0,from -1= if you do not want space or include space in the int above
                    //("  from");
        System.out.println(word3);

        System.out.println(word2.substring(from+1) + " "+ word3);






    }
}

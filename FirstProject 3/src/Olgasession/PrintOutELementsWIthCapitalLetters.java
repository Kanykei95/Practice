package Olgasession;

public class PrintOutELementsWIthCapitalLetters {
    public static void main(String[] args) {
        //print out all elements that contains capital letters
        String[] words = {"knIfe", "wooden spoons", "platTes ","cups", "forks", "pan", "pot", "trash Can" };

        for (String word : words){
            for(int i=0; i<word.length(); i++){
                if(Character.isUpperCase(word.charAt(i))){
                    
                    System.out.println(word);
                }
            }
        }
    }
}

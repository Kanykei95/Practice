package Arrays;

public class Riverse {
    public static void main(String[] args) {
        String str = "It started to snow in Chicago";
        String[] arr = str.split(" ");

        String finalString = "";//store each riversed word in this string

        for(String word: arr){
            String rev = "";//reversed word

            for(int i= word.length()-1; i>=0; i--){//
                rev+=word.charAt(i);//adding each character of word based on i.



            }
            finalString+= rev + " ";

        }
        System.out.println(finalString);





    }

}

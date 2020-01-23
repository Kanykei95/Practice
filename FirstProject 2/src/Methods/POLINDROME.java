package Methods;

public class POLINDROME {

    public static void main(String[] args) {


        System.out.println(isPolindrome("something"));


    }

    public static boolean isPalindromeArr(String str) {

        char[] arr = str.toLowerCase().toCharArray();

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }

        }
        return true;
    }



    public static boolean isPolindrome(String str){
        if(StringReverseMethod.Reverse(str).equals(str)){
            return true;


        }else{
            return false;
        }
    }
}

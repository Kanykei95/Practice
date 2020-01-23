package Methods;

public class StringReverseMethod {
    //Create a method that will accept a String and will reverse your String. Return the reversed String.


    public static void main(String[] args) {
        System.out.println(Reverse("java is fun"));
    }


    public static String Reverse(String str) {
        String check = "";
        for (int i = str.length() - 1; i >= 0; i--) {
           check += str.charAt(i);

        }
        return check;
    }
}

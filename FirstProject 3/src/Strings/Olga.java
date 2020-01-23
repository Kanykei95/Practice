package Strings;

public class Olga {
    public static void main(String[] args) {
        String str1 = "         Cybertek School      ";
        str1 = str1.trim();
        System.out.println(str1);

        String str2 = str1.toLowerCase();
        System.out.println(str2);
        String str3 = str1.toLowerCase();
        System.out.println(str3);

        String str4 = str1.replace("School", "Boot camp");
        System.out.println(str4);



    }
}

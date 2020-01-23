package Strings;

public class StringMethodOlga {
    public static void main(String[] args) {
        // boolean
        String str = "Love is around the world";
        String str2= "love is around the world";
        String str3 = " ";
        boolean check_capital_L = str.startsWith("L");
        boolean check_ends_d = str.endsWith("d");
        boolean equals_to_another_string = str.equals(str2);
        boolean equals_ingore_casses = str.equalsIgnoreCase(str2);
        boolean is_str3_Empty = str3.isEmpty();
        boolean ifContains = str.contains("Love");

        System.out.println("check capital L " + check_capital_L);
        System.out.println("ends with d? " + check_ends_d);
        System.out.println("equals " + equals_to_another_string);
        System.out.println("equals ignore case? " + equals_ingore_casses);
        System.out.println("Is str3 empty? " + is_str3_Empty);
        System.out.println("is love in the string? " + ifContains);
    }
}

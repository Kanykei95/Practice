package Operetors;

public class Logic {
    public static void main(String[] args) {
        System.out.println(5>4 && 6>4);
        System.out.println(4<3 || false);

        boolean b=5>1;
        boolean d=false;
        boolean check = d || b;
        boolean check2 = d && b;
        System.out.println(b);
        System.out.println(check);
        System.out.println(check2);
        System.out.println();



        int age = 5;
        int age2 = 6;
        boolean ageB = age == age2;
        boolean ageBB = age != age2;
        System.out.println(ageB);   // false
        System.out.println(ageBB);  //true
        System.out.println(!ageB);  // !false --> true
        System.out.println(!false);
        System.out.println();

        System.out.println(5<=5); // true

        System.out.println(4 != 4 & 7 < 4);// false and false --> false both sides executed
        System.out.println(4 != 4 && 7 < 4); // true only left side is executed

        System.out.println(true | false);
        System.out.println(false && true);
        System.out.println();


        int a = 10;
        int c = 8;

        System.out.println(true || a++ > c); // a becomes 11, statement == true
        System.out.println(a);  // 11
        System.out.println(false & a++ > c);    // a become 12, statement = false
        System.out.println(a); //12

        System.out.println(false || true);
        System.out.println(false&true);
        System.out.println();
        System.out.println();

        int aa= 10;
        int cc= 11;
        System.out.println(true&a++ >c);//a becomes 11, statement == false
        System.out.println(a);
        System.out.println(false & a++ > c);// become 12, statement == false
        System.out.println(a);



        String word = "house";
        String word2 = "house";
        System.out.println(word.equals(word2));
        System.out.println();

















    }












}

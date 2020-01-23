package Methods;

public class ReturnType {
    public static int getThree(){
        return 3;
    }

    public static String getDate(){
        String date = "11/3/2019";
        return date;//.replace("/","");
    }




    public static void main(String [] args){
        int a =getThree() +7;

        System.out.println(a);
        String date = getDate();//or .replace("/",""); you can also replace here and print date. Does not matter!!!
        System.out.println(date.replace("/", ""));


    }





}

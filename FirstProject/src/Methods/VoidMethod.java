package Methods;

public class VoidMethod {
    public static void main(String[] args) {
        sayHello();
        sayBye();
        sayHello();
    }






    public static void sayHello() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
        }
    }

    public static void sayBye(){
        System.out.println("Bye");
    }



}

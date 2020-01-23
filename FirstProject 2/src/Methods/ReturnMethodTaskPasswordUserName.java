package Methods;

public class ReturnMethodTaskPasswordUserName {
    //
    //Create a method for logging in. User passes the username and password as parameters. If the passed values are
    // the same as the given username and password return true, but if either the username or password is invalid
    // return false
   // Username: james123
    //Password: password
    public static void main(String[] args) {//This is the main method where the action is checked!!!!!!!!
        System.out.println(valid("james12","password"));


    }





    public static boolean valid (String username, String password){//what we as users inputs/
        String user= "james123";//this is what needs to be the password and username
        String pass= "password";

        if(username.equals(user) && password.equals(pass)){
            return true;
        }else{
            return false;
        }
    }
}

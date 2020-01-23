package Olgasession;

public class StringArray {
    public static void main(String[] args) {
        //array+string manipulation (little task). You have string arrays {«apples», «sausages», «super»}. You have to
        // change all «s» letters to «$».



       String [] arr = {"apples","sausages", "supper"};

       String newword = "";


       for(int i=0; i<arr.length;i++){
           if(arr[i].contains("s")){
              newword=arr[i].replace("s","$");
               System.out.println(newword);

           }

       }

    }
}

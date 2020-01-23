package Arrays;

import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {

        String [] names = {"Java","JavaScript", "Ruby", "C","Python","Java","C"};

        //1.Compare each element
        for (int i=0; i<names.length;i++){
            for(int j=i+1; j<names.length;j++){
                if(names[i].equals(names[j])){
                    System.out.println("duplicate element is :" + names[i]);
                }
            }
        }








    }
}

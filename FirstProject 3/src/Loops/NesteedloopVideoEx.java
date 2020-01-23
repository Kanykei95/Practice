package Loops;

public class NesteedloopVideoEx {
    public static void main(String[] args) {
        //nested For loop
        //for(int i = 0; i<4; i++) {
          //  System.out.println();

           // for (int j = 0; j < 3; j++) {
               // System.out.println(" |Row" + i + "-Column " + j);
          //  }
      //  }
//-----------------------------------------------------------------------------
            // for each loop

            //int [] cols = {1,2,3};
           // int [] rows = {1,2,3,4};

           // for(int row : rows){
             //   System.out.println();

             //   for(int column : cols){
                  //  System.out.print("|Row "  + row + " -Column " + column);
             //   }
           // }

        //-------------------------------------------------------------------------

        int row = 0;
        while(row<4){
            row++; //Increment;;;;
            System.out.println();

            int col = 0;
            while(col<3){
                col++;
                System.out.print("|Row " + row + "-Column " + col);
            }
        }






    }
}

package Methods;

public class CreatingACalculator {
    //Create a calculator method that will take three arguments: an operator ( +, -, *, \, %)  and two numbers.
    // Perform that operation between the two numbers and return the result

    public static void main(String[] args) {

        //------SWITCH STATEMENT PRINT OUT!!!!!!
        //System.out.println(calculator("*",2,2));


        //--------------------------------------------------


        System.out.println(calculator("*",2,2));
    }




    public static int calculator(String operator, int num1, int num2){
        int result =0;
     if(operator.equals("+")){
        return num1+num2;
    }else if(operator.equals("*")){
         return num1*num2;
        }else if (operator.equals("-")){
            return num1-num2;
        }else if(operator.equals("/")){
          return num1/num2;
      }else if(operator.equals("%")){
           return num1%num2;
        }else{

         System.out.println("Invalid operator");
         return 0;
     }

//--------------------------------------------------------------------------------------------------

////////---------SWITCH STATEMENT EXAMPLE


   //    switch (operator){
//            case"+":
//                return num1+num2;
//            case"*":
//                return num1*num2;
//            case"/":
//                return num1/num2;
//
//            case"%":
//                return num1%num2;
//            case"-":
//                return num1-num2;
//            default:
//                System.out.println("Invalid operator");
//                return 0;
//        }
    }


}

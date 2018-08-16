// this code gives glimpses of usage of Operators

package com.company;

public class Main {

    public static void main(String[] args) {
	int result = 2 +5 ;
        System.out.println("Result is " + result);
        //System.out.println("Summation Result is " + 2+5);  // takes values to form a string

        result = result-1;
        System.out.println("Difference of Result with 1 gives " + result);

        result = result/ 2;
        System.out.println(" Division of Result by 2 gives " + result);

        result = result *2;
        System.out.println("Multiplication of Result with 2 gives " + result);


        result = result%5;
        System.out.println("Modulo of  Result  with 3 gives " + result);

        // Decrement operator
        result = result--;
        System.out.println("Decrement operator result " + result);

        // Increment operator
        result = result++;
        System.out.println("Increment operator result " + result);

        result = 100;
        // Greater than equal to operator
        if(result>=50){
            System.out.println("RESULT IS " + result);

        }

        // AND OPERATOR
         if(result>10 && result<110){
             System.out.println("&& and operation worked");
         }

         // OR OPERATOR WITH If else statement
         if(result<50 || result<80){
             System.out.println("or operation worked");
         }else{
             System.out.println("Try again");
         }


        }
    }


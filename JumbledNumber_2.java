package zohotest;

import java.util.Scanner;

public class JumbledNumber_2 {

    public static boolean isJumbled(int number) {
        int previous = -1;
       int num=number;
        int difference;
       int currentDigit;

        while (num !=0) {
            currentDigit = num % 10;
         

            if (previous != -1) {
                difference = Math.abs(currentDigit - previous);

                if (difference > 1) {
                  return false;
                }
            }

            previous = currentDigit;
            num /= 10;
        }
          return true;
    }

    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
    	System.out.println("Enter the input:");
	  int input=in.nextInt();
       // int input = 8987;

       if(isJumbled(input)) {

           System.out.println(input+" is  a jumbled number"); 
       }
       else {
    	   System.out.println(input+" is not a jumbled number");
       }
           
       
    }
}

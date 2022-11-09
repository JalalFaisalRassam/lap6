//Write programs with loops that compute
// a. The sum of all even numbersbetween 2 and 100 (inclusive).
// b. The sum of all odd numbers between a and b (inclusive),where a and b are inputs.
// c. The sum of all odd digits of an input.
//  (For example, if the input is 32677, the sum would be 3 + 7 + 7 = 17.)

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        double sum=0;
        Scanner even = new Scanner(System.in);
        for (int i = 0; i <100; i++) {
            if (i%2==0)
                sum+=i;

        }
        System.out.println("the sum of then even numbers between 2 and 100 is "+sum);
int a=0,b=0 ;
sum=0;
        System.out.println("enter two numbers the second mus be bigger than the first ");
       a= even.nextInt();
       b= even.nextInt();
    for (int i = a; i <b; i++) {
            if (i%2==1)
                sum+=i;

        }
        System.out.println("the sum of then odd numbers between "+a+" and "+b+" is "+sum);

        System.out.println("enter a number to calculate its digits ");
     int  y=even.nextInt();
     sum=0;
   int  x=0;
        while(y>0) {
            x=y%10;
            sum+=x;
            y=y/10;
            }


        System.out.println("the sum of the digit "+sum);
        }

    }




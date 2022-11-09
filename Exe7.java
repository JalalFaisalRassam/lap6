import java.util.Scanner;

// Prime numbers. Write a program that prompts the user for an integer
// and then prints out all prime numbers up to that integer.
// For example, when the user enters 20, the program should print 2  3 5 7  11 13 17 19
public class Exe7 {
    public static void main(String[] args) {
        Scanner prirme=new Scanner(System.in);
        int x,p=0;
        System.out.println("enter a number ");
        x=prirme.nextInt();
        for (int i = x; i >0; i--)
        {
            for (int j = (i-1); j >1; j--){
                if(i%j!=0)
                   p=i;

            }
            System.out.println("the prime is"+p);
        }
    }
}

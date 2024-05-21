package Basic_question;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check even_odd");
        int n = sc.nextInt();

        if(n%2 == 0) System.out.println("even number");
        else System.out.println("odd number");

        //second way
        if((n&1) == 0) System.out.println("even number");
        else System.out.println("odd number");

        //3rd way
        if((n/2)*2 == n) System.out.println("even number");
        else System.out.println("odd number");

        //4rth way
        if(((n>>1)<<1) == n) System.out.println("even number");
        else System.out.println("odd number");
    }
}

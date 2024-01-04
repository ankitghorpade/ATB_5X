package src.basic_07_30Dec;

import java.util.Scanner;

public class Lab121Swap_two_No {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = scanner.nextInt();
        System.out.println("Enter the value of b");
        int b =scanner.nextInt();

        int temp;
       temp = a; //temp= 23
        a = b;  //a=99
        b = temp; //b =23

        System.out.println("Swap Value of a and b" +a);
        System.out.println(b);

    }
}

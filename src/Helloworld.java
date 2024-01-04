package src;

import java.util.Arrays;
import java.util.Scanner;

public class Helloworld {

    public static void main(String[] args) {
//        System.out.println("Hello World Print");
//
//        //*********************************************************************************************
//        //Addition/Multiplication of two no With Input
//
//        int a = 5, b = 10;
//        int sum;
//        sum = a + b;
//        System.out.println("the sum of two no is:" + sum);
//
//        int c = 12, d = 5;
//        int mul;
//        mul = a * b;
//        System.out.println("multiplication of two no:" + mul);
//
//
//        //*********************************************************************************************
//
//        //take input from User using scanner class
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Take the Input for below integer");
//
//        System.out.println("Enter First No");
//        int e = sc.nextInt();
//
//        System.out.println("Enter second no");
//        int f = sc.nextInt();
//
//        System.out.println("Enter Third No");
//        int g = sc.nextInt();
//
//        int h = e + f + g;
//
//        System.out.println("Print the total:" + h);
//
//        //take input string from User and Print it
//
//        Scanner sc1 = new Scanner(System.in);
//
//        System.out.println("Enter the String from User");
//        String str1 = sc1.nextLine();
//
//        System.out.println("Print the String here" + str1);
//
//
//        //reverse a String in java
//
//
//        //fibonacci series in java
//
//        // Logic Will be like this:--
//
////        first term = 0
////        second term =1
////        next term = first term + second term (0+1)
////    first term (0) =second term (1)
////    second term (1) =  next term (1)
////    next term = 1 + 1 =2
//
//        //Interview Question:-
//        // Write a Prog for Fibonacci series in java
//
//        String str5 = "Ultimate";
//
//
        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;


            //Interview Question
            //Find Second Largest Element in an Array


//            int array [] = { 22,44,88,66,20,66,96}
//                    int size = array.length;

//
//            int array[] = {1, 2, 5, 8, 9, 52, 99, 101, 120, 42, 23};
//            int size = array.length;
//            System.out.println("print the array length" + array.length);
//
//
//            Arrays.sort(array);
//            System.out.println("Print Sorted Array::" + Arrays.toString(array));
//
//            int Result = array[size - 2];
//
//            System.out.println("2nd largest element::" + Result);


//            int array[] = {12,85,20,1,86,95,22};
//            int size = array.length;
//        System.out.println("Print length:::" +array.length);
//        Arrays.sort(array);
//        System.out.println("Sorted Array ::" + Arrays.toString(array));
//        int Result = array [size - 1];
//        System.out.println("2nd Largest Element is::" + Result);

//
//                System.out.println("sorted Array ::"+Arrays.toString(array));
//                int res = array[size-2];
//                System.out.println("2nd largest element is ::"+res);

//            byte age = 10;  //range of byte -128 to 127
//            age = 127; //out of range
//            System.out.println(age + 1);
//            System.out.println(age);


        }
    }
}

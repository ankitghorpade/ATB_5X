package src;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] mark_result = {1, 5, 5, 9};
        System.out.println(mark_result[2]);

        int[] int_arr = {14, 55, 88, 99};
        float[] floats_arr = {42.2f, 88.2f, 99.9f};
        String[] name = {"Abc,Dfg,Wer"};
        long [] long_arr = {93,62,16};
        System.out.println("Print " +int_arr.length);

        Scanner sc = new Scanner(System.in);
        System.out.println("Take user input");
        int abr = sc.nextInt();
        System.out.println("Print here" +abr);

//        Reverse the String

        String s1= "Anki";
        System.out.println("print");
        System.out.println("Old String " +s1);


     }
}
package src;

public class Loops_Practice {
    public static void main(String[] args) {
        System.out.println("Below Will Execute the Loops");

//        int i = 10;
//        if (i < 15) {
//            System.out.println("i is greater than 15");
//        } else {
//            System.out.println("i is smaller than 15");
//        }
//        for (i = 1; i < 10; i++)
////    1  1 <10   1 2 3 4 5 6 7 8 9  10 condition false it exit
////    for ( intialisization , Testing Codition , Increment/Decrement)
//
//
//            System.out.println(i);
//        System.out.println("Print the String Ankit");

 //Fibannoci series
//
//        1 + 1 =2  2 + 1 =3  3 + 2=5

           int n = 10, First_term = 0 , Second_term = 1;
        System.out.println("Series till "  +   n  + " Terms");

        for(int i = 1; i <=n; ++i){
            System.out.println(First_term + ", ");
            int next_term = First_term + Second_term;
            First_term = Second_term;
            Second_term= next_term;

        }



    }
}

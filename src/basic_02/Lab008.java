package src.basic_02;

public class Lab008 {
    public static void main(String[] args) {
        /*
        Print the table
         */
        System.out.println("%d*1=1");

        //String is Bunch of Character
        String name = "Ankit";
        System.out.println(name);

        /*Formatting (printf)
        %s replace by name value ankit
         */

        System.out.printf("name is %s", name);

        //Concatinate by +
        System.out.println("String name is" +name);

        float pi = 32.5f;
        System.out.printf("Float is %f", pi);
        System.out.println("Next linr print" +pi);
    }
}

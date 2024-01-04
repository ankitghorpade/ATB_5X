package src.basic03;

public class Lab021 {
    public static void main(String[] args) {
        //Interview Relational Operator

        System.out.println(10 == 10);
        System.out.println(10 <= 10);
        System.out.println(10  >=10);
        System.out.println(10 > 10);
        System.out.println(10 < 10);



        //Charcter Use in sout will always be interger value
        //== is Comparing the Values
        System.out.println('A'==65);  //Ascii value of A is 65

        System.out.println('A');

        byte b = 65;
        //Sout statement will come as Int
        System.out.println('A' == b);  //65 == 65

        System.out.println('A' == 65.0); //Property of java will take int only not decimal
        System.out.println('A' == 65.0f);
        System.out.println('A' ==65.2);



    }
}

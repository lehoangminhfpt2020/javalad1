package lad1;

import java.util.Scanner;

// formatted in input
public class ss3Snippet14 {

    public static void main(String[] args) {
        //creates an object and passes the inp5utstream object
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number:");

        //Accepts integer value from the user
        int intValue = s.nextInt();
        System.out.println("Enter a decimalnumber");

        //Accepts integer value from the user
        float floatValue = s.nextFloat();
        System.out.println("enter a string value");


        //accepets string value from the user
        String strValue= s.next();
        System.out.println("values entered are:");
        System.out.println(intValue + " " +floatValue + " " + strValue);
    }
}

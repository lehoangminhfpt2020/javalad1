package lad1;

import java.util.Scanner;

public class ss4snippet12345 {
    public static void main(String[] args) {

        // snippet 1
        int first =400, second =700, result;
        result = first +second;

        //evaluates the value of result variable
        if (result > 1000){
            second = second + 100;
        }
        System.out.println("the value of second is : " + second);

        // snippet 2
        int a= 400, b = 700, c;
        c = a+b;
        if (c>100){
            b = b+100;
        }
        System.out.println("the value of b is " + b);

        //snippet 3
        int number =11, remainder;
        remainder = number%2;
        if (remainder == 0 ) {
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }

        //Snippet 4

        Scanner input = new Scanner(System.in);
        System.out.println("enter a Number: ");
        int num = input.nextInt();

        if (num%3 == 0) {
            System.out.println("inside outer if Block");

            if (num % 5 == 0) {
                System.out.println("number is divisible by 3 and 5");
            } else {
                System.out.println("number is divible by 3, but not by 5 ");
            }
        }
        else {
            System.out.println("number is not divible by 3 and 5");
        }

        //snippet 5 if else if
        int d = 59;

        if (d >=90){
            System.out.println("Grade = A+");
        }
        else if (d >=60){
            System.out.println("Grade = A");
        }
        else if (d >=40){
            System.out.println("Grade = B");
        }
        else if (d >= 30){
            System.out.println("Grade = C");
        }
        else {
            System.out.println("Fail");
        }

    }

}

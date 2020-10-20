package lad1;

public class ss3Snippet181920 {
    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 20;

        System.out.print(" value1 == value2 :");
        System.out.println(value1 == value2);
        System.out.print("value1 != value2: ");
        System.out.println(value1 != value2);
        System.out.print("value1 > value2: ");
        System.out.println(value1>value2);
        System.out.print("value1 < value2: ");
        System.out.println(value1<value2);
        System.out.print("value1 <= value2: ");
        System.out.println(value1<= value2);

        //Snippet 19
        int first = 10;
        int second = 20;

        //Use of logical operator
        System.out.println((first==30)&& (second==20));
        System.out.println((first==30)|| (second==20));

        //Snippet 20

        int x=23;
        int y=12;

        System.out.print("x&y: ");
        System.out.println(x&y); // returns 4, ie, 4=00100
        System.out.print("x|y: ");

        System.out.println(x|y); // returns 31, i.e 31 =11111
        System.out.print("x^y: ");
        System.out.println(x^y); // Return 27 , i.e31 = 11011

        int a=43;
        int b=1;
        System.out.print("a>>b: ");
        System.out.println(a>>b); //returns 21 , i.e, 21=0010101
        System.out.print("a<<b: ");
        System.out.println(a<<b); // returns 86 , i.e, 86 = 1010110

        // Snippet 21
        int value11 = 10;
        int value22 = 20;
        int resultt;
        boolean someCondition = true;
        resultt = someCondition ? value11:value22;

        System.out.println(resultt);
    }
}

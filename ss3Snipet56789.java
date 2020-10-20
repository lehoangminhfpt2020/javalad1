package lad1;

public class ss3Snipet56789 {
    public static void main(String[] args) {
        // Snippet 5
        String str ="A String Data";

        //Snippet 6
        /*
        * paramargs the command line arguments
         */
        int empNumber; //Declares a variable of type integer
        float salary; // Declares a variable of type decimal
        double shareBalance= 264527.234; // Declares and initialize a decimal variable
        char gender ='M'; //Declares a variable of type character
        boolean ownVehicle=false; // Declares and initialize a variable of type boolean
        //variables, empNumber and salary are initialized
        empNumber =101;
        salary= 6789.50f;
        System.out.println(empNumber);
        System.out.println(salary);
        System.out.println(gender);
        System.out.println(shareBalance);
        System.out.println(ownVehicle);

        //Snippet7
        //Ues tab and new line escape sequences
        System.out.println("Java \t Programming \n Language");
        //print Tom "dick"Harry string
        System.out.println("tom \" dick \"harry");

        //Snippet 8
        //prints 'Hello' using hexadecimal escape sequence characters
        System.out.println("\u0048\u0065\u006C\u006C\u006F" + "!\n");
        //Prints 'Blake' using octal escape sequence character for 'a'
        System.out.println("B1\141ke\"2007\"");

        //Snippet 9
        //declares constant variable
        final double PI=3.14159;
        double radius=5.87;
        double area;
        //Calculates the value for the area variable
        area = PI * radius * radius;
        System.out.println("area of the circle is:" + area);


    }
}

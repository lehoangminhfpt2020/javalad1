package lad1;

public class ss3Snippet12 {
    public static void main(String[] args) {
        int i =55 / 22;
        //Decimal integer
        System.out.printf("55/22 = %d%n",i);

        //Padwithzeros
        double q = 1.0/2.0;
        System.out.printf("1.0/2.0 = %09.3f%n",q);

        //scientific notation
        q=5000.0/3.0;
        System.out.printf("5000/3.0 = %7.2e%n",q);

        //negative infinity
        q=-10.0/0.0;
        System.out.printf("-10.0/0.0 = %7.2e%n",q);

        //multiple argument, PI value,E-base of natural logarithm
        System.out.printf("pi = %5.6f,e=%5.4f%n",Math.PI,Math.E);
    }
}

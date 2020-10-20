package lad1;

public class ss4snippet678 {
    //snippet 6 switch case
    public static void main(String[] args) {
        int choice =3;

        switch (choice){
            case 1:
                System.out.println("Addition");
                break;

            case 2:
                System.out.println("Subtraction");
                break;

            case 3:
                System.out.println("Multiplication");
                break;

            case 4:
                System.out.println("Division");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        //snippet 7 Number of day
        int month = 2;
        int year = 2001;
        int numDays =0;

        switch (month){
            case 1:

            case 2:
                if (year%4==0){
                    numDays=29;
                }
                else {
                    numDays=28;
                }
                break;

            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:

            case 11:
                numDays =30;
                break;

            case 12:

            default:
                System.out.println("invalid Month");
        }

        System.out.println("month: " +month);
        System.out.println("number of day: " +numDays);

        //Snippet 8 \
        String day = "Monday";

        switch (day){
            case "Sunday":
                System.out.println("First day of the week");
                break;

            case "Monday":
                System.out.println("Second day of the week");
                break;

            case "Tuesday":
                System.out.println("Third day of the week");
                break;

            case "Wednesday":
                System.out.println("Fourth day of the week");
                break;

            case "Thursday":
                System.out.println("Fifth day of the week");
                break;

            case "Friday":
                System.out.println("Sixth day of the week");
                break;

            case "Saturday":
                System.out.println("Seventh day of the week");
                break;

            default:
                System.out.println("Invalid Day");
        }



    }
}

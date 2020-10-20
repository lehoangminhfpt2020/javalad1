package lad1;

public class ss4snippet10 {
    public static void main(String[] args) {
        String day = "Monday";
        String hour = "am";

        switch (day){
            case "Sunday":
                System.out.println("Sunday is a Holiday");
                switch (hour){
                    case "am":
                        System.out.println("Good Morning");
                        break;

                    case "pm":
                        System.out.println("Good Everning");
                        break;
                }
                break;

            case "Monday":
                System.out.println("monday is a working Day ....");
                switch (hour){
                    case "am":
                        System.out.println("Good Morning");
                        break;

                    case "pm":
                        System.out.println("Good evening");
                        break;
                }
                break;

            default:
                System.out.println("Invalid Day");
        }
    }
}

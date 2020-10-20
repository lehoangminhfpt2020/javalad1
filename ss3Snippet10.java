package lad1;

public class ss3Snippet10 {

    /*
    * Declares an enumeration
     */
    enum Direction{
        East ,West,Norht,South
    }

    public static void main(String[] args) {
        //Declares a variable of type Direction
        Direction direction;
        //Instantiate the enum Direction
        direction = Direction.East;
        //Prints the value of enum
        System.out.println("value " + direction);
    }
}

package lad1;

public class ss4snippet9 {
    //Snippet 9

    enum cards {
        Spade, heart, Diamond, Club
    }

    public static void main(String[] args) {
        cards card = cards.Diamond;

        switch (card){
            case Spade:
                System.out.println("SPADE");
                break;

            case heart:
                System.out.println("Heart");
                break;

            case Diamond:
                System.out.println("Diamond");
                break;

            case Club:
                System.out.println("club");
                break;
        }
    }
}

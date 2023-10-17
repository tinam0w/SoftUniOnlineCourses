package WorkingWithAbstractionsExercise.Cards.CardRank;

public class Main {
    enum CardRanks{
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING;
    }

    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        CardRanks[] values = CardRanks.values();
        for (CardRanks value : values) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", value.ordinal(), value);
        }
    }
}

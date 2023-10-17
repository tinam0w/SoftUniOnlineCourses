package WorkingWithAbstractionsExercise.Cards;

public class Card {
    enum Suit{
        DIAMONDS(13),
        CLUBS(0),
        SPADES(39),
        HEARTS(26);

        public final int power;
        Suit(int power){
            this.power = power;
        }
    }
    enum Rank {
        ACE(14),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13);

        int power;
        Rank(int power){
            this.power = power;
        }

        public int getPower() {
            return power;
        }
    }

    Suit suit;
    Rank rank;

    public Card(Rank rank, Suit suit) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getName() {
        return this.rank + " of " + this.suit;
    }

    public int getPower() {
        return this.rank.getPower() + this.suit.power;
    }
}

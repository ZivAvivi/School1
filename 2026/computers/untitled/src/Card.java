public class Card {
    int value;
    String shape;

    public Card(int value, String shape){
        this.shape = shape;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getShape() {
        return shape;
    }

    @Override
    public String toString() {
        return "(" + value +", " + shape + ')';
    }

    public boolean equals(Card other){
        return (this.value == other.value && this.shape == other.shape);
    }
}

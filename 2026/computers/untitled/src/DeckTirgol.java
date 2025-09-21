import java.util.Random;

public class DeckTirgol {
    public static void main(String[] args) {
        Random rand = new Random();
        Deck deck = new Deck();
        for (int i = 0; i < rand.nextInt(10, 16); i++) {
            String shape = switch (rand.nextInt(1, 5)) {
                case 1 -> "heart";
                case 2 -> "club";
                case 3 -> "clover";
                case 4 -> "diamond";
                default -> "";
            };
            deck.addCard(new Card(rand.nextInt(2, 15), shape));
        }

        Card c = deck.getCard(rand.nextInt(1, 15));

    }
}

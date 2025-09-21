import java.util.Arrays;

public class Deck {
    public static final int SIZE = 100;
    private Card[] arr;
    private int lastCard;

    public Deck(){
        arr = new Card[SIZE];
        lastCard = 0;
    }

    public Card[] getArr() {return arr;}

    public Card getCard() {return arr[0];}

    public Card getCard(int num) {return arr[num];}

    public boolean isEmpty(){return lastCard==0;}

    public Card getCard(String shape){
        for (int i = 0; i <lastCard; i++) {
            if(arr[i] != null && arr[i].getShape().equals(shape))
                arr[i] = null;
                return arr[i];
        }
        return null;
    }

    public boolean exist(Card c){
        for (int i = 0; i <lastCard; i++) {
            if(arr[i] != null && arr[i].equals(c))
                return true;
        }
        return false;
    }

    public void addCard(Card c){
        arr[lastCard] = c;
        lastCard++;
    }

//    public void removeCard(Card c){
//        if (exist(c)) {
//            int place;
//            for (int i = 0; i < lastCard; i++) {
//                if (arr[i].equals(c))
//                    place = i;
//            }
//            for (int i = place; i < lastCard; i++) {
//                arr[i] = arr[i + 1];
//            }
//            arr[lastCard] = null;
//        }
//    }

    @Override
    public String toString() {
        String st = "[";
        for (int i = 0; i < lastCard; i++) {
            st = st + arr[i].toString() + ", ";
        }
        st+="]";
        return st;
    }
}

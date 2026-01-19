public class Item {
    private char ch;
    private int num;

    public Item(char ch, int num) {
        this.ch = ch;
        this.num = num;
    }

    public char getCh() {
        return ch;
    }

    public int getNum() {
        return num;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "(" + ch + ", " + num + ')';
    }
}
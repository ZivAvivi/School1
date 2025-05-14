public class Num3Digit {

    private int d1, d10, d100;

    public Num3Digit(int n1, int n10, int n100){
        this.d1 = n1;
        this.d10 = n10;
        this.d100 = n100;
    }

    public  int getNum(){
        return this.d1 + this.d10 * 10+ this.d100 *100;
    }

    public String toString() {
        return this.getNum() +"";
    }

    public int getD1() {
        return this.d1;
    }

    public void setD1(int d1) {
        this.d1 = d1;
    }

    public int getD10() {
        return this.d10;
    }

    public int getD100() {
        return this.d100;
    }

    public void setD10(int d10) {
        this.d10 = d10;
    }

    public void setD100(int d100) {
        this.d100 = d100;
    }
}

public class Malben {

    private int length,width;

    /**
     *
     * @param length length malben
     * @param width width malben
     */
    public Malben(int length, int width){
        this.length = length;
        this.width = width;
    }


    public int getLength() {return length;}

    public void setLength(int length) {this.length = length;}

    public int getWidth() {return width;}

    public void setWidth(int width) {this.width = width;}

    public int area(){return this.length *this.width;}

    public int perimiter(){return this.width*2 + this.length*2;}

    @Override
    public String toString() {
        return ("length: " + this.length + "\n get width: " + this.width);
    }
}

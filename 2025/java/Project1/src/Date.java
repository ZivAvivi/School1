public class Date {
    private  int day, month, year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public Date(){
        this.day = 1;
        this.month = 1;
        this.year = 1980;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean before(Date other){
        if(other.getYear() < this.year) return false;
        if (other.getMonth() < this.month) return false;
        return  other.getDay() > this. day;
    }

    public  boolean equals(Date other){
        return other.getYear() == this.year && other.getMonth() == this.month && other.getDay() == this.day;
    }

    public boolean after(Date other){
        return !this.before(other) && !this.equals(other);
    }


    public String toString() {
        return this.day +"."+ this.month +"."+ this.year;
    }
}

public class Test {
    private int grade;
    private Date date;
    private String name;

    public Test(int grade, Date date, String name){
        this.grade = grade;
        this.date = date;
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return this.date;
    }

    public int getGrade() {
        return this.grade;
    }

    public String getName() {
        return this.name;
    }


    public String toString() {
        return "grade=" + grade +
                ", date=" + date +
                ", name='" + name;
    }
}

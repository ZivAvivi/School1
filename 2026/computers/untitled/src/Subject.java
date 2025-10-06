public class Subject {
    private String subName;
    private int grade;

    public Subject(String subName, int grade){
        this.subName = subName;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return subName;
    }

    public void setName(String subName) {
        this.subName = subName;
    }
}


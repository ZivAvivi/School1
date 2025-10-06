public class ReportCard {
    private String stuName;
    private Subject[] subArray;

    public ReportCard(String stuName, int num){
        this.stuName = stuName;
        this.subArray = new Subject[num];
    }

    public double average() {
        int sum = 0;
        for (int i = 0; i < subArray.length; i++) {
            sum += subArray[i].getGrade();
        }
        return (double)sum/subArray.length;
    }

    public boolean isExcellent(){
        boolean hasHundred = false;
        for (int i = 0; i < subArray.length; i++) {
            if(subArray[i].getGrade() < 54)
                return false;
            if (subArray[i].getGrade() == 100)
                hasHundred = true;
        }
        return hasHundred && this.average()>=85;
    }

    public String getStuName() {
        return stuName;
    }

    public Subject[] getSubArray() {
        return subArray;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setSubArray(Subject[] subArray) {
        this.subArray = subArray;
    }
}

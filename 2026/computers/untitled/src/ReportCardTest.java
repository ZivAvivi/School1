public class ReportCardTest {
    public static void main(String[] args) {

    }
    public static void printExcellent(ReportCard[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isExcellent())
                System.out.println(arr[i].getStuName());
        }
    }
}

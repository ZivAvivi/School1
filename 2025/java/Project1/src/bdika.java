public class bdika {
    public static void main(String[] args) {
        Test t1 = new Test(86, new Date(1, 5, 2025), "History");
        Test t2 = new Test(86, new Date(1, 5, 2025), "History");
    }

    public static boolean isLeapYear(Date date){
        if(date.getYear() % 1000 == 0) return true;
        if(date.getYear() % 100 == 0) return false;
        if(date.getYear() % 4 == 0) return true;
        return false;
    }
}

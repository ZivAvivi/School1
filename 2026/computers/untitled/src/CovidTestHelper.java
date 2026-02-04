import java.util.Random;
import java.util.Scanner;

public class CovidTestHelper {
    public static void main(String[] args) {
        Queue<CovidTest> q = queue5Random();
        System.out.println(q.toString());

        System.out.println("most sick city " + mostSick(q));
    }

    // קוד לייצר רשימה רנדומלית
    public static Queue<CovidTest> queue5Random(){
        Queue<CovidTest> queue = new Queue<CovidTest>();
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        String name = "";
        String id = "";
        boolean sick = false;
        for(int i = 0; i < 10; i++){
            queue.insert(new CovidTest(name, id,
                    random.nextInt(1, 10),
                    random.nextBoolean()));
        }
        return queue;
    }

    public static int mostSick(Queue<CovidTest> q){
        Queue<CovidTest> temp = new Queue<CovidTest>();
        int maxCount = -1;
        int bigCity = -1;
        int currentCity = -1;
        while(!q.isEmpty()){
            currentCity = sickInCity(q, q.head().getCityCode());
            if(currentCity > maxCount) {
                maxCount = currentCity;
                bigCity = q.head().getCityCode();
            }
            temp.insert(q.remove());
        }
        while(!temp.isEmpty()){
            q.insert(temp.remove());
        }
        return bigCity;
    }

    public static int sickInCity(Queue<CovidTest> q, int cityCode){
        Queue<CovidTest> temp = new Queue<CovidTest>();
        int count = 0;
        while (!q.isEmpty()){
            if(q.head().getCityCode() == cityCode && q.head().isSick()){
                count++;
            }
            temp.insert(q.remove());
        }
        while(!temp.isEmpty()){
            q.insert(temp.remove());
        }
        return count;
    }
}
/*
[{, , 2, true}, {, , 1, true}, {, , 5, true}, {, , 7, false}, {, , 2, true}, {, , 2, true}, {, , 4, true}, {, , 7, true}, {, , 8, true}, {, , 6, true}]
most sick city 2


* */
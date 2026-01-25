import java.util.Random;

public class QueueUtil{

    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q = queue10_10Random();
        System.out.println(q.toString());
        System.out.println(queueSumFirstLast(q));


    }

    public static Queue<Integer> queue10_10Random(){
        Queue<Integer> queue = new Queue<>();
        Random random = new Random();
        int num = random.nextInt(21) - 10;
        while (num != 0){
            queue.insert(num);
            num = random.nextInt(21) - 10;
        }
        return queue;
    }

    public static int queueSize(Queue<Integer> queue){
        Queue<Integer> temp = new Queue<>();
        int size = 0;
        while(!queue.isEmpty()){
            size++;
            temp.insert(queue.remove());
        }
        while(!temp.isEmpty()){
            queue.insert(temp.remove());
        }
        return size;
    }

    public static int queueSum(Queue<Integer> queue){
        Queue<Integer> temp = new Queue<>();
        int sum = 0;
        int tempNum;
        while(!queue.isEmpty()){
            tempNum = queue.remove();
            temp.insert(tempNum);
            sum += tempNum;
        }
        while(!temp.isEmpty()){
            queue.insert(temp.remove());
        }
        return sum;
    }

    public static int queueSumEven(Queue<Integer> queue){
        Queue<Integer> temp = new Queue<>();
        int sum = 0;
        int tempNum;
        while(!queue.isEmpty()){
            tempNum = queue.remove();
            temp.insert(tempNum);
            if(tempNum % 2 == 0){
                sum += tempNum;
            }
        }
        while(!temp.isEmpty()){
            queue.insert(temp.remove());
        }
        return sum;
    }

    public static int queueSumFirstLast(Queue<Integer> queue){
        if (queue.isEmpty()){return 0;}
        Queue<Integer> temp = new Queue<>();
        int sum = queue.remove();
        int tempNum = 0;
        while(!queue.isEmpty()){
            tempNum = queue.remove();
            temp.insert(tempNum);
        }
        sum += tempNum;
        while(!temp.isEmpty()){
            queue.insert(temp.remove());
        }
        return sum;
    }

    public static int queueMax(Queue<Integer> queue) {
        Queue<Integer> temp = new Queue<>();
        int tempNum = queue.remove();
        int max = tempNum;
        temp.insert(tempNum);
        while (!queue.isEmpty()) {
            tempNum = queue.remove();

            if (tempNum > max) {
                max = tempNum;
            }
            temp.insert(tempNum);
        }
        while (!temp.isEmpty()) {
            queue.insert(temp.remove());
        }

        return max;
    }
}

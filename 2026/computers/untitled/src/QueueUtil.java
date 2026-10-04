import java.util.Random;

public class QueueUtil{

    public static void main(String[] args) {
        // Create the queue from the image example: [5, 11, 6, 9, 3, 6, 3]
        Queue<Integer> q = new Queue<>();
        q.insert(5);
        q.insert(11);
        q.insert(6);
        q.insert(9);
        q.insert(3);
        q.insert(6);
        q.insert(3);

        System.out.println("Original Queue: " + q);
        System.out.println("-------------------------------------------");

        System.out.println(isMagic(q, 1));
        System.out.println("after queue: " + q);

    }

    public static boolean isMagic(Queue<Integer> q, int m){
        if(m == 1){return false;}
        Queue<Integer> temp = new Queue<>();
        int count = 1;
        int sum = 0;
        int mNum = q.head();

        while(count <= m){
            if (count == m-1){
                sum += q.head();
                System.out.println(sum);
            }
            if (count == m){
                mNum = q.head();
                System.out.println(mNum);
            }
            temp.insert(q.remove());
            count++;
        }
        if(q.isEmpty()){return false;}
        sum += q.head();

        while (!q.isEmpty()){
            temp.insert(q.remove());
        }
        while (!temp.isEmpty()){
            q.insert(temp.remove());
        }
        return sum == mNum;
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

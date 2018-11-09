import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        int[] arr = new int[10];
//        for(int i = 0; i < arr.length; i ++)
//            arr[i] =i;
//
//        int[] scores = new int[]{100, 99, 66};
//        for(int i = 0; i < scores.length; i++)
//            System.out.println(scores[i]);
//
//        for(int score: scores)
//            System.out.println(score);



        Array<Integer> myarr = new Array<>();
        for(int i = 0; i < 10; i++)
            myarr.addLast(i);
        System.out.println(myarr);
        myarr.add(1, 100);
        myarr.addFirst(-1);
        System.out.println(myarr);

        // [-1, 0, 100, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        myarr.remove(2);
        System.out.println(myarr);

        myarr.removeElement(4);
        System.out.println(myarr);

        myarr.removeFirst();
        myarr.removeLast();
        System.out.println(myarr);



        // 栈
        ArrayStack<Integer> stack = new ArrayStack<>();
        for(int i=0; i< 5; i++){
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);


        System.out.println(2/3);

        int opCount = 100000;

        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        double time1 = testQueue(arrayQueue, opCount);
        System.out.println("ArrayQueue, time: " + time1 + "s");

        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double time2 = testQueue(loopQueue, opCount);
        System.out.println("LoopQueue, time: " + time2 + "s");
    }

    //测试使用q运行opCount个enqueue和dequeue操作所需要的时间，单位：秒
    private static double testQueue(Queue<Integer> q, int opCount) {
        long startTime = System.nanoTime();

        Random  random = new Random();
        for(int i = 0; i < opCount; i++)
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        for(int i = 0; i < opCount; i++)
            q.dequeue();

        long endTime = System.nanoTime();

        return (endTime - startTime) / 100000000.0;
    }
}

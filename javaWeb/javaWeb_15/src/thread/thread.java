package thread;

import java.util.concurrent.*;

public class thread {
    public static void main(String[] args) {
//        没使用线程
        System.out.println("送快递到北京");
        System.out.println("送快递到上海");
        System.out.println("处理自己的业务");

//        手动创建线程
//        雇佣两个人，让他们送
//        我在干自己的事
        new Thread(()->{
            System.out.println("送快递到北京");
        }).start();
        new Thread(()->{
            System.out.println("送快递到上海");
        }).start();
        System.out.println("处理自己的业务");

//        使用jdk的线程池
        ThreadPoolExecutor pool=new ThreadPoolExecutor(
                4,
                10,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1000),
//                new ThreadPoolExecutor.DiscardOldestPolicy(),
                new ThreadPoolExecutor.DiscardPolicy()
                );
        pool.execute(()->{
            System.out.println("送快递到北京");
        });
        pool.execute(()->{
            System.out.println("送快递到上海");
        });
        System.out.println("干自己的事");
        ExecutorService pool2= Executors.newSingleThreadExecutor();
        ExecutorService pool3=Executors.newFixedThreadPool(3);
        ExecutorService pool4=Executors.newCachedThreadPool();
        ExecutorService pool5=Executors.newScheduledThreadPool(4);


    }
}

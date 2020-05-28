package thread;

import javax.naming.ldap.PagedResultsControl;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MyThread {

    private BlockingQueue<Runnable>queue;
//    创建快递公司
     public MyThread(int corePoolSize,int capacity) {
//         创建仓库
         queue = new ArrayBlockingQueue<>(capacity);
//         招聘员工
         for (int i = 0; i < corePoolSize; i++) {
             new MyThread1(queue).start();
         }
     }
     public void execute(Runnable task){
         try {
             queue.put(task);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
//     正式员工，一直干活
    private static class MyThread1 extends Thread{
         private BlockingQueue<Runnable>queue;

    public MyThread1(BlockingQueue<Runnable> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            Runnable task= null;
            try {
                task = queue.take();
                task.run();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

}

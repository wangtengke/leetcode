import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @program: leetcode
 * @description: Semaphore 类似于操作系统中的信号量，可以控制对互斥资源的访问线程数。  以下代码模拟了对某个服务的并发请求，每次只能有 3 个客户端同时访问，请求总数为 10。
 * @author: wangtengke
 * @create: 2019-07-30
 **/
public class SemaphoreExample {
    public static void main(String[] args) {
        final int clientCount = 3;
        final int totalRequestCount = 30;
        Semaphore semaphore = new Semaphore(clientCount);
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < totalRequestCount; i++) {
            executorService.execute(()->{
                try {
                    semaphore.acquire();
//                    Thread.sleep(1000);
                    System.out.print(semaphore.availablePermits() + " ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }
            });
        }
        executorService.shutdown();
    }

}

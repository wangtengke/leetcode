/**
 * @program: leetcode
 * @description: 死锁
 * @author: wangtengke
 * @create: 2018-12-20
 **/
public class DeadLock {
    public final static Object resource1 = "resource1";
    public final static Object resource2 = "resource2";
    public static void main(String[] args) {
        new Thread(()->{
           synchronized (resource1){
               System.out.println("Thread 1 get resource1");
               synchronized (resource2){
                   System.out.println("Thread 1 want to get resource2");
               }
           }
        }).start();

        new Thread(()->{
            synchronized (resource2){
                System.out.println("Thread 2 get resource2");
                synchronized (resource1){
                    System.out.println("Thread 2 want to get resource1");
                }
            }
        }).start();
    }

}

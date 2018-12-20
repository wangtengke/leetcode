package util;

import lombok.AllArgsConstructor;
import sun.tools.jar.CommandLine;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @program: leetcode
 * @description: 消费者
 * @author: wangtengke
 * @create: 2018-12-20
 **/
@AllArgsConstructor
public class Customer{
    private BlockingQueue<Data> queue;

    public void customer(BlockingQueue<Data> queue) throws InterruptedException {
        if (!queue.isEmpty()){
            try {
                queue.take();
                System.out.println("queue size is "+queue.size());
                System.out.println("customer success!");
            } catch (InterruptedException e) {
                System.out.println("queue is empty!");
                Thread.sleep(1000);
            }
        }
    }

    public static void main(String[] args) {
        BlockingQueue<Data> queue = new LinkedBlockingQueue<>();
        Producer producer = new Producer(queue);
        Customer customer = new Customer(queue);
        new Thread(()->{
            while (true) {
                try {
                    producer.producer(queue);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(()->{
            while (true) {
                try {
                    customer.customer(queue);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}

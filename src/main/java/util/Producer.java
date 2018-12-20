package util;

import lombok.AllArgsConstructor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @program: leetcode
 * @description: 生产者
 * @author: wangtengke
 * @create: 2018-12-20
 **/
@AllArgsConstructor
public class Producer {
    private BlockingQueue<Data> queue;

    public void producer(BlockingQueue<Data> queue) throws InterruptedException {
        Thread.sleep(1000);
        queue.offer(new Data(1,10,"wtk"));
        System.out.println("producer success!");
    }

}

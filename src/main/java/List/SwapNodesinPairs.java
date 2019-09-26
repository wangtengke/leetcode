package List;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;
import util.ListNode;

import java.awt.*;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-16
 **/
public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode ret = new ListNode(0);
        ret.next = head;
        ListNode res = ret.next;
        while(res!=null && res.next!=null){
            ListNode temp = null;
            ListNode now = res;
            ListNode pre = res.next;
            temp = res.next.next;
            now.next= temp;
            pre.next = now;

            res = pre;
            res = res.next.next;

        }
        return head;
    }

    public static void main(String[] args) {
        SwapNodesinPairs swapNodesinPairs = new SwapNodesinPairs();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        swapNodesinPairs.swapPairs(node1);
    }
}

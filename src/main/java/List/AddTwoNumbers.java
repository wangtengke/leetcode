package List;

import util.ListNode;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-16
 **/
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(1);
        ListNode root = null;
        res.next = root;
        int add = 0;
        while(l1!=null && l2!=null){
            int val = (l1.val + l2.val + add)%10;
            add = (l1.val + l2.val + add)/10;
            root = new ListNode(val);
            root = root.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        return res.next;
    }

}

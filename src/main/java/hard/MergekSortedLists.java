package hard;

import util.ListNode;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program: leetcode
 * @description:
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 *
 * Example:
 *
 * Input:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * Output: 1->1->2->3->4->4->5->6
 * @author: wangtengke
 * @create: 2018-12-24
 **/
public class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
//        int k = lists.length;
//        if(k==0)
//            return null;
//        while (k>1){
//            int n  = (k+1)/2;
//            for (int i = 0; i <k/2 ; i++) {
//                lists[i] = merge2Lists(lists[i],lists[i+n]);
//            }
//            k = n;
//        }
//        return lists[0];
        Queue<ListNode> queue  = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
        if(lists.length==0)
            return null;
        for (ListNode list : lists) {
            if(list!=null)
                queue.offer(list);
        }
        ListNode pre = new ListNode(1);
        ListNode temp;
        ListNode head= pre;
        while (!queue.isEmpty()){
            temp = queue.peek();
            pre.next = temp;
            pre = pre.next;
            queue.remove();
            if(temp.next!=null) {
                queue.offer(temp.next);
            }
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(2);
        ListNode node8 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node4.next = node5;
        node5.next = node6;
        node7.next = node8;
        ListNode[] lists = new ListNode[3];
        lists[0]= node1;
        lists[1]= node4;
        lists[2]= node7;
        MergekSortedLists list = new MergekSortedLists();
        list.mergeKLists(lists);
    }

    private ListNode merge2Lists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(1);
        ListNode result = res;
        while (list1!=null||list2!=null){
            if(list1==null){
                res.next = list2;
                return result.next;
            }

            if(list2==null) {
                res.next = list1;
                return result.next;
            }
            if(list1.val<list2.val){
                res.next = new ListNode(list1.val);
                list1 = list1.next;
                res = res.next;
            }
            else {
                res.next = new ListNode(list2.val);
                list2 = list2.next;
                res = res.next;
            }
        }
        return result.next;
    }
}

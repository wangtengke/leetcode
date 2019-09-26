package contest.contest130;

import util.ListNode;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-03-31
 **/
public class NextGreaterNodeInLinkedListUser {
    public int[] nextLargerNodes(ListNode head) {
        int[] arr = new int[10000];
        int count = 0;
        while (head!=null){
            arr[count++] = head.val;
            head = head.next;
        }
        int[] ans = new int[count];
        for (int i = 0; i < count; i++) {
            for (int j = i+1; j < count; j++) {
                if(arr[i]<arr[j]){
                    ans[i]=arr[j];
                    break;
                }
                ans[i]=0;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        NextGreaterNodeInLinkedListUser nextGreaterNodeInLinkedListUser = new NextGreaterNodeInLinkedListUser();
        nextGreaterNodeInLinkedListUser.nextLargerNodes(l1);
    }
}

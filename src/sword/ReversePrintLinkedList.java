package sword;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 剑指Offer 从尾到头打印单链表
 *
 */
public class ReversePrintLinkedList {
    public class ListNode {
       int val;
       ListNode next = null;

       ListNode(int val) {
           this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<ListNode> stack = new Stack<>();
        if (listNode == null){
            return res;
        }


        ListNode current = listNode;

        while (current.next!=null){
            stack.push(current);
            current = current.next;
        }
        while (!stack.isEmpty()){
            res.add(stack.pop().val);
        }

        return res;
    }
}

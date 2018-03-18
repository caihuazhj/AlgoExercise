package linkList;

import java.util.Stack;

/**
 * 从尾到头打印单链表
 */
public class reversePrint {
    /**
     * 递归的方法，使用系统的栈
     * 但是当链表很长的时候，就会导致方法调用的层级很深，有可能造成栈溢出。
     */
    public static void reversePrint(Node head){
        if(head == null){
            return;
        }

        reversePrint(head.next);
        System.out.println(head.data);
    }

    /**
     * 采用栈，是基于循环实现的，代码的鲁棒性要更好一些
     * 不要想着先将单链表反转，然后遍历输出，这样会破坏链表的结构，不建议。
     * @param head
     */
    public  static void reversePrint1(Node head){
        if(head == null){
            return;
        }
        Stack<Node> stack = new Stack<Node>();
        Node current = head;

        //进栈
        while (current != null){
            stack.push(current);
            current = current.next;
        }
        //出栈打印
        while (stack.size()>0){
            System.out.println(stack.pop().data);
        }

    }

    public static void main(String[] args) {
        LinkList list1 = new LinkList();
        for(int i=0;i<4;i++){
            list1.addNode(i);
        }
        list1.printList(list1.head);
//        reversePrint(list1.head);
        reversePrint1(list1.head);
    }
}

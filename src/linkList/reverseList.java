package linkList;

import sun.awt.image.ImageWatched;

/**
 * 单链表的反转
 * 思路：
 * 从头到尾遍历原链表，每遍历一个结点，将其摘下放在新链表的最前端。
 * 注意链表为空和只有一个结点的情况。时间复杂度为O（n）
 */
public class reverseList {

    public static Node reverseList(Node head){
        //链表为空，返回null
        if(head == null){
            return null;
        }
        //只有一个结点
        if (head.next == null){
            return head;
        }

        Node current = head;
        Node reverseHead = null;//新链表的头节点
        Node next = null;//定义当前结点的下一个结点

        while (current != null){
            next = current.next;
            current.next = reverseHead;//将current的下一个结点指向新链表的头结点
            reverseHead = current;

            current = next; // 操作结束后，current节点后移
        }
        return reverseHead;
    }

    public static void main(String[] args) {
        LinkList list1 = new LinkList();
        for(int i=0;i<4;i++){
            list1.addNode(i);
        }
        list1.printList(list1.head);
        LinkList list2 = new LinkList();
        list2.head = reverseList(list1.head);
        list2.printList(list2.head);

    }
}

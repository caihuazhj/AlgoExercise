package linkList;

/**
 * 合并两个有序的单链表，合并之后的链表依然有序
 */
public class mergeLinkList {

    public static Node mergeLinkList(Node head1,Node head2){

        //考虑链表为空的情况
        if(head1 == null && head2 == null){
            System.out.println("两个链表均为空");
            return null;
        }
        if(head1 == null){
            return head2;
        }
        if (head2 == null){
            return head1;
        }

        Node head;//新链表的头节点
        Node current;//新链表的当前节点

        //首先确定头节点，将head1 和head2中较小的值 赋值给head
        if(head1.data <= head2.data){
            head = head1;
            current = head1;
            head1 = head1.next;
        }else{
            head = head2;
            current = head2;
            head2 = head2.next;
        }

        //往下走，比较各个链表的值赋值给current
        while (head1 != null && head2 != null){
            if (head1.data <head2.data){
                current.next = head1;  //新链表中，current指针的下一个结点对应较小的那个数据
                current = current.next;//current指针下移
                head1 = head1.next;
            }else {
                current.next = head2;
                current = current.next;
                head2 = head2.next;
            }
        }

        //合并剩余的元素
         if (head1 != null) { //说明链表2遍历完了，是空的
             current.next = head1;
         }
        if (head2 != null) { //说明链表1遍历完了，是空的
           current.next = head2;
        }


        return head;
    }

    public static void main(String[] args) {
        LinkList linkList1 = new LinkList();
        LinkList linkList2 = new LinkList();

        for(int i=0;i<4;i++){
            linkList1.addNode(i);
        }
        for(int i=4;i<8;i++){
            linkList2.addNode(i);
        }
//        linkList1.addNode(2);
//        linkList1.addNode(5);
//        linkList1.addNode(7);
//        linkList1.addNode(8);
//        linkList1.addNode(9);
//
//
//
//        linkList2.addNode(1);
//        linkList2.addNode(3);
//        linkList2.addNode(7);
//        linkList2.addNode(9);
//        linkList2.addNode(15);

        LinkList list3 = new LinkList();
        list3.head = mergeLinkList(linkList1.head,linkList2.head);
        list3.printList(list3.head);
    }
}

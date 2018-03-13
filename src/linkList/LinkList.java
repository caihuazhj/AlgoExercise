package linkList;


import java.net.SocketPermission;

public class LinkList {

    public Node head; //头节点
    public Node current; //当前节点

    //增加节点
    public void addNode(int data){
        if (head == null){
            head = new Node(data);
            current = head;
        }else{
            //创建新的结点，放在当前节点的后面（把新的结点合链表进行关联）
            current.next = new Node(data);
            //把链表的当前索引向后移动一位
            current = current.next;//此步操作完成之后，current结点指向新添加的那个结点
        }

    }

    //遍历输出列表
    public  void printList(Node node){
        if(node == null){
            System.out.println("列表为空");
            return;
        }
        //当前节点赋值
        current = node;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }


    public static void main(String[] args) {
        LinkList linkList = new LinkList();
//        linkList.addNode(1);
//        System.out.println(linkList.head.data);
//        System.out.println(linkList.current.data);
//        linkList.addNode(2);
//        System.out.println(linkList.current.data);
//        linkList.addNode(3);
//
        for(int i =1;i<10;i++){
            linkList.addNode(i);
        }
        linkList.printList(linkList.head);


    }
}

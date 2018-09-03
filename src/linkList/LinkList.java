package linkList;


/**
 * 包括了
 * 1、单链表的创建和遍历
 　2、求单链表中节点的个数
 　3、查找单链表中的倒数第k个结点（剑指offer，题15）
 　4、查找单链表中的中间结点
 */
public class LinkList {

    public Node head; //头节点
    public Node current; //当前节点

    //注：Node 内部类
    // 此处的两个成员变量权限不能为private，因为private的权限是仅对本类访问。
//    class Node {
//        int data; //数据域
//        Node next;//指针域
//
//        public Node(int data) {
//            this.data = data;
//        }
//     }
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

    //遍历输出链表
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


    //获取链表长度
    public int getLength(Node head){
        //注意首先检测链表是否为空
    	if(head == null){
    		System.out.println("列表为空");
    		return 0;
    	}
    	int length = 0;
    	current = head;
    	while(current != null){
    		length++;
    		current = current.next;
    	}
    	return length;
    }


    /**
     * 查找单链表中的倒数第k个结点
     * 一般思路
     * 计算长度 得到length 然后输出第length-k个节点即可
     * 需注意链表为空，k为0，k为1，k大于链表中节点个数时的情况
     * 时间复杂度为O（n）
     * @param index
     * @return
     */

    public int findNode(int index){
        //第一次遍历，得到length
        int length =0;
        if(head == null){
            System.out.println("链表为空，长度为0");
            return length;
        }
        current = head;
        while (current != null){
            length++;
            current = current.next;
        }
        //第二次遍历，得到倒数第k个节点'
        current = head;
        for(int i = 0;i<length-index;i++){
            current = current.next;
        }
        System.out.println(current.data);
        return  current.data;
    }

    /**查找单链表中的倒数第k个结点
     * 提升版
     * 这里需要声明两个指针：即两个结点型的变量first和second，
     * 首先让first和second都指向第一个结点，然后让second结点往后挪k-1个位置，
     * 此时first和second就间隔了k-1个位置，然后整体向后移动这两个节点，直到second节点走到最后一个结点的时候，
     * 此时first节点所指向的位置就是倒数第k个节点的位置。
     * 时间复杂度为O（n）
     * @param index
     * @return
     */
    public Node findNodeImproved(int index){
        if (head == null){
            System.out.println("");
            return head;
        }
        Node first = head;
        Node second = head;

        //将second向后移index个节点
        for(int i = 0;i<index;i++){
            second = second.next;

        }
        //让first和second结点整体向后移动，直到second结点为Null
        while (second != null){
            first = first.next;
            second = second.next;
        }

        System.out.println(first.data);
        return first;


    }

    /**查找单链表中的倒数第k个结点
     * 完美版
     * 要注意k等于0的情况；如果k大于链表中节点个数时，就会报空指针异常，所以这里需要做一下判断。
     * second结点往后挪k-1个位置
     * @param index
     * @return
     */
    public Node findNodePerfect(int index){

        if (index == 0 || head == null){
            System.out.println("");
            return head;
        }
        Node first = head;
        Node second = head;
        for(int i = 0;i<index-1;i++){
            second = second.next;
            //此时应加一个判断，是否已经越界
            if(second == null){
                System.out.println("超出范围");
                return second;
            }
        }
        //让first和second结点整体向后移动，直到second走到最后一个结点
        while (second.next != null) {
            first = first.next;
            second = second.next;
        }
        System.out.println(first.data);
        return first;

    }


    /**
     * 查找单链表的中间结点
     * 和上面一样，也是设置两个指针first和second，
     * 只不过这里是，两个指针同时向前走，second指针每次走两步，first指针每次走一步，
     * 直到second指针走到最后一个结点时，此时first指针所指的结点就是中间结点。
     * 注意链表为空，链表结点个数为1和2的情况。
     * 时间复杂度为O（n）。
     * @return
     */
    public Node findMidNode(Node head){
        //考虑链表为空时的情况
        if (head == null){
            System.out.println("链表为空");
            return null;
        }
        Node first = head;
        Node second = head;
        //每次移动时，让second结点移动两位，first结点移动一位
        //此时要考虑链表长度为1和2时的情况
        while (second != null && second.next != null){
            first = first.next;
            second = second.next.next;
        }
        System.out.println(first.data);
        //当n为偶数时，得到的中间结点是第n/2 + 1个结点。
        return first;
    }

    public static boolean isCycle(Node head){
        Node first = head;
        Node second = head;

        while (second!=null){
            first = first.next;
            second = second.next.next;

            if (first==second){
                return true;
            }
        }
        return false;
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
        for(int i =1;i<=10;i++){
            linkList.addNode(i);
        }
//        linkList.printList(linkList.head);
//
//        System.out.println(linkList.getLength(linkList.head));
//        linkList.findNodePerfect(0);
//        linkList.findNodeImproved(0);
        linkList.findMidNode(linkList.head);
    }
}

package binaryTree;



import java.util.Stack;

public class TreeNode {
    int data;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(int data){
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    public static TreeNode getParent(TreeNode subTree, TreeNode element){

        if(subTree == null){
            return null;
        }
        //左右孩子为element时，subTree为parent
        if(subTree.leftChild == element || subTree.rightChild == element){
            return subTree;
        }
        //递归左右子树
        if(getParent(subTree.leftChild,element) != null){
            TreeNode p = getParent(subTree.leftChild,element);
            return p;
        }else {
            return getParent(subTree.rightChild,element);
        }
    }

    public static TreeNode getLeftChild(TreeNode element){
        return (element != null)?element.leftChild:null;
    }

    public static TreeNode getRightChild(TreeNode element){
        return (element != null)?element.rightChild:null;
    }

    public static int getHeight(TreeNode subTree){
        if (subTree == null)
            return 0;// 递归结束：空树高度为0
        else {
            int i = getHeight(subTree.leftChild);
            int j = getHeight(subTree.rightChild);
            return (i < j) ? (j + 1) : (i + 1);
        }
    }

    //节点数
    public static int getSize(TreeNode subTree){
        if (subTree == null){
            return 0;
        }else {
            return 1+getSize(subTree.leftChild)+getSize(subTree.rightChild);
        }
    }
    // 在释放某个结点前, 该结点的左右子树应该已经释放, 所以应该采用后续遍历
    public static void destroySubTree(TreeNode subTree) {
        // 删除根为subTree的子树
        if (subTree != null) {
            destroySubTree(subTree.leftChild);
            destroySubTree(subTree.rightChild);
            // 删除根结点
            subTree = null;
        }
    }
    //输出某一结点
    public static void visited(TreeNode subTree) {
        if (subTree == null){
            System.out.println("null");;
        }
        System.out.println(subTree.data);

    }
    //前序遍历
    public static void preOrder(TreeNode subTree){
        if (subTree != null){
            visited(subTree);
            preOrder(subTree.leftChild);
            preOrder(subTree.rightChild);
        }
    }

    //中序遍历
    public static void inOrder(TreeNode subTree){
        if (subTree != null){
            inOrder(subTree.leftChild);
            visited(subTree);
            inOrder(subTree.rightChild);
        }
    }

    // 后续遍历
    public static void postOrder(TreeNode subTree) {
        if (subTree != null) {
            postOrder(subTree.leftChild);
            postOrder(subTree.rightChild);
            visited(subTree);
        }
    }
    //前序遍历 非递归
    public static void  nonRecPreOrder(TreeNode subTree){

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = subTree;
        while (node != null || !stack.empty()){
            if(node != null){
                visited(node);
                stack.push(node);
                node = node.leftChild;
            }else {
                node = stack.pop();  //栈！
                node = node.rightChild;
            }
        }

    }

    //中序遍历 非递归
    public static void nonRecInOrder(TreeNode subTree){

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = subTree;
        while (node != null || !stack.empty()){
            if(node != null){
                stack.push(node);
                node = node.leftChild;
            }else {
                node = stack.pop();
                visited(node);
                node = node.rightChild;
            }
        }
    }

    //后序遍历 非递归
    public static void nonRecPostOrder(TreeNode subTree) {
        if (null == subTree) { //为确保下面循环至少执行一次
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = subTree;
        TreeNode lastVisited = subTree;
        while (true) {
            // 左路入栈
            while (node.leftChild != null) {
                stack.push(node);    //第一次压栈, 为了访问左路后退出
                node = node.leftChild;
            }
            // 连续处理从右路返回的节点
            while (node.rightChild == null || node.rightChild == lastVisited) {
                // 访问并纪录本次访问节点
                visited(node);
                lastVisited = node;
                if (stack.empty()) {
                    return;
                }
                node = stack.pop();
            }
            // 处理从左路返回的节点
            stack.push(node);  // 第二次压栈, 为了访问右路后退出
            node = node.rightChild;
        }
    }
}

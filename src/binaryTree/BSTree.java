package binaryTree;

import java.util.Arrays;

public class BSTree {
    private TreeNode root = null;//定义根节点
    public  TreeNode getRoot(){
        return  root;
    }

    public BSTree(TreeNode root){
        this.root =root;
    }
    public boolean isEmpty(){
        return root == null;
    }

    public int getHeight(){
        return TreeNode.getHeight(root);
    }

    public int getSize(){
        return TreeNode.getSize(root);
    }

    //返回某节点的父节点
    public  TreeNode parent(TreeNode element){
        return (root == null || root == element)?null:TreeNode.getParent(root,element);
    }

    public void add(int data){
        add(root,data);
    }
    public boolean contains(int data){
        return contains(root,data);
    }

    private int minValue(){
        return findMin(root).data;
    }

    private int maxValue(){
        return findMax(root).data;
    }


    private TreeNode findMin(TreeNode subTree){

        if (subTree == null) {
            return null;
        }else if(null == subTree.leftChild){
            return subTree;
        }
        return findMin(subTree.leftChild);
    }

    private TreeNode findMax(TreeNode subTree){
        if (subTree == null) {
            return null;
        }else if(null == subTree.rightChild){
            return subTree;
        }
        return findMax(subTree.rightChild);
    }

    //添加节点
    //二叉搜索树 左<根<右
    private TreeNode add(TreeNode subTree, int data) {
        //树为空时，新建一个
        if (subTree == null){
            return new TreeNode(data);
        }else if(data >subTree.data){
            subTree.rightChild = add(subTree.rightChild,data);
            return subTree;
        }else if(data <subTree.data){
            subTree.leftChild = add(subTree.leftChild,data);
            return subTree;
        } // 这里限定搜索树中元素不重复

        return subTree;
    }

    private boolean contains(TreeNode subTree, int data) {
        if (null == subTree) {
            return false;
        } else if (data > subTree.data) {
            return contains(subTree.rightChild, data);
        } else if (data < subTree.data){
            return contains(subTree.leftChild, data);
        } else {
            return true;
        }
    }

    private TreeNode remove(TreeNode subTree, int data) {
        if (null == subTree) {
            return null;
        } else if (data > subTree.data) {
            return remove(subTree.rightChild, data);
        } else if (data < subTree.data) {
            return remove(subTree.leftChild, data);
        } else if (null == subTree.leftChild || null == subTree.rightChild) {  //节点匹配, 只有一个孩子或没有孩子
            return (subTree.leftChild != null) ? subTree.leftChild : subTree.rightChild;
        } else {      //节点匹配, 有两个孩子
            subTree.data = findMin(subTree.rightChild).data;
            subTree.rightChild = remove(subTree.rightChild, subTree.data);
            return subTree;
        }
    }

    public static void main(String[] args) {
        int[] values = {2,  9, 10, 7, 5, 6, 4};

        System.out.println("generate Nums:" + Arrays.toString(values));

        BSTree tree = new BSTree(new TreeNode(values[0]));
        for (int i = 1; i < values.length; i++) {
            tree.add(values[i]);
        }


        System.out.println("树高: " + TreeNode.getHeight(tree.getRoot()));
        System.out.println("树大小: " + TreeNode.getSize(tree.getRoot()));
        System.out.println("前序遍历:");
        TreeNode.nonRecPreOrder(tree.getRoot());
//        System.out.println("中序遍历:");
//        TreeNode.nonRecInOrder(tree.getRoot());
//        System.out.println("后序遍历:");
//        TreeNode.nonRecPostOrder(tree.getRoot());
    }
    private static boolean checkDup(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value)
                return true;
        }
        return false;
    }

}

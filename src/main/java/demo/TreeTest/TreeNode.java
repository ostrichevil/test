package demo.TreeTest;

/**
 * @author lizheng
 */
public class TreeNode {
    /**
     * 数组实现 形如 mParent -1 data 1 根结点， 0,5 0,6
     */
    private Object data;
    private int mParent;   //父亲节点的下标

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getmParent() {
        return mParent;
    }

    public void setmParent(int mParent) {
        this.mParent = mParent;
    }

    public static void main(String args) {

    }
}

class LinkedTreeNode {

    /**
     * 链表实现树 父节点和子节点  没有父节点即为根结点
     */
    private Object data;
    private LinkedTreeNode mParent;
    private LinkedTreeNode mChild;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public LinkedTreeNode getmParent() {
        return mParent;
    }

    public void setmParent(LinkedTreeNode mParent) {
        this.mParent = mParent;
    }

    public LinkedTreeNode getmChild() {
        return mChild;
    }

    public void setmChild(LinkedTreeNode mChild) {
        this.mChild = mChild;
    }
}

class BinaryTreeNode {
    /**
     * 二叉树节点    满二叉树 高度k，2^k-1个节点，即每个节点都有两个子节点
     *              完全二叉树 叶子在最后一层或者倒数第二层，并且在左边
     */
    private Object data;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }

}
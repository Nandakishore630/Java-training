package Trees;
import java.util.*;

class BinaryTree {

    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }

    Node root;

    // PREORDER
    void preorder(Node node){
        if(node==null) return;

        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }

    // INORDER
    void inorder(Node node){
        if(node==null) return;

        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }

    // POSTORDER
    void postorder(Node node){
        if(node==null) return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }

    // LEVEL ORDER
    void levelOrder(){
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            Node temp=q.poll();

            System.out.print(temp.data+" ");

            if(temp.left!=null)
                q.add(temp.left);

            if(temp.right!=null)
                q.add(temp.right);
        }
    }

    // HEIGHT OF TREE
    int height(Node node){
        if(node==null)
            return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return Math.max(leftHeight,rightHeight)+1;
    }

    // COUNT NODES
    int countNodes(Node node){
        if(node==null)
            return 0;

        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    // SUM OF NODES
    int sumNodes(Node node){
        if(node==null)
            return 0;

        return node.data + sumNodes(node.left) + sumNodes(node.right);
    }

    public static void main(String[] args){

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder:");
        tree.preorder(tree.root);

        System.out.println("\nInorder:");
        tree.inorder(tree.root);

        System.out.println("\nPostorder:");
        tree.postorder(tree.root);

        System.out.println("\nLevel Order:");
        tree.levelOrder();

        System.out.println("\nHeight: "+tree.height(tree.root));

        System.out.println("Total Nodes: "+tree.countNodes(tree.root));

        System.out.println("Sum of Nodes: "+tree.sumNodes(tree.root));
    }
}
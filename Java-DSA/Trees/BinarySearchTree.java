package Trees;
class BinarySearchTree {

    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
            left=right=null;
        }
    }

    Node root;

    // INSERT
    Node insert(Node root,int key){

        if(root==null)
            return new Node(key);

        if(key < root.data)
            root.left = insert(root.left,key);

        else if(key > root.data)
            root.right = insert(root.right,key);

        return root;
    }

    // SEARCH
    boolean search(Node root,int key){

        if(root==null)
            return false;

        if(root.data==key)
            return true;

        if(key < root.data)
            return search(root.left,key);

        return search(root.right,key);
    }

    // FIND MIN VALUE
    Node minValue(Node root){

        while(root.left!=null)
            root=root.left;

        return root;
    }

    // DELETE NODE
    Node delete(Node root,int key){

        if(root==null)
            return root;

        if(key < root.data)
            root.left = delete(root.left,key);

        else if(key > root.data)
            root.right = delete(root.right,key);

        else{

            if(root.left==null)
                return root.right;

            else if(root.right==null)
                return root.left;

            Node temp = minValue(root.right);

            root.data = temp.data;

            root.right = delete(root.right,temp.data);
        }

        return root;
    }

    // INORDER
    void inorder(Node root){

        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    // PREORDER
    void preorder(Node root){

        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // POSTORDER
    void postorder(Node root){

        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args){

        BinarySearchTree bst = new BinarySearchTree();

        bst.root = bst.insert(bst.root,50);
        bst.insert(bst.root,30);
        bst.insert(bst.root,20);
        bst.insert(bst.root,40);
        bst.insert(bst.root,70);
        bst.insert(bst.root,60);
        bst.insert(bst.root,80);

        System.out.println("Inorder Traversal:");
        bst.inorder(bst.root);

        System.out.println("\nSearch 40: "+bst.search(bst.root,40));

        bst.root = bst.delete(bst.root,20);

        System.out.println("After Deletion:");
        bst.inorder(bst.root);
    }
}
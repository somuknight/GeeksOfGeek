class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class BinaryTree {
    Node root;  //root of the binary tree

    Node head;//head of the double linked list

    void BTtoDLL(Node root){
        if (root==null)
            return;
        BTtoDLL(root.right);    //recursively convert to right sub-tree
        root.right=head;    //insert root in to DLL

        if (head!=null)
            head.left=root;
        head=root;
        BTtoDLL(root.left);

    }
    void printList(Node head){
        System.out.print("extracted doubly linked list is ");
        while (head!=null){
            System.out.print(head.data+" ");
            head=head.right;
        }
    }

    public static void main(String[] args) {
        /* Constructing below tree
               5
             /   \
            3     6
           / \     \
          1   4     8
         / \       / \
        0   2     7   9  */

        BinaryTree tree=new BinaryTree();

        tree.root=new Node(5);
        tree.root.left=new Node(9);
        tree.root.right=new Node(6);
        tree.root.left.left=new Node(1);
        tree.root.left.right=new Node(4);
        tree.root.left.left.left=new Node(0);
        tree.root.left.left.right=new Node(2);
        tree.root.right.right=new Node(8);
        tree.root.right.right.left=new Node(7);
        tree.root.right.right.right=new Node(3);

        tree.BTtoDLL(tree.root);
        tree.printList(tree.head);

    }
}

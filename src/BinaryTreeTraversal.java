import java.util.Arrays;

//creating a node with properties data(key) and left node and right node
class Nod{
    int key;
    Nod left,right;
    public Nod(int item){
        key=item;
        left=right=null;
    }
}
public class BinaryTreeTraversal {
    Nod root;
    BinaryTreeTraversal(){
        root=null;
    }
    //take input from an array and insert in to a completebinar tree
    public static Nod insertIntoTree(int[] a,Nod root,int i){
        if (i<a.length){
            Nod temp=new Nod(a[i]);
            root=temp;

            //if we take root as 0 then left child will 1(2*i+1) and right child will be 2(2*i+2)
            // as per indices of the given array
            root.left=insertIntoTree(a,root.left,2*i+1);
            root.right=insertIntoTree(a,root.right,2*i+2);
        }
    return root;
    }
    static void printPreorder(Nod nod){
        if(nod==null)
            return;
        System.out.print(nod.key+" ");
        printPreorder(nod.left);
        printPreorder(nod.right);
    }
    static void printInorder(Nod nod){
        if (nod==null)
            return;
        printInorder(nod.left);
        System.out.print(nod.key+" ");
        printInorder(nod.right);
    }
    static void printPostorder(Nod nod){
        if(nod==null)
            return;
        printPostorder(nod.left);
        printPostorder(nod.right);
        System.out.print(nod.key+" ");

    }
    //printing the post order traversal of a binary tree
    void printPostorder(){printPostorder(root);}
    //print preorder traversal of a tree
    void printPreorder(){printPreorder(root);}
    //print inorder traversal of a tree
    void printInorder(){printInorder(root);}

    public static void main(String[] args) {
        BinaryTreeTraversal tre=new BinaryTreeTraversal();
        BinaryTreeTraversal tre2=new BinaryTreeTraversal();
        int arr[]={1,2,3,4,5,6,7,8};

        tre2.root=tre2.insertIntoTree(arr,tre.root,0);

        tre.root=new Nod(5);
        tre.root.left=new Nod(9);
        tre.root.right=new Nod(6);
        tre.root.left.left=new Nod(1);
        tre.root.left.right=new Nod(4);
        tre.root.left.left.left=new Nod(0);
        tre.root.left.left.right=new Nod(2);
        tre.root.right.right=new Nod(8);
        tre.root.right.right.left=new Nod(7);
        tre.root.right.right.right=new Nod(3);

//        System.ou [Preorder();
//        System.out.println("InOrder traversal is :");
//        tre.printInorder();
//        System.out.println("postOrder traversal is: ");
//        tre.printPostorder();
        System.out.println("inorder traversal of tre2");
        tre2.printInorder();
    }
}

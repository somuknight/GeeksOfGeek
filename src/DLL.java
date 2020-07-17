public class DLL {
    Node head;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
//            prev=null;
//            next=null;
        }
    }
    public  void push(int newdata){
        Node new_node=new Node(newdata);
        new_node.next=head;
        new_node.prev=null;
        if (head!=null){
            head.prev=new_node;
        }
        head=new_node;
    }
    public  void insertAfter(Node prevNode,int newdata){
        if (prevNode==null){
            System.out.println("can't insert");
            return;
        }
        Node new_node=new Node(newdata);
        new_node.next=prevNode.next;
        prevNode.next=new_node;
        new_node.prev=prevNode;
        if (new_node.next!=null){
            new_node.next.prev=new_node;
        }
    }
    public  void append(int data){
        Node new_node=new Node(data);
        Node last=head;
        new_node.next=null;
        if(head==null){
            new_node.prev=null;
            head=new_node;
            return;
        }
        while (last.next!=null) {
            last = last.next;
        }
        last.next=new_node;
        new_node.prev=last;
    }
    public void printList(){
        Node last=head;
        System.out.println("traversal in forward direction");
        while (last!=null){
            System.out.print(last.data+" ");
            last=last.next;

        }
    }
    public static void main(String[] args) {
        DLL dll=new DLL();
        dll.append(5);
        dll.push(7);
        dll.push(8);
        dll.push(2);
        dll.append(12);
        dll.push(10);
        dll.printList();

    }
}

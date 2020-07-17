import java.util.Scanner;

public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    private void printlist(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    public static Node deleteElement(Node head,int position){
        if (head==null){
            return null;
        }
        Node temp=head;
        if(position==0)
        {
            head=temp.next;
            return head;
        }
        for(int i=0;temp!=null && i<position-1;i++){
            temp=temp.next;
        }
        if (temp==null || temp.next==null){
            return head;
        }
        Node next=temp.next.next;
        temp.next=next;

    return head;
    }
    private void isPresent(int element){
        Node n=head;
        int i=0;
        while (n!=null){
            if(element==n.data){
                System.out.println("element found");
                i++;
                break;
            }
            n=n.next;
        }
        if(i==0){System.out.println("element not found");}
    }
    public static void countLength(Node head){
        int count=0;
        while (head!=null){
            count++;
            head=head.next;
        }
        System.out.println(count);
    }
    public static  void insertAtTail(LinkedList llist,int data)
    {

    }
    public static void main(String[] args) {
        LinkedList llist=new LinkedList();
        llist.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(4);
        Node fourth=new Node(5);
        Node fifth=new Node(6);
        Node sixth=new Node(7);
        Node seventh=new Node(8);
        Node eighth = new Node(9);


        llist.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=seventh;
        seventh.next=eighth;
        llist.printlist();

        System.out.println("enter the element u want to search: ");
        int element=new Scanner(System.in).nextInt();
        llist.isPresent(element);

        System.out.println("enter the position of element u want to delete: ");
        int position=new Scanner(System.in).nextInt();
        //deleteElement(llist.head,position);
        System.out.println("after deleting the element: ");
        llist.printlist();
        System.out.println("length of the linked list is");
        llist.countLength(llist.head);
        //insertAtTail(llist,data);
    }
}

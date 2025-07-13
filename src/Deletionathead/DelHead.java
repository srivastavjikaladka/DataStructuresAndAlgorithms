package Deletionathead;

public class DelHead {
    int size;
    Node head;
    Node tail;
    public DelHead(){
        this.size=size;
    }

}
 class Node{
    int data ;
    Node next;

    public Node(int data, Node next){
        this.data= data;
        this.next= next;
    }
    public Node(int data){
        this.data = data;

    }
    public static Node deleteHead(Node head){
        if(head == null){
            return null;
        }
        Node temp = head;
        head = head.next;

        return head;

    }
    public static void display(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");


    }
     public static void main(String[] args) {

         // Create a hard-coded linked list:
         // 3 -> 12 -> 15 -> 18
         Node head = new Node(3);
         head.next = new Node(12);
         head.next.next = new Node(15);
         head.next.next.next = new Node(18);

         System.out.println("Original List");
         display(head);

         head = deleteHead(head);

         System.out.println("After deleting head");
         display(head);

     }

}

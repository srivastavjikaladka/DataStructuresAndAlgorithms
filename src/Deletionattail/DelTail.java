package Deletionattail;

public class DelTail {
    int size ;
    Node head;
    Node tail;


}
class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }

    public Node(int data , Node next){
        this.data = data;
        this.next = next;
    }
    public static Node deletetail(Node head){
        if(head ==null || head.next ==null){
            return null;
        }
        Node secondLast = head;
        while(secondLast.next.next!=null){
            secondLast = secondLast.next;

        }
        secondLast.next = null;
        return head;


    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp  = temp.next;

        }
        System.out.println("null");

    }
    public static void main(String[] args){
        Node head = new Node(2);
         head.next= new Node(5);
        head.next.next= new Node(7);
        head.next.next.next= new Node(8);
        head.next.next.next.next= new Node(10);
        System.out.println("Original List");
        display(head);

        head = deletetail(head);
        System.out.println("List after deleting last node");
        display(head);

    }

}

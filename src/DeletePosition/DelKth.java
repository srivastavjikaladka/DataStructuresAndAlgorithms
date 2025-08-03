package DeletePosition;

public class DelKth {
    int size;
    Node head;
    Node tail;

    public DelKth() {
        this.size = size;
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

    public static Node deletepos(Node head, int k){

        if(head ==null){
            return head;
        }
        if(k==1){
            Node temp = head;
            head = head.next;
            temp.next = null;
            return head;
        }
        Node temp = head;
        Node prev = null;
        int count  = 1;
        while(temp!=null && count<k){
            prev = temp;
            temp = temp.next;
            count++;
            }
            prev.next = temp.next;
            temp = null;
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
        int k = 3;

       head = deletepos(head,k);

        System.out.println("After deleting kth");
        display(head);

    }

}

public class LL {
    Node head;
    Node tail;
    int size;
    public LL(){
        this.size = 0;

    }
    //inserting a value to a linked list
    public void insert(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;

    }
    //displaying ll
    public void display(){
        Node temp  = head;
        while(temp!= null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    class Node{
        int value ;
        Node next;

        //When you already know the value and the next node.
        //this.value = value:
        //The left value is the field.
        //The right value is the parameter.
        //this refers to the current object, so we assign the parameter to the object's field.
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
//        When you're creating a node with just a value and next remains null
//            (which is fine as it defaults to null in Java).
//        Useful when you're adding nodes one by one and linking them later.
       public  Node(int value){

            this.value = value;
        }


    }
}

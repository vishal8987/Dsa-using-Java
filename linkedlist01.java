public class linkedlist01 {
    class Node{
        int value;
        Node next;
        public Node(int value)
        {
            this.value=value;
            this.next=null;
        }
    }
    private Node head=null;
    public Node tail =null;

    public void insertfirst(int value){
        Node node =new Node(value);
        // node.next=head;
        // head=node;
        if(head==null){
            head= node;
            tail=node;
        }
        else{
            Node temp =head;
            head =node;
            head.next=temp;

        }

    }
    public void Display(){
        Node current =head;
        if(head==null){
            System.out.println("list is empty");
            return ;
        }
        System.out.println("Adding new node  here:");
        while(current!=null)
        {
            System.out.print(current.value +" ");
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
         linkedlist01 vishal =new linkedlist01();
         vishal.insertfirst(1);
         vishal.Display();
         vishal.insertfirst(5);
         vishal.Display();
         vishal.insertfirst(10);
         vishal.Display();

    }

}

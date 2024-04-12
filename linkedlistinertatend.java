public class linkedlistinertatend {
    class Node{
        int value;
        Node next;
        public  Node(int value){
            this.value=value;
            this.next=null;

        }
    }
    public Node head =null;
    public Node tail=null;
    public void insertatend(int value)
    {
        Node vis=new Node(value);
        if(head==null){
            head =vis;
            tail =vis;
        }
        else{
            tail.next=vis;
            tail=vis;
        }
    }
    public void Display()
    {
        Node current=head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        System.out.println("Adding new node"+ " ");
        while(current!=null){
            System.out.print(current.value + " ");
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        linkedlistinertatend sak= new linkedlistinertatend();
        sak.insertatend(5);
        sak.Display();
        sak.insertatend(12);
        sak.Display();
    }
}

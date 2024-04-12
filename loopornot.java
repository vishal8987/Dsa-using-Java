public class loopornot {
    class Node{
        int data ;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;
    public static int size;
    public void inserfirst(int d)
    {
        Node vis =new Node(d);
        size++;
        if(head==null){
            
            head=vis;
            return;
        }
        vis.next=head;
        head=vis;
}
public boolean iscycle(){
    Node slow =head;
    Node fast =head;
    while(fast!=null && fast.next!=null){
        slow =slow.next;
        fast=fast.next.next;
        if(slow==fast)
        {
            return true;
        }
    }
    return false;
}
public void Display()
    {
        Node vish= head;
        if(head==null){
            System.out.println("List is Empty :");
            return;
        }
        // System.out.println("Adding new Elements :");
        while(vish!=null)
        {
            System.out.print(vish.data + "-->");
            vish=vish.next;
        }
        System.out.println("NULL");
    }
public static void main(String args[])
{
    loopornot sak= new loopornot();
        // sak.inserfirst(head);
        sak.inserfirst(2);
        sak.inserfirst(1);
        sak.inserfirst(2);
        sak.inserfirst(1);
        sak.Display();
        System.out.println(sak.size);
       System.out.println(sak.iscycle());
}
}

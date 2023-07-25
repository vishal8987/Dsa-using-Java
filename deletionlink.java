public class deletionlink {
    class Node{
        int value;
        Node next;
        public Node(int mah){
            this.value=mah;
            this.next=null;
        }
    }
    public deletionlink(){
        this.size=0;
    }
    public Node head=null;
    public Node tail=null;
    private int size;
    public void insertfirst(int data)
    {
        Node ptr= new Node(data);
        if(head==null)
        {
            head=ptr;
            tail=ptr;
            return;
        }
        ptr.next=head;
        head=ptr;
    }
    public void deleteatfirst()
    {

        if(head==null){
            return;
        }
        head=head.next; 
    }
    public Node get(int index)
    {
        Node node =head;
        for(int i=0;i<index;i++)
        {
            node =node.next;
        }
        return node;
    }
    public void deletelast()
    {
        if(head==null){
            System.out.println("list is empty:");
            return;
        }
       else{
        if(head!=tail)
        {
            Node now=head;
            while(now.next!=tail)
            {
                now=now.next;
            }
            tail=now;
            tail.next=null;
        }
        else{
            head=tail=null;
        }
       }

    }
    public void deleteany( int pos)
    {
        int count=1;
        if(pos==0)
        {
            System.out.println("list is empty:");
            return;
        }
        if(pos==1)
        {
            head=head.next;
            return;
        }
        if(pos>1)
        {
            Node temp=head;
            while(count<pos)
            {
                count++;
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        return;
    }
    public Node findval(int value)
    {
        Node node=head;
        while(node!=null)
        {
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public void Display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value + "-->");
            temp =temp.next;
        }
        System.out.println("END");
    }
    public static void main(String args[])
    {
        deletionlink vis= new deletionlink();
        vis.insertfirst(5);
        vis.insertfirst(6);
        vis.insertfirst(7);
        vis.insertfirst(8);
        vis.Display();
       /* * System.out.println("After deletion of the First  Node:");
        vis.deleteatfirst();
        vis.Display();
        System.out.println("After deletion of last Node:");
        //while(vis.head!=null){
        vis.deletelast();
        vis.Display();
       // }
       */
    //   vis.deleteany(2);
    //   vis.Display();
    vis.findval(69);
    vis.Display();
    }
}

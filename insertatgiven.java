public class insertatgiven {
    class Node {
        int value;
        Node next;
        public Node(int value  )
        {
            this.value=value;
            this. next= next;
        }
    }
    public Node head=null;
    public Node tail=null;
    public static int size;
// insert at first position:-->
    public void insertfirst(int value)
    {
        Node s=new Node(value);
        size++;
        if(head==null)
        {
            head=s;
            return;
        }
     s.next=head;
     head=s;
    }
    // insert at last position:-->
    public void insertatlast(int k)
    {
        Node vis=new Node(k);
        size++;
        if(head==null){
            head=vis;
            tail=vis;
        }
        tail.next=vis;
        tail=vis;
    }
    // insert at any random position :--->
    public void insertatuser(int val,int pos)
    {
        Node mak =new Node(val);
        if(pos==0)
        {
            insertfirst(val);
            return;
        }
        Node current=head;
        size++;
        for(int i=1;i<pos;i++)
        {
            current=current.next;
        }
       
        mak.next=current.next;
        current.next=mak;
    }
    // for display the nodes:-->
    public void Display()
    {
        Node current =head;
        if(current==null)
        {
            System.out.println("list is empty:");
            return;
        }
        System.out.println("Adding nodes at first:");
        while(current!=null)
        {
            System.out.print(current.value + "-->");
            current=current.next;
        }
        System.out.println("End");
    }
    

    public static void main(String args[])
    {
        insertatgiven vis =new insertatgiven();
       /*  vis.insertfirst(5);
        vis.insertfirst(6);
        vis.insertfirst(7);
        vis.insertfirst(8);
        vis.Display();
        */
         vis.insertatlast(5);
        vis.insertatlast(6);
        vis.insertatlast(7);
        vis.insertatlast(8);
        vis.Display();
       System.out.println("new");
         vis.insertatuser(23 ,0);
        vis.Display();
        System.out.println(insertatgiven.size);
        

    }
}

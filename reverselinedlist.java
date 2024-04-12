 class reverselinedlist {
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
        if(head==null){
            head=vis;
            return;
        }
        vis.next=head;
        head=vis;

    }
    public void reverse()
    {
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void deletenthfromend(int v)
    {
        //calculate size;
        // int size=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            size++;
            
        }
        if(v==size)
        {
            head=head.next;//remove first
            return;
        }
        //sze-v
        int i=1;
        int itofind = size-v;
        Node prev=head;
        while(i < itofind)
        {
            prev=prev.next;
            i++;
            
        }
        prev.next=prev.next.next;
        return;
    }
    public void Display()
    {
        Node vish= head;
        if(head==null){
            System.out.println("List is Empty :");
            return;
        }
        System.out.println("Adding new Elements :");
        while(vish!=null)
        {
            System.out.print(vish.data + "-->");
            vish=vish.next;
        }
        System.out.println("NULL");
    }
    public static void main(String args[])
    {
        reverselinedlist sak= new reverselinedlist();
        sak.inserfirst(5);
        sak.inserfirst(4);
        sak.inserfirst(3);
        sak.inserfirst(2);
        sak.inserfirst(1);
        sak.Display();

        // sak.reverse();
        // sak.Display();
        sak.deletenthfromend(3);
        sak.Display();
        // int sze=sak.size();
        System.out.println(sak.size);
         


    }
   

}

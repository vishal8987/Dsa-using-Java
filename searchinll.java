class searchinll{
    class Node{
        int value;
        Node next;
        public Node(int value)
        {
            this.value=value;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;
    public static int size;
    public void insertAtFirst(int val)
    {
        Node vis =new Node(val);
        size++;
        if(head==null){
            head= vis;
            return;
        }
        vis.next=head;
        head=vis;
    }
    public int search(int key)
    {
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.value==key){
                return i;
            }
             temp=temp.next;
             i++;
        }
        return -1;
    }
    public int helper(Node head , int key)
    {
        if(head==null){
            return -1;
        }
        if(head.value==key)
        {
            return 0;
        }
        int idx= helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
        
    }
    public int recsearch(int key)
    {
        return helper(head,key);
    }
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
         searchinll vis=new searchinll();
         vis.insertAtFirst(30);
         vis.insertAtFirst(20);
         vis.insertAtFirst(10);
         vis.insertAtFirst(5);
         vis.Display();
         vis.search(20);
         System.out.println(vis.size);
         System.out.println(vis.search(10));
         System.out.println(vis.search(2));
         System.out.println(vis.recsearch(30));
        
    }
    
}


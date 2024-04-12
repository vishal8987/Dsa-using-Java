class linkedlist{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data =d;
            next =null;
        }
    }
    public  void push(int new_data)
    {
         //Create a new node  
        Node new_node =new Node(new_data);
         //Checks if the list is empty  
         if(head==null){
            //If list is empty, both head and tail will point to new node 
         }
    }
}
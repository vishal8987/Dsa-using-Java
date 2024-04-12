public class palindrome {
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
    //slow -fast Approach
    public Node Findmid(Node head)//helper function
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow; // slow will be my mid Node--
    }
    public boolean checpal()
    {
        if(head==null || head.next==null)
        {
            return true;
        }
        //step 1: to mid mid

        Node mid=Findmid(head);
        // step:2 reverse the second half
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;//rght half head
        Node left=head;
        // step:3 check leaft half and right half of the palindrome
        while(right!=null)
        {
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
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
        palindrome sak= new palindrome();
        sak.inserfirst(1);
        sak.inserfirst(2);
        sak.inserfirst(1);
        // sak.inserfirst(2);
        // sak.inserfirst(1);
        sak.Display();
        System.out.println(sak.size);
        sak.Findmid(null);
        System.out.println(sak.checpal());
    }
}


// class Solution {
//     public void deleteNode(ListNode node) {
//         node.val=node.next.val;
//         node.next=node.next.next;
//     }
// }

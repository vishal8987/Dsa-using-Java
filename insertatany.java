// Pakage com.company;  
import java.util.*;
public class insertatany {
    class Node{
        int value;
        Node next;
        public Node(int value)
        {
            this.value=value;
            this.next=null;
        }
    }
    public  Node head=null;
    
    public void insertAtFirst(int val)
    {
        Node vis =new Node(val);
        if(head==null){
            head= vis;
            return;
        }
        vis.next=head;
        head=vis;
    }

    void insertAtPos(int val,int pos){
         Node vis =new Node(val);
        
        if(head==null){
            head= vis;
            return;
        }
        int i=1;
        Node temp=head;
        if(pos==1) insertAtFirst(val);
        
        else{
            while(i<pos-1){
            temp=temp.next;
            i++;
            }
        }
        vis.next=temp.next;
        temp.next=vis;
    
    }
    public void Display(){
        Node current =head;
        if(head==null){
            System.out.println("list is empty");
            return ;
        }
        System.out.println("Adding new node rom here:");
        while(current!=null)
        {
            System.out.print(current.value +" ");
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        insertatany nk= new insertatany();
        nk.insertAtFirst(10);
        nk.insertAtFirst(20);
        nk.insertAtFirst(30);
        nk.insertAtPos(40, 2);
        nk.Display();
    }

}

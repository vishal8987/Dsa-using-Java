package stack;
import java.util.ArrayList;
import java.util.Stack;
public class stack01 {
    static ArrayList<Integer>list=new ArrayList<>();

    public static boolean  isEmpty(){
        return list.size()==0;
    }

// push 
    public static void push1(int data){
        list.add(data);
    }

// pop
    public static int pop1(){
        if(isEmpty()){
            return -1;
        }
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    
// peek
    public static int peek1(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }
    public static void main(String[] args) {
        Stack s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}

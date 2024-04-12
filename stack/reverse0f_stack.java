package stack;
import java.util.*;
public class reverse0f_stack {

    public static void pushAtBottom(Stack<Integer>s ,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top =s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverse (Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int Top=s.pop();
        reverse(s);
        pushAtBottom(s, Top);
    }

    public static void printstack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
// 3 - 2 - 1 
        reverse(s);
        printstack(s);
// 1 - 2 - 3 
    }
}

package stack;

import java.util.Stack;

public class reverse_stack {

    public static String reversestring(String str){
        Stack<Character>s =new Stack<>();
        int idx=0;
        while(idx< str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result =new StringBuilder(" ");
        while (!s.isEmpty()) {
            char curr =s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str ="abc";
        String res = reversestring(str);
        System.out.println(res);
        
    }
}

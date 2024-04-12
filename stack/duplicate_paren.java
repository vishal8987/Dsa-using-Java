package stack;

import java.util.Stack;

public class duplicate_paren {

    public static boolean isDuplicate(String str){
        Stack<Character>s= new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            // opening , operands , operators 
            if(ch==')'){
                int count=0;
                while(!s.isEmpty() && s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){  // duplicate exists
                    return true;
                }
                else{
                     s.pop() ;
                }
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1="((a+b))";
        String str2 ="(a+b)";
        System.out.println(isDuplicate(str2));
    }
}

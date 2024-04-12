package stack;
import java.util.*;
public class next_greater_ele {
    public static void main(String[] args) {
        int arr[]={ 6,8,0,1,3};
        Stack<Integer>s= new Stack<>();
        int nxt_grtr[]= new int[arr.length];
        for(int i=arr.length-1 ;i>=0;i--){
            // 1 - while 
            while(!s.isEmpty()  && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            // if - else
            if(s.isEmpty()){
                nxt_grtr[i] =-1;
            } 
            else{
                nxt_grtr[i]=arr[s.peek()];
            }
            // push the element 
            s.push(i);
        }
        for(int i=0;i<nxt_grtr.length;i++){
            System.out.print(nxt_grtr[i] + " ");
        }
        System.out.println();
    }
}

// this is next greater Element :
// for nextgrater Left ---> only change in for loop it will start from 0 and goes upto n 
// for next smallest in the right :--> change only in 2nd condition of while loop(reverse the condition)
// for next smaller in the left --> then change the for loop and also change the 2nd condtion in the while loop:

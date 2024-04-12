package stack;

import java.util.Stack;

public class max_area_histo {
    public static void MaxArea(int arr[]){
        // next smaller right:
        int maxmarea=0;
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];


        Stack<Integer>s =new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);

        }

        // next smaller left:
        s =new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);

        }

        // Current Area :  width = nsr[i]-nsl[i]-1
        for(int i=0;i<arr.length;i++){
            int height =arr[i];
            int width =nsr[i]-nsl[i]-1;
            int currArea =height*width;
            maxmarea = Math.max(currArea, maxmarea);
        }
            System.out.println("Maximum Area in the Histogram is " + maxmarea);

    }
    public static void main(String[] args) {
        // int arr[ ]={ 2,5,6,2,3};
        int arr[ ]={ 2,4};

        MaxArea(arr);
    }
}

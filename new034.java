 
 class Solution{
    public static int check(Node head){
        if(head==null){
            return 1;
        }
        int c = check(head.next);
        if(c == 1){
            int sum=head.data+1;
            head.data=sum % 10;
            return sum / 10;
        }
        return 0;
    }
}
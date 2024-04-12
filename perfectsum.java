class Solution{
 
public int perfectSum(int arr[],int n, int sum) 
{ 
    // Your code goes here
   return findCount(arr,0,0,sum,new ArrayList<>());
} 
 
static int findCount(int[] arr,int index,int sum,int expectedSum,ArrayList<Integer> ds){
    
    if(index==arr.length){
        if(sum==expectedSum) return 1;
        else return 0;
    }
    ds.add(arr[index]);
    sum+=arr[index];
    int l=findCount(arr,index+1,sum,expectedSum,ds);
    sum-=ds.get(ds.size()-1);
    ds.remove(ds.size()-1);
    int r=findCount(arr,index+1,sum,expectedSum,ds);
    return l+r;
}
}
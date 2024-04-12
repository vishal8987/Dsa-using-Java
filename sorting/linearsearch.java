// package com.comapany;
public class linearsearch {
    public static void main(String[] args) {
        int[] nums={ 23,45,34,67,13,75,-23,65,78};
        int target=75;
        int ans=lsearch(nums, target);
        System.out.println(ans);
        
    }
    static int lsearch(int[] arr , int target)
    {
        if(arr.length==0){
        return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
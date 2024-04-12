public class maxmiteminarray {
    public static void main(String[] args) {
        int [] arr={ 1,45,34,56,23};
        System.out.println(max(arr));
    }
    private static int max(int[] arr)
    {
        // imagine that array is not empty
        int maxval= arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
}

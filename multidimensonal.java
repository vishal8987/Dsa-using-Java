import java.util.Arrays;
import java.util.Scanner;

public class multidimensonal {
    public static void main(String args[])
    {
        /*
          1,2,3
          4,5,6
          7,8,9
         */
        Scanner sc = new Scanner(System.in);
        // int arr[][]= new int [3][];
        // int [][] arr = {
        //         {1,2,3}, // oth index
        //         {4,5}, //oth index
        //         {6,7,8,9}  //oth index
        // };
        int arr[][] = new int[3][4];
        System.out.println(arr.length); // number of rows
        //input 
        for(int rows=0;rows<arr.length;rows++)
        {
            // for each col in each row
            for(int col=0;col<arr[rows].length;col++)
            {
                arr[rows][col] = sc.nextInt();
                
            }
        }  
        // output
       /*  for(int rows=0;rows<arr.length;rows++)
        {
            
            for(int col=0;col<arr[rows].length;col++)
            {
                
                System.out.print(arr[rows][col] + " ");
            }
            System.out.println();
        }
        */
        // for(int rows=0;rows<arr.length;rows++)
        // {
        //     System.out.println(Arrays.toString(arr[rows]));
        // }
        // enchanced for loop
        for(int [] a: arr)
        {
            System.out.println(Arrays.toString(a));
        }
    }
}

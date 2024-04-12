import java.util.*;

public class arraylist {
    public static void main(String[] args)
    {
        // Syntax
        ArrayList<Integer> vis =new ArrayList<>();

        // list.add(23);
        // list.add(22);
        // list.add(21);
        // list.add(20);
        // list.add(19);
        // list.add(18);
        // System.out.println(list);
        Scanner vs= new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            vis.add(vs.nextInt());
        }
        // get items
        for(int i=0;i<5;i++)
        {
            System.out.println(vis.get(i));
        }
    }
}

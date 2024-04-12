import java.util.LinkedList;  //JCF-->
public class llusing_jcf {

    public static void main(String[] args) {
        // Create-- Object --int /float/char-->Integer/Character/Float
        LinkedList<Integer>ll = new LinkedList<>();
        // add 
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);

        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
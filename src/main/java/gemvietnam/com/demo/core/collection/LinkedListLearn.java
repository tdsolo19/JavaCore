package gemvietnam.com.demo.core.collection;
import java.util.LinkedList;
public class LinkedListLearn {
    public static void main(String[] args) {
        // create a object LinkedList
        LinkedList<String> list = new LinkedList<String>();
        // add value in LinkedList
        list.add("java");
        list.add("python");
        list.add(".net");
        list.add("nodejs");

        // add value at the end list.
        list.addLast("IOS");

        // add value at the first list.
        list.addFirst("Android");

        //add value at position index 1
        list.add(1,"Yeah");

        // print all value of list
        System.out.println(list);

        // remove a value at the list
        list.remove("Yeah");

        // remove a value at position index 2;
        list.remove(2);

        System.out.println(list);

        // remove value first and last at the list
        list.removeFirst();
        list.removeLast();

        System.out.println(list);

        String val = list.get(2);
        list.set(2,(String) val + "changed");
        System.out.println(list);

    }
}

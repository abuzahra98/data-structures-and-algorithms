/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

import java.util.ArrayList;
import java.util.List;

import static linked.list.LinkedList.zipList;

public class App {



    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert("a");
        list.insert("b");
        list.insert("c");
        list.insert("d");
        list.insert("e");
        list.insert("f");
        System.out.println(list.toString());
//        List<String> list3 = new ArrayList<>();
//        Node current = list.head;
//        while (current!= null)
//        {
//         list3.add(current.value);
//         current=current.next;
//        }
//        list.head=null;
//            for(int i=0;i<list3.size();i++)
//        {
//         list.insert(list3.get(i));
//        }
//        System.out.println(list.toString());

        System.out.println(list.includes("a"));
        list.append("s");
        System.out.println(list.toString());
        list.insertBefore("b","s");
        System.out.println(list.toString());
       list.insertAfter("d" , "w");
        System.out.println(list.toString());
        System.out.println(list.kthFromEnd(2));

        LinkedList list2 = new LinkedList();
        list2.insert("1");
        list2.insert("2");
        list2.insert("3");
        list2.insert("4");
        list2.insert("5");
        list2.insert("6");



        System.out.println(zipList(list,list2));




    }
}

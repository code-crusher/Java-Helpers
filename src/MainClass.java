import com.sun.tools.javac.util.Log;
import sortings.HeapSort;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Vatsal on 04/08/16.
 */

public class MainClass {

    public static int arr[] = {1, 4, 7, 10, 23, 56, 1, 0, 3, 78, 65, 6};

    public static void main(String[] args) {

        //demoLinkedList();

        demoHeapSort();

    }

    private static void demoHeapSort() {


        HeapSort heapSort = new HeapSort();
        int arrSorted[] = heapSort.sort(arr);
        Logger logger = Logger.getLogger(MainClass.class.getName());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arrSorted[i] + " ");
            //logger.log(Level.INFO, "" + arrSorted[i]);
        }

    }

    private static void demoLinkedList() {
        int headVal = 0;
        int secVal = 1;
        int thirdVal = 3;

        LinkedListHelper listHelper = new LinkedListHelper(headVal);

        LinkedListHelper.ListNode secNode = listHelper.makeNode(secVal);

        LinkedListHelper.ListNode thirdNode = listHelper.makeNode(thirdVal);

        //  listHelper.addHead(thirdNode);

        listHelper.addNode(listHelper.head, secNode);
        listHelper.addNode(secNode, thirdNode);

        listHelper.printList(listHelper.head);

        //listHelper.deleteNodeKey(1);
        //listHelper.deleteNodePosition(3);

        System.out.println("The list has " + listHelper.length() + " nodes.");

        listHelper.swap(1, 0);

        listHelper.reverse();
        listHelper.printList(listHelper.head);
    }

}

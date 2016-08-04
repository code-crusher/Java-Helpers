/**
 * Created by Vatsal on 04/08/16.
 */

public class MainClass {

    public static void main(String[] args) {

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

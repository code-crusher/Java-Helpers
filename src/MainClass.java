/**
 * Created by Vatsal on 04/08/16.
 */

public class MainClass {


    public static void main(String[] args) {

        int headVal = 0;
        int secVal = 1;

        LinkedListHelper listHelper = new LinkedListHelper(headVal);

        LinkedListHelper.ListNode secNode = listHelper.makeNode(secVal);

        listHelper.addNode(listHelper.head, secNode);
    }

}

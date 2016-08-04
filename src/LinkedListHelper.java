import sun.rmi.runtime.Log;

/**
 * Created by Vatsal on 04/08/16.
 */
class LinkedListHelper {

    ListNode head;

    static class ListNode {

        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    // constructor
    LinkedListHelper(int headVal) {
        head = new ListNode(headVal);
    }

    // add nodes
    void addNode(ListNode currNode, ListNode nextNode) {
        nextNode.next = currNode.next;
        currNode.next = nextNode;
    }

    void addHead(ListNode node) {
        node.next = head;
        head = node;
    }

    // make new nodes
    ListNode makeNode(int value) {
        return new ListNode(value);
    }

    void printList(ListNode node) {

        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }

    }
}

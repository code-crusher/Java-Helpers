/**
 * Created by Vatsal on 04/08/16.
 */
class LinkedListHelper {

    public ListNode head;

    static class ListNode {

        int data;
        public ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    // constructor
    public LinkedListHelper(int headVal) {
        head = new ListNode(headVal);
    }

    // add nodes
    public void addNode(ListNode currNode, ListNode nextNode) {
        currNode.next = nextNode;
    }

    // make new nodes
    public ListNode makeNode(int value) {
        return new ListNode(value);
    }
}

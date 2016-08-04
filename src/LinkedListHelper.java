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

    // print the LinkedList
    void printList(ListNode node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    // drop node with specific value
    void deleteNodeKey(int value) {
        ListNode temp = head, prev = null;

        if (head != null && head.data == value) {
            head = temp.next;
            System.out.println("dropped: " + temp.data);
            return;
        }

        while (temp.next != null && temp.data != value) {
            prev = temp;
            temp = temp.next;
        }

        if (temp.next != null && prev != null) {
            prev.next = temp.next;
            System.out.println("dropped: " + temp.data);
        } else {
            System.out.println("Value not found!");
        }
    }

    void deleteNodePosition(int position) {

        ListNode temp = head, prev = null;

        if (head != null && position == 0) {
            head = temp.next;
            System.out.println("dropped: " + temp.data);
            return;
        }

        while (temp != null && position != 0) {
            prev = temp;
            temp = temp.next;
            position--;
        }

        if (temp != null) {
            prev.next = temp.next;
            System.out.println("dropped: " + temp.data);
        } else
            System.out.println("Position not found!");
    }
}

/**
 * Created by Vatsal on 04/08/16.
 */
public class LinkedListHelper {

    public ListNode head;

    public static class ListNode {

        public int data;
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
        nextNode.next = currNode.next;
        currNode.next = nextNode;
    }

    public void addHead(ListNode node) {
        node.next = head;
        head = node;
    }

    // make new nodes
    public ListNode makeNode(int value) {
        return new ListNode(value);
    }

    // print the LinkedList
    public void printList(ListNode node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    // drop node with specific value
    public void deleteNodeKey(int value) {
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

    public void deleteNodePosition(int position) {

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

    // return list length
    public int length() {
        ListNode temp = head;
        int i = 0;

        if (temp == null)
            return i;

        ++i;
        while (temp.next != null) {
            temp = temp.next;
            ++i;
        }
        return i;
    }

    // swap the 2 vals
    public void swap(int val1, int val2) {
        ListNode temp1 = head, temp2 = head, prev1 = null, prev2 = null, temp3 = null;

        if (val1 == val2)
            return;
        
        while (temp1 != null && temp1.data != val1) {
            prev1 = temp1;
            temp1 = temp1.next;
        }

        if (temp1 == null) {
            System.out.println(val1 + " not found!");
            return;
        }

        while (temp2 != null && temp2.data != val2) {
            prev2 = temp2;
            temp2 = temp2.next;
        }

        if (temp2 == null) {
            System.out.println(val2 + " not found!");
            return;
        }

        if (prev1 != null) {
            prev1.next = temp2;
        } else
            head = temp2;

        if (prev2 != null) {
            prev2.next = temp1;
        } else
            head = temp1;

        temp3 = temp2.next;
        temp2.next = temp1.next;
        temp1.next = temp3;
    }
}

package LinkedList;

import java.util.*;

public class LinkedListInt {

    private Node head;
    public LinkedListInt(int item) {
        head = new Node();
        head.value = item;
        head.link = null;
    }

    public boolean insertItemAtBack(int item) { // add code to add an item the end of the list
        if (head == null) {
            Node newHead = new Node();
            newHead.value = item;
            head = newHead;
            return true;
        }

        Node current = head;
        while (current.link != null) {
            current = current.link;
        }

        Node newNode = new Node();
        newNode.value = item;
        current.link = newNode;

        return true;
    }

    public boolean insertItemAtFront(int item) {    // add code to add an item a front of the list

        Node newHead = new Node();
        newHead.value = item;
        newHead.link = head;
        head = newHead;
        return true;
    }

    public boolean deleteItem(int item) {   // add code to delete an item from anywhere in the list

        if (head == null) {
            return false;
        } if (head.value == item) {
            head = head.link;
            return true;
        }

        Node current = head;

        while (current.link != null) {
            if (current.link.value == item) {
                current.link = current.link.link;
                return true;
            }
            current = current.link;
        }
        return false;
    }

    public void printList() {       // add a code to delete an item from anywhere in the list

        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.link;
        }
    }

    public void sortListDesc() {        // add a code to sort the list descending order

        ArrayList<Integer> list = new ArrayList<Integer>();
        Node current = head;
        while (current != null) {
            list.add(current.value);
            current = current.link;
        }
        Collections.sort(list);
        Collections.reverse(list);
        current = head;
        int i = 0;
        while (current != null) {
            current.value = list.get(i);
            current = current.link;
            i++;
        }
    }

    class Node {
        private int value;
        private Node link;
    }
}
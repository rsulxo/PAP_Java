package LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedListInt list = new LinkedListInt(2);
        list.insertItemAtFront(4);
        list.insertItemAtFront(8);
        list.insertItemAtBack(5);
        list.insertItemAtBack(9);
        list.deleteItem(2);
        System.out.println("======== Unsorted List =========");
        list.printList();
        System.out.println("======= Sorted List ======");
        list.sortListDesc();
        list.printList();
    }

}
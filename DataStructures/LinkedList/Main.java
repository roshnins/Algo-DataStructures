package DataStructures.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);

        /*
         * // Print Items
         * 
         * myLinkedList.getHead();
         * myLinkedList.getTail();
         * myLinkedList.getLength();
         * myLinkedList.printList();
         * 
         */

        myLinkedList.append(2);

        /*
         * // Prepend items
         * 
         * myLinkedList.prepend(0);
         * myLinkedList.printList();
         * 
         */

        /*
         * // Remove Last Node
         * 
         * // Remove 2 from list - Returns 2
         * System.out.println(myLinkedList.removeLast().value);
         * // Remove 1 from list - Returns 1
         * System.out.println(myLinkedList.removeLast().value);
         * // 0 items in list - Returns null
         * System.out.println(myLinkedList.removeLast());
         * 
         */

        /*
         * // Remove first node
         * 
         * // Remove 1 from list - Returns 1
         * System.out.println(myLinkedList.removeFirst().value);
         * // Remove 2 from list - Returns 2
         * System.out.println(myLinkedList.removeFirst().value);
         * // 0 items in list - Returns null
         * System.out.println(myLinkedList.removeFirst());
         * 
         */

        /*
         * // Get node by index
         * 
         * myLinkedList.append(3);
         * myLinkedList.append(4);
         * System.out.println(myLinkedList.get(2).value + "\n");
         * myLinkedList.printList();
         * 
         */

        /*
         * // Set node by index
         * 
         * myLinkedList.append(3);
         * myLinkedList.append(4);
         * myLinkedList.set(2, 11);
         * myLinkedList.printList();
         * 
         */

        /*
         * // Insert at an index
         * 
         * myLinkedList.insert(1, 3);
         * myLinkedList.printList();
         * 
         */

        /*
         * // Remove at an index
         * 
         * myLinkedList.append(3);
         * myLinkedList.append(4);
         * myLinkedList.remove(2);
         * myLinkedList.printList();
         * 
         */

        // Reverse a list

        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.reverse();
        myLinkedList.printList();

    }

}

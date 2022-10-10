package DataStructures.DoublyLinkedList;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);

        /*
         * // Print Items
         * 
         * myDLL.getHead();
         * myDLL.getTail();
         * myDLL.getLength();
         * myDLL.printList();
         * 
         */

        /*
         * // Append to end
         * 
         * myDLL.append(2);
         * myDLL.printList();
         * 
         */

        myDLL.append(2);

        /*
         * // Remove Last Node
         * 
         * // Remove 2 from list - Returns 2
         * System.out.println(myDLL.removeLast().value);
         * // Remove 1 from list - Returns 1
         * System.out.println(myDLL.removeLast().value);
         * // 0 items in list - Returns null
         * System.out.println(myDLL.removeLast());
         */

        /*
         * // Prepend
         * 
         * myDLL.prepend(0);
         * myDLL.printList();
         */

        /*
         * // Remove first node
         * 
         * // Remove 1 from list - Returns 1
         * System.out.println(myDLL.removeFirst().value);
         * // Remove 2 from list - Returns 2
         * System.out.println(myDLL.removeFirst().value);
         * // 0 items in list - Returns null
         * System.out.println(myDLL.removeFirst());
         */

        /*
         * // Get node by index
         * 
         * myDLL.append(3);
         * myDLL.append(4);
         * System.out.println(myDLL.get(1).value);
         * System.out.println(myDLL.get(2).value + "\n");
         * myDLL.printList();
         * 
         */

        /*
         * // Set node by index
         * 
         * myDLL.append(3);
         * myDLL.append(4);
         * myDLL.set(2, 11);
         * myDLL.printList();
         * 
         */

        /*
         * // Insert at an index
         * 
         * myDLL.insert(1, 3);
         * myDLL.printList();
         * 
         */

        // Remove at an index

        myDLL.append(3);
        myDLL.append(4);
        myDLL.remove(2);
        myDLL.printList();

    }

}

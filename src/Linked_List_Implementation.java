public class Linked_List_Implementation {
    private Node head;
    private Node tail;
    private int size;

    public Linked_List_Implementation() {
        this.size = 0;
    }

    private class Node {
        private int value; // data stored in the node
        private Node next; // pointer pointing to next node

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}

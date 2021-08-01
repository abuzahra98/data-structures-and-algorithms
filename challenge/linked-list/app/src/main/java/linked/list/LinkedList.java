package linked.list;

public class LinkedList {
    Node head;
    LinkedList()
    {
        this.head=null;
    }

    public void insert(String value) {
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;

    }

    public boolean includes(String value) {
        Node currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public String toString() {
        String str = "";
        Node currentNode = this.head;
        while (currentNode != null) {
            str += "{ " + currentNode.value + " } -> ";
            currentNode = currentNode.next;
        }
        str += "NULL";
        return str;
    }

}
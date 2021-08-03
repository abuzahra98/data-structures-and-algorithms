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

    public void append(String value){
        Node currentNode = this.head;
        while (currentNode != null){
            if(currentNode.next == null){
                Node newNode = new Node(value);
                newNode.next = null;
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
        }

}

    public void insertBefore(String value, String newValue){
        Node currentNode = this.head;
        while (currentNode != null){
            if (currentNode.next.value == value){
                Node newNode = new Node(newValue);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
        }

    }

    public void insertAfter(String value, String newValue){
        Node currentNode = this.head;
        while (currentNode != null){
            if (currentNode.value == value){
                Node newNode = new Node(newValue);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
        }

    }

    public Object kthFromEnd (int k){
        int count = counter();
        if (k<0)
        {
            return "Invalid value";
        }
        int newCount = (count - k - 1);
        Node currentNode = this.head;
        while(currentNode != null){
            if(newCount < 0){
                return "Invalid value";
            }
            else if (newCount == 0){
                return currentNode.value;
            }
            currentNode = currentNode.next;
            newCount --;
        }
        return currentNode.value;
    }

    public int counter() {
        Node currentNode = this.head;
        int counter = 0;
        while(currentNode != null){
            counter++;
            currentNode = currentNode.next;
        }
        return counter;
    }

    public static LinkedList zipList(LinkedList one, LinkedList two){
        if(one == null)
            return two;
        if(two == null){
            return one;
        }
        Node current1 = one.head;
        Node current2 = two.head;
        Node tempVar;
        while (current1 != null){

            tempVar = current1.next;
            current1.next = current2;
            current1.next.next = tempVar;
            current1.next = current1.next.next;
            current2 = current2.next;


        }
        return one;
    }
    public static class Zipping{
        public static void main(String[] args){
            System.out.println("Let's zip");
        }
    }



    public static  LinkedList zip(LinkedList first, LinkedList second){
        Node node1 = first.head;
        Node node2 = second.head;
        while(node1 != null && node2 != null){
            Node node1Next = node1.next;
            Node node2Next = node2.next;
            node1.next = node2;
            node2.next = node1Next;
            node1 = node1Next;
            node2 = node2Next;
        }

        return first;
    }

}
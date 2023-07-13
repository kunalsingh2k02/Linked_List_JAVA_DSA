class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}

class MyLinkedList {
    private Node head;
    private int length;

    public MyLinkedList() {
        head = null;
        length = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= length) {
            return -1;
        }
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        length++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > length) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
        } else if (index == length) {
            addAtTail(val);
        } else {
            Node newNode = new Node(val);
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
            length++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= length) {
            return;
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        length--;
    }
}

public class DesignLinkedList{
    public static void main(String[] args) {
        
    }
}

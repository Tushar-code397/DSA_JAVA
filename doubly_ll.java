public class doubly_ll {
    public class node {
        int data;
        node next;
        node prev;

        public node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;

        }
    }

    public static node head;
    public static node tail;
    public static int size;

    // add first position
    public void addfirst(int data) {
        node newnode = new node(data);
        size++;
        if (head = null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    // add at last
    public void addlast(int data) {
        node newnode = new node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        if (head.next == null) {
            head.next = newnode;
            return;
        }
        node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = newnode;
    }

    public static void print() {
        node temp = head;
        while (head != null) {
            System.out.println(temp.data + " <->");
            temp = temp.next;

        }
        System.out.println("null");
    }

    public static int removefirst() // remove first node
    {
        if (head == null) {
            System.out.println("empty linked list");
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public static int removelast() // remove last
    {
        if (head == null) {
            System.out.println("empty linked list");
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        node ptr = head;
        while (ptr.next.next != null) {
            ptr = ptr.next;
        }
        int val = ptr.next.data;
        ptr.next = null;
        return val;
    }

    public static void main(String args[]) {
        linkedlist ll = new linkedlist(); // object creation of class linked list
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addlast(0);
        ll.removefirst();
        ll.print();
        ll.removelast();
        ll.print();

    }
}

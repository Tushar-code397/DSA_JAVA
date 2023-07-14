public class linkedlist {
    public static class Node { // node creation
        int data;
        Node next;

        public Node(int data) // initial node
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head; // head and tail node
    public static Node tail;
    public static int size;

    public void addfirst(int data) // add node at first
    {
        Node newnode = new Node(data); // create new node
        size++;
        if (head == null) // if list is empty
        {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

    }

    public void addlast(int data) // add node at last
    {
        Node newnode = new Node(data); // create new node
        size++;
        if (head == null) // if list is empty
        {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;

    }

    public static void print() { // to print link list
        Node temp = head;
        if (temp == null) {
            System.out.println("empty");
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void add(int data, int index)// to add at index
    {

        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i != index - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public static int removefirst() { // to remove first element from linked list
        if (head == null) {
            System.out.println("empty");
            return -1;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = head.data;
        head = head.next;
        return val;
    }

    public static int removelast() { // to remove last element from linked list
        if (head == null) {
            System.out.println("empty");
            return -1;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static void search(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println(i);
            }

            temp = temp.next;
            i++;
        }
    }

    public static int res_search(int key) // recursive search
    {
        return res_helper(head, key);
    }

    public static int res_helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = res_helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public static void reverse() {
        Node prev = null;
        Node curr = tail = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void nthfromend(int n) // remove nth element from end
    {
        if (n == size) {
            head = head.next;
            return;
        }
        int i = 1;
        int itofind = size - n;
        Node prev = head;
        while (i < itofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static Node findmid(Node head)// function to find mid using slow-fast pointer method
    {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean checkpalindrome() // to check given ll is palindrome or not
    {
        // base case
        if (head == null || head.next == null) {
            return true;
        }
        // step1-find mid
        Node midnode = findmid(head);

        // step-2 reverse 2nd half of list

        Node prev = midnode;
        Node curr = tail = midnode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // step3 check if they are equal
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;

            }
            left = left.next;
            right = right.next;

        }
        return true;
    }

    public static boolean detectcycle()// detect cycle in a linkedlist
    {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;

            }
        }
        return false;
    }

    public static void removecycle()// remove cycle in ll
    {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;

            }
        }
        if (cycle == false) {
            return;
        }
        // find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        prev.next = null;
    }

    public Node mergesort(Node head) {
        // base condition
        if (head == null || head.next == null) {
            return head;

        }
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // right and left ll
        Node righthead = mid.next;
        mid.next = null;
        Node newleft = mergesort(head);
        Node newright = mergesort(righthead);

        // merge
        return merge(newleft, newright);
    }

    public static Node merge(Node h1, Node h2) {
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while (h1 != null && h2 != null) {
            if (h1.data <= h2.data) {
                temp.next = h1;
                h1 = h1.next;
                temp = temp.next;
            } else {
                temp.next = h2;
                h2 = h2.next;
                temp = temp.next;
            }
        }
        while (h1 != null) {
            temp.next = h1;
            h1 = h1.next;
            temp = temp.next;
        }
        while (h2 != null) {
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }
        return mergedll.next;
    }

    public static void zigzag() // to convert given linklist into zigzag linklist
    {
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        Node left = head;
        Node right = prev;
        Node nextl, nextr;

        // alternative merging
        while (left != null && right != null) {
            nextl = left.next;
            left.next = right;
            nextr = right.next;
            right.next = nextl;
            left = nextl;
            right = nextr;

        }

    }

    public static void main(String args[]) {
        linkedlist ll = new linkedlist(); // object creation of class linked list
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.print();
        // ll.add(0, 2);
        // print();
        // System.out.println(ll.size);
        // int k = removelast();
        // System.out.println(k);
        // search(0);
        // System.out.println(res_search(0));
        // reverse();
        // nthfromend(3);
        // print();
        // System.out.println(checkpalindrome());

        // head = new Node(1);

        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;

        // System.out.println(detectcycle());
        // removecycle();
        // System.out.println(detectcycle());
        // ll.head = ll.mergesort(ll.head);
        // ll.print();
        ll.zigzag();
        ll.print();
    }
}

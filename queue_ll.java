public class queue_ll {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class queue {
        static node head = null;
        static node tail = null;

        public static boolean isempty() {
            return head == null;
        }

        public static void add(int data) {
            node newnode = new node(data);

            if (head == null) {
                head = tail = newnode;
            }
            tail.next = newnode;
            tail = newnode;
        }

        public static int remove() {
            if (isempty()) {
                System.out.println("empty");
                return -1;
            }
            int front = head.data;
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;

        }

        public static int peek() {
            if (isempty()) {
                System.out.println("empty");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String args[]) {
        queue q = new queue();
        q.add(1);
        q.add(3);

        q.add(2);

        while (!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

}

public class queue_array {
    static class queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        // queue using array

        queue(int n) {
            arr = new int[n];
            rear = -1;
            front = -1;
            size = n;
        }

        public static boolean isempty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("queue is full");

            }
            rear = rear + 1;
            arr[rear] = data;

        }

        public static int remove() {
            if (isempty()) {
                System.out.println("empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        public static int peek() {
            if (isempty()) {
                System.out.println("empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String args[]) {
        queue q = new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

public class circular_queue {

    static class queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        queue(int n) {
            arr = new int[n];
            rear = -1;
            front = -1;
            size = n;
        }

        public static boolean isfull() {
            return (rear + 1) % size == front;
        }

        public static boolean isempty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (isfull()) {
                System.out.println("queue is full");

            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;

        }

        public static int remove() {
            if (isempty()) {
                System.out.println("empty");
                return -1;
            }
            int result = arr[front + 1] % size;

            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek() {
            if (isempty()) {
                System.out.println("empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String args[]) {
        queue q = new queue(5);
        q.add(1);
        q.add(3);

        q.add(2);

        while (!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

}

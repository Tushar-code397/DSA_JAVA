import java.util.ArrayList; // implementation using array list

public class stack1 {
    static class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // is empty
        public static boolean isempty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static int pop() {
            if (isempty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public static int peek() {
            if (isempty()) {
                return -1;

            }
            int top = list.get(list.size() - 1);
            return top;
        }
    }

    public static void main(String args[]) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (s.isempty() != true) {
            System.out.println(s.peek());
            s.pop();
        }
    }

}

import java.util.*;

public class stack_ques {

    public static void pushatbottom(Stack<Integer> s, int data) // to push element at ottom of stack -ques-1
    {
        if (s.empty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatbottom(s, data);
        s.push(top);
    }

    public static String reversestring(String str) // to reverse a string -ques2
    {
        Stack<Character> s1 = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s1.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s1.empty()) {
            char curr = s1.pop();
            result.append(curr);

        }
        return result.toString();
    }

    public static void print(Stack<Integer> s) {
        while (!s.empty()) {
            System.out.println(s.pop());
        }
    }

    public static void reversestack(Stack<Integer> s) // to reverse a sttog - ques -3
    {
        if (s.empty()) {
            return;
        }
        int top = s.pop();
        reversestack(s);
        pushatbottom(s, top);
    }

    public static void stockspan(int stock[], int span[]) // stockspan problem-ques-4
    {
        Stack<Integer> s = new Stack<>();
        stock[0] = 1;
        s.push(0);
        for (int i = 1; i < stock.length; i++) {
            int currprice = stock[i];
            while (!s.empty() && currprice > stock[s.peek()]) {
                s.pop();
            }
            if (s.empty()) {
                span[i] = i + 1;
            } else {
                int prevhigh = s.peek();
                span[i] = i - prevhigh;
            }
            s.push(i);

        }
    }

    public static void nextgreater() { // ques-5
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nxtgreat[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nxtgreat[i] = -1;
            } else {
                nxtgreat[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for (int i = 0; i < nxtgreat.length; i++) {
            System.out.print(nxtgreat[i] + " ");
        }
        System.out.println();
    }

    public static boolean paranthesisisvalid(String str) // to check for vallid parathesis -ques-6
    {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
                s.push(str.charAt(i));
            } else {
                if (s.empty()) {
                    return false;
                }

                if ((s.peek() == '(' && str.charAt(i) == ')') || (s.peek() == '{' && str.charAt(i) == '}')
                        || (s.peek() == '[' && str.charAt(i) == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean paranthesisduplicate(String str) // to check for duplicates parathesis -ques-7
    {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;

                } else {
                    s.pop();
                }
            } else {
                s.push(str.charAt(i));
            }
        }
        return false;

    }

    public static void maxarea(int arr[]) // to find area of a histogram=ques-8
    {
        int max = 0;
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];

        // for next smaller right
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);

        }

        // for next smaller left

        s = new Stack<>();
        for (int i = 0; i <= arr.length - 1; i++) {
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);

            // current average
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currarea = height * width;
            max = Math.max(max, currarea);

        }
        System.out.println(max);
    }

    public static void main(String args[]) {
        // ques-1

        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // pushatbottom(s, 4);
        // while (!s.empty()) {
        // System.out.println(s.pop());
        // }

        // ques2

        // String str = "abc";
        // String str1 = reversestring(str);
        // System.out.println(str1);

        // ques -3
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // // print(s);
        // reversestack(s);
        // print(s);

        // ques4
        // int stock[] = { 100, 80, 60, 70, 60, 85, 100 };
        // int span[] = new int[stock.length];
        // stockspan(stock, span);
        // for (int i = 0; i < span.length; i++) {
        // System.out.print(span[i] + ",");

        // ques-5
        // nextgreater();

        // ques-6
        // String str = "(({[]}}))";
        // System.out.println(paranthesisisvalid(str));

        // ques-7
        // String str = "(((a+b)+(c+d)))";
        // System.out.println(paranthesisduplicate(str));

        // ques-8
        int arr[] = { 2, 4 };
        maxarea(arr);
    }
}

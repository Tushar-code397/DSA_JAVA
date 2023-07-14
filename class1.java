public class class1 {

    static int a = 10;
    static int b = 20;

    public static void add() {
        int c = a + b;
        System.out.println(c);
    }

    public static void sub() {
        int c = a - b;
        System.out.println(c);
    }

    public static void mul() {
        int c = a * b;
        System.out.println(c);
    }

    public static void div() {
        int c = a / b;
        System.out.println(c);
    }

    public static void imp() // implicit
    {
        int a1 = 10;
        int a2 = 20;
        float area = a1 * a2;
        System.out.println(area);
    }

    public static void exp() // explicit
    {
        float a1 = 10.1f;
        float a2 = 20.2f;
        int area = (int) (a1 * a2);
        System.out.println(area);
    }

    public static void main(String args[]) {

        // explicit
        // float a = 10.1111111111111111111111f;
        // int b = (int) a;
        // System.out.println(b);

        // add();
        // sub();
        // mul();
        // div();

        imp();
        exp();

    }
}

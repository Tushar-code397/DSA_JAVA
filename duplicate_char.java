public class duplicate_char {

    static final int total_no = 256;

    public static void fillcount(String str, int count[]) {
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
    }

    public static void printdup(String str) {
        int count[] = new int[total_no];
        fillcount(str, count);

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.println((char) i + " " + count[i]);
            }
        }
    }

    public static void main(String args[]) {
        String str = "bbaaac";
        printdup(str);
    }
}

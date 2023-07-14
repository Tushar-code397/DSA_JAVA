public class stringscompression {
    // amazon problem important
    public static void compres(String str) {
        String newstr = "";
        int n = str.length() - 1;
        for (int i = 0; i <= n; i++) {
            Integer count = 1; // here count is initalized as integer object because we will have to convert it
                               // into string to add in our compressed string
            while (i < n && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if (count > 1) {
                newstr += count.toString();
            }

        }
        System.out.println(newstr);

    }

    public static void main(String args[]) {
        String str = "aaabbbccc";
        String st = "abc";
        compres(st);
    }

}

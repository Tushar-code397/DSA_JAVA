import javax.lang.model.util.ElementScanner14;

public class shortestpath_strings {

    public static float path(String str) {

        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {
                y++;
            } else if (str.charAt(i) == 'S') {
                y--;
            } else if (str.charAt(i) == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int x1 = x * x;
        int y1 = y * y;
        Float distance = (float) Math.sqrt(x1 + y1);
        return distance;
    }

    public static void main(String args[]) {
        String str = "WNEENESENNN";
        float f = path(str);
        System.out.println("distance=" + f);

    }
}

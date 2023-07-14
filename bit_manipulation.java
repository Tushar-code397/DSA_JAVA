import javax.lang.model.util.ElementScanner14;

public class bit_manipulation {

    // find odd or even

    public static void odd_or_even(int n) {
        int bitmask = 1; // we call bit use to mask bits of a binary as bitmask in coding

        if ((n & bitmask) == 0) // and of a number with 1 will make whole binary number as zero expect for lsb
        {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    // find i th bit in a binary

    public static void getith(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            System.out.println("zero");
        } else {
            System.out.println("one");
        }
    }

    // find i th bit in a binary and set it to 1

    public static void setith(int n, int i) {
        int bitmask = 1 << i;
        n = (n | bitmask);
        System.out.println(n);
    }

    // find i th bit in a binary and clear it to zero

    public static int clearith(int n, int i) {
        int bitmask = (~(1 << i)); // finding complement of biteise after left shift

        n = (n & bitmask);
        System.out.println(n);
        return n;
    }

    // find i th bit in a binary and clear it or set it

    public static void updateith(int n, int i, int newbitmask) {
        // newbitmask = choice of user
        // 0==clear
        // 1==set

        // approach1
        if (newbitmask == 0) {
            clearith(n, i);
        } else {
            setith(n, i);
        }

        // approach2
        n = clearith(n, i);
        int bitmask = newbitmask << i;
        System.out.println(bitmask | n);

    }

    // clearing last i bits of a binary number
    public static void clearlastith(int n, int i) {
        int bitmask = (((-1) << i)); // -1 =1111111111......
        n = (n & bitmask);
        System.out.println(n);

    }

    // clearing range j & i bits of a binary number (both are inclusive)
    public static void clearrangeith(int n, int j, int i) {
        int bitmask1 = (((-1) << j + 1)); // bitmask for j
        int bitmask2 = (1 << i) - 1; // bitmask for i
        int fbitmask = bitmask1 | bitmask2; // finding or of both bitmask
        n = (n & fbitmask);
        System.out.println(n);

    }

    // find if a no is in power of 2
    public static void powerof2(int n) {

        if ((n & n - 1) == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

    // find no of 1 (set bits) in a number
    public static void no_of_set(int n) {
        int bitwise = 1;
        int count = 0;
        while (n > 0) {
            if ((n & bitwise) == 1) {
                count++;

            }
            n = n >> 1;

        }
        System.out.println("count=" + count);
    }

    // uppercase to lowercase using bits
    public static void caseconversion(char ch) {
        char ch1 = (char) (ch ^ ' ');
        System.out.println(ch1);
    }

    public static void main(String args[]) {
        int n = 16;
        // odd_or_even(n);
        int index = 2;
        // getith(n, index);
        // setith(n, index);
        // clearith(n, index);
        // updateith(n, index, 0);
        // clearlastith(n, index);
        // clearrangeith(n, 4, 2);
        // powerof2(n);
        // no_of_set(n);
        caseconversion('A');
    }
}

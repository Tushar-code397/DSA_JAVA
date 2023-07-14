public class spiralmatrix {

    public static void printspiral(int arr[][]) {
        int startrow = 0;
        int endrow = arr.length - 1;
        int startcol = 0;
        int endcol = arr[0].length - 1;
        while (startrow <= endrow && startcol <= endcol) {
            // print top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(arr[startrow][j] + " ");
            }

            // print right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(arr[i][endcol] + " ");
            }

            // print bottom
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(arr[endrow][j] + " ");
            }
            // print left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcol == endcol) {
                    break;
                }

                System.out.print(arr[i][startcol] + " ");
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;

        }
    }

    public static void main(String args[]) {
        int mat[][] = { { 5, 3, 7, 8 },
                { 1, 4, 6, 8 },
                { 2, 9, 5, 7 },
                { 1, 6, 3, 0 } };
        printspiral(mat);

    }

}

int n=nums.length;
        int max=0;
        int element=0;

        for(int i=0;i<n;i++)
        { int count =0;
            for(int j=0;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                  count++;
                }
                if(count>max)
                {
                    max=count;
                    element=nums[i];
                }
            }
        }
        if(max>(n/2))
        {
            return element;
        }
        return 0;

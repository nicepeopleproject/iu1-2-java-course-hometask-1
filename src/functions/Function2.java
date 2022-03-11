package functions;

import java.util.Arrays;
import java.util.Collections;

public class Function2 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{-5, -6, -7};
        // test 1
        System.out.printf("Test 1 %s.\n", ClassForTest.compareResults(merge(a, b), new int[]{-7, -6, -5, 1, 2, 3, 4, 5}) ? "passed" : "failed");

        //test 2
        System.out.printf("Test 2 %s.\n", ClassForTest.compareResults(merge(new int[0], new int[0]), new int[]{}) ? "passed" : "failed");

        //test 3
        System.out.printf("Test 3 %s.\n", ClassForTest.compareResults(merge(b, a), new int[]{5, 4, 3, 2, 1, -5, -6, -7}) ? "passed" : "failed");

    }

    /*
    методу передаются два упорядоченных массива(могут быть упорядочены по-разному), реализуйте функцию,
    которая объединит их и вернет упорядоченный массив с порядком таким же как и a
     */
    private static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        for (int f = 0; f < b.length; f++){
            c[f+a.length] = b[f];
        }
        if (c.length != 0) {
            if (c[0] < c[1]) {
                Arrays.sort(c);
            } else if (c[0] > c[1]) {
                Integer[] C = new Integer[c.length];
                for (int i = 0; i < c.length; i++) {
                    C[i] = c[i];
                }
                Arrays.sort(C);
                Arrays.sort(C, Collections.reverseOrder());
                for (int i = 0; i < c.length; i++) {
                    c[i] = C[i];
                }
            }
        }
        return c;
    }
}

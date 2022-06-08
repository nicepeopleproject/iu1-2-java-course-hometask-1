package functions;

import java.util.Arrays;
import java.util.Collection;
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
        if (a.length == 0 & b.length == 0){
            return a;
        } else {
            int[] helper = new int[a.length + b.length];
            if (a[0] < a[a.length - 1]) {
                for (int i = 0; i < a.length; i++) {
                    helper[i] = a[i];
                }
                for (int i = a.length; i < helper.length; i++) {
                    helper[i] = b[i-a.length];
                }
                Arrays.sort(helper);
            }
            if (a[0] >= a[a.length - 1]) {
                for (int i = 0; i < a.length; i++) {
                    helper[i] = a[i];
                }
                for (int i = a.length; i < helper.length; i++) {
                    helper[i] = b[i-a.length];
                }
                Arrays.sort(helper);
                for (int i = 0; i < helper.length / 2 ; i++){
                    int h = helper[helper.length - i - 1];
                    helper [helper.length - i - 1] = helper[i];
                    helper [i] = h;
                }
            }
            return helper;
        }
    }
}

package functions;
import java.util.*;

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
        int length = 0;
        boolean isIncreases = false;

        for(int i = 0;i<a.length;i++){
            length ++;
            if(i < a.length-1)
                if (a[i] < a[i+1])
                    isIncreases = true;
        }
        for(int i = 0;i<b.length;i++){
            length ++;
        }
        int[] c = new int [length];
        for(int i = 0;i<a.length;i++){
                c[i] = a[i];
        }
        for(int i = 0;i<b.length;i++){
            c[i+a.length] = b[i];
        }

        Arrays.sort(c);

        if(!isIncreases){
            for (int i = 0, j = c.length - 1; i < j; i++, j--) {
                int t = c[i];
                c[i] = c[j];
                c[j] = t;
            }
        }
        return c;
    }
}

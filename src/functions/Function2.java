package functions;
import java.util.Arrays;


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

    private static int[] reverse(int[] array){
        int[] newArray = new int[array.length];

        for(int i = 0; i < array.length; i++){
            newArray[newArray.length - 1 - i] = array[i];
        }

        return newArray;
    }

    private static int[] merge(int[] a, int[] b) {
        int N = a.length + b.length;
        int[] c = new int[N];

        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        Arrays.sort(c);

        if(a.length >= 2 && a[0] <= a[1]){
            return c;
        }else{
            return reverse(c);
        }


    }
}
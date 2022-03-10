package functions;

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
        try {

            if (isInAscendingOrder(a) != isInAscendingOrder(b)) {
                reverse(b);
            }

        } catch (Exception e) {
            return new int[a.length + b.length];
        }

        int[] res = new int[a.length + b.length];
        int a_iter = 0;
        int b_iter = 0;
        int i = 0;

        while (true) {
            try {

                if (compareFunc(a, b, a_iter, b_iter)) {
                    res[i++] = a[a_iter++];
                } else {
                    res[i++] = b[b_iter++];
                }

            } catch (ArrayIndexOutOfBoundsException e) {

                if (a_iter >= a.length) {
                    System.arraycopy(b, b_iter, res, i, b.length - b_iter);
                } else {
                    System.arraycopy(a, a_iter, res, i, a.length - a_iter);
                }
                break;

            }
        }
        return res;
    }


    private static boolean compareFunc(int[] a, int[] b, int a_iter, int b_iter) {
        if (isInAscendingOrder(a)) {
            return a[a_iter] < b[b_iter];
        } else {
            return a[a_iter] > b[b_iter];
        }
    }

    private static boolean isInAscendingOrder(int[] a) {
        return a[0] < a[a.length - 1];
    }

    private static void reverse(int[] b) {
        for (int i = 0; i < b.length / 2; ++i) {
            b[i] += b[b.length - 1 - i];
            b[b.length - 1 - i] = -b[b.length - 1 - i] + b[i];
            b[i] -= b[b.length - 1 - i];
        }
    }
}

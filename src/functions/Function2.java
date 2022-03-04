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


    private static int[] merge(int[] a, int[] b) {
        boolean flag = false;
        if (a.length > 0) {
            flag = Function1.findMax(a) == a[0] ? false : true;
        }
        int[] array = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i];
        }
        for (int i = a.length; i < array.length; i++) {
            array[i] = b[i - a.length];
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (flag ? array[i] > array[j] : array[i] < array[j]) {
                    int k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }
        }
        return array;
    }

}

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

        boolean isReversed = false;
        if (a.length == 0) { isReversed = false; }

        else if ((a[0] > a[1])) { isReversed = true; }

        int answerArray[] = new int[a.length + b.length];

        for(int i = 0; i < a.length; i++) { answerArray[i] = a[i]; }
        for(int i = 0; i < b.length; i++) { answerArray[i + a.length] = b[i]; }

        sorting(answerArray, isReversed);
        return answerArray;
    }

    private static void sorting(int[] arr, boolean isReversed) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length ; j++) {
                if( arr[j] < arr[i] ) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        if (isReversed) {
            int tmpArray[] = new int[arr.length];

            for(int i = arr.length; i > 0; i--) {
                tmpArray[arr.length - i] = arr[i - 1];
            }
            for(int i = 0; i < arr.length; i++) {
                arr[i] = tmpArray[i];
            }
        }

    }
}



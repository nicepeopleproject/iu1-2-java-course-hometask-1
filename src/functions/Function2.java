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
        boolean arrayIsReverce = false;
        for (int i = 0; i < a.length - 1; i++ ) {
            if (a[i] <= a[i+1]) { }
            else { arrayIsReverce = true; break; }
        }

        int finalArray[] = new int [a.length + b.length];

        for (int i = 0; i < finalArray.length; i ++) {
            if(i < a.length) { finalArray[i] = a[i]; }
            else { finalArray[i] = b[i - a.length]; }
        }

        sorting(finalArray, arrayIsReverce);
        return finalArray;
    }
    public static void sorting (int[] array, boolean arrayIsReference) {
        if (!arrayIsReference) {
            for(int i = 0; i < array.length - 1; i++ ){
                for(int j = i + 1; j < array.length; j++ ){
                    if (array[j] < array[i]) {
                        int timeVariable = array[j];
                        array[j] = array[i];
                        array[i] = timeVariable;
                    }
                }
            }
        } else {
            for(int i = 0; i < array.length - 1; i++ ){
                for(int j = i + 1; j < array.length; j++ ){
                    if (array[j] > array[i]) {
                        int timeVariable = array[j];
                        array[j] = array[i];
                        array[i] = timeVariable;
                    }
                }
            }
        }
    }
}

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
        int[] array = new int[a.length + b.length];
        if(array.length == 0){
            return new int[0];
        }
        for(int i = 0; i < array.length; i++){
            if(i < a.length){
                array[i] = a[i];
            }
            else{
                array[i] = b[i - a.length];
            }
        }
        boolean directOrder = true;
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] < a[i + 1]){
                directOrder = true;
            }
            if(a[i] > a[i + 1]){
                directOrder = false;
            }
        }
        return sortArray(array, directOrder);
    }

    private static int[] sortArray(int [] array, boolean directOrder){
        int min;
        int min_index;
        int tmp;
        for(int i = 0; i < array.length; i++){
            min = array[i];
            min_index = i;
            for(int j = i; j < array.length; j++){
                if(array[j] < min){
                    min = array[j];
                    min_index = j;
                }
            }
            tmp = array[i];
            array[i] = min;
            array[min_index] = tmp;
        }
        if(!directOrder){
            int[] reversed = new int[array.length];
            for(int i = 0; i < array.length; i++){
                reversed[i] = array[array.length - i - 1];
            }
            array = reversed;
        }
        return array;
    }
}

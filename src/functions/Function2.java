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
        if (a.length == 0 & b.length == 0) {
            int[] common = new int[]{};
            return common;
        }
        if (a.length == 0 & b.length != 0) {
            return a;
        }
        if (a.length != 0 & b.length == 0) {
            return b;
        }
        if (b.length != 0 & b.length != 0) {
            int[] common = new int[a.length + b.length];
            int count = 0;
            for(int i = 0; i<a.length; i++) {
                common[i] = a[i];
                count++;
            }
            for(int j = 0;j<b.length;j++) {
                common[count++] = b[j];
            }
            if (a[a.length - 1] >= a[0]) {
                int obmen;
                for (int j = 1; j < common.length; j++) {
                    for (int i = 0; i < common.length - j; i++) {
                        if (common[i] > common[i+1]) {
                            obmen = common[i];
                            common[i] = common[i + 1];
                            common[i + 1] = obmen;
                        }
                    }
                }
            } else {
                int obmen;
                for (int j = 1; j < common.length; j++) {
                    for (int i = 0; i < common.length - j; i++) {
                        if (common[i] < common[i+1]) {
                            obmen = common[i];
                            common[i] = common[i + 1];
                            common[i + 1] = obmen;
                        }
                    }
                }
            }
            return common;
        }
        return a; // требует return, но вроде до него никак не дойдёт
    }
}

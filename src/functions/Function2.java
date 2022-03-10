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
            int[] c = new int[]{};
            return c;
        } else if (a.length == 0) {
            return a;
        } else if (b.length == 0) {
            return b;
        } else {
            int[]c = new int[a.length + b.length];
            int count = 0;
            for(int i = 0; i < a.length; i++) {
                c[i] = a[i];
                count++;
            }
            for(int j = 0; j < b.length;j++) {
                c[count++] = b[j];
            }
            if (a[0] <= a[a.length - 1]) {                         //Сортировка не написана отдельно, так как задание было работать
                boolean sorted = false;                           //конкретно с этим методом. Я решил в нем и оставаться
                int temp;
                while(!sorted) {
                    sorted = true;
                    for (int i = 0; i < c.length - 1; i++) {
                        if (c[i] > c[i+1]) {
                            temp = c[i];
                            c[i] = c[i+1];
                            c[i+1] = temp;
                            sorted = false;
                        }
                    }
                }
            } else {
                boolean sorted = false;
                int temp;
                while(!sorted) {
                    sorted = true;
                    for (int i = 0; i < c.length - 1; i++) {
                        if (c[i] < c[i+1]) {
                            temp = c[i];
                            c[i] = c[i+1];
                            c[i+1] = temp;
                            sorted = false;
                        }
                    }
                }
            }
        return c;
        }
    }
}
package com.example.dz_1;

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
        boolean Reverse = false;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                Reverse = true;
            }
            if (a[i] < a[i + 1]) {
                Reverse = false;
            }
        }
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < c.length; i++) {
            if (i < a.length) {
                c[i] = a[i];
            } else {
                c[i] = b[i - a.length];
            }
        }
        Sorting(c, Reverse);
        return c;
    }

    public static void Sorting(int [] c, boolean Reverse) {
        if (Reverse == false) {
            boolean sorted = false;
            int temp;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < c.length - 1; i++) {
                    if (c[i] > c[i + 1]) {
                        temp = c[i];
                        c[i] = c[i + 1];
                        c[i + 1] = temp;
                        sorted = false;
                    }
                }
            }

        } else {
            boolean sorted = false;
            int temp;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < c.length - 1; i++) {
                    if (c[i] < c[i + 1]) {
                        temp = c[i];
                        c[i] = c[i + 1];
                        c[i + 1] = temp;
                        sorted = false;
                    }
                }
            }

        }
    }
}
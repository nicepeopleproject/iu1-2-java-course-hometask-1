package functions;

import com.example.functions.ClassForTest;

public class Function1 {
    public static void main(String[] args) {
        System.out.println("Function testing:");
        System.out.printf("Test 1 %s.\n", ClassForTest
                .compareResults(findMax(new int[] {3, 4, 10, -1}), 10) ? "passed" : "failed");

        try {
            findMax(new int[0]);
            System.out.println("Test 2: failed.");
        } catch (RuntimeException e) {
            System.out.println("Test 2: passed.");
        }
    }

    // реализовать функцию, которая будет находить максимум в массиве
    // обработать случай, когда длина массива равна нулю
    // в этом случае выбрасывать исключение
    private static int findMax(int[] arr) {
        if (arr.length > 0) {
            int max_element = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max_element) {
                    max_element = arr[i];
                }
            }
            return max_element;
        } else {
            System.out.println("No elements in array");
            throw new RuntimeException("No elements in array");
        }

    }
}

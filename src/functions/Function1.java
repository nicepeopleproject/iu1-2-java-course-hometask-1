package functions;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Function1 {

    public static void main(String[] args) {
        System.out.println("Function testing:");
        System.out.printf("Test 1: %s.\n", ClassForTest
                .compareResults(findMax(new int[]{3, 4, 10, -1}), 10) ? "passed" : "failed");

        try {
            findMax(new int[0]);
            System.out.println("Test 2: failed.");
        } catch (RuntimeException e) {
            System.out.println("Test 2: passed.");
        }
    }

    private static int findMax(int[] arr) {
        if (arr.length != 0) {
            IntStream stream = Arrays.stream(arr);
            OptionalInt optional = stream.max();
            int max = optional.getAsInt();

            System.out.println("Maximum number = " + max);
            return max;
        } else throw new RuntimeException();
    }
}

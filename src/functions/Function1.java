package functions;

public class Function1 {
    public static void main(String[] args) {
        System.out.println("Function testing:");
        System.out.printf("Test 1 %s.\n", ClassForTest.compareResults(findMax(new int[]{3, 4, 10, -1}), 10) ? "passed" : "failed");

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
        if (arr.length == 0) {
            System.out.println("Empty array");
            throw new RuntimeException();
        } else {
            int maxItem = arr[0];
            for (int i = 1; i < arr.length-1; i++) {
                if (maxItem < arr[i]) {
                    maxItem = arr[i];
                }
            }
            return maxItem;
        }
    }
}

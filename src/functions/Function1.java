package functions;

public class Function1 {
    public static void main(String[] args) {
        System.out.println("Function testing:");
        System.out.printf("Test 1 %s.\n", ClassForTest
                .compareResults(findMax(new int[]{3, 4, 10, -1}), 10) ? "passed" : "failed");

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
        int max;
        if(arr.length > 0){
            max = arr[0];
            for(int i = 0; i < arr.length; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
        }
        else{
            System.out.println("Array is empty");
            throw new RuntimeException("Array is empty");
        }
        return max;
    }
}

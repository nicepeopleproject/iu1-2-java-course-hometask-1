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
        if (a.length==0 && b.length==0){
            return new int[]{};
        }else if (a.length==0){
            return b;
        }else if (b.length==0){
            return a;
        }else{
            int[] c = new int[a.length+b.length];
            int count=0;
            if (a[0]<a[1]){
                if (a[0]<b[0]){
                    for (int i=0; i<a.length;i++){
                        c[i]=a[i];
                        count++;
                    }
                    if (b[0]<b[1]){
                        for (int j=0;j<b.length; j++){
                            c[count]=b[j];
                            count++;
                        }
                    }else{
                        for (int j=b.length-1;j>=0; j--){
                            c[count]=b[j];
                            count++;
                        }
                    }
                }else if(a[0]>b[0]){
                    count=b.length;
                    for (int i=0; i<a.length;i++){
                        c[count]=a[i];
                        count++;
                    }
                    if (b[0]<b[1]){
                        for (int j=0;j<b.length; j++){
                            c[j]=b[j];
                        }
                    }else{
                        count=0;
                        for (int j=b.length-1;j>=0; j--){
                            c[count]=b[j];
                            count++;
                        }
                    }
                }
            }else if (a[0]>a[1]){
                if (a[0]<b[0]){
                    count=b.length;
                    for (int i=0; i<a.length;i++){
                        c[count]=a[i];
                        count++;
                    }
                    if (b[0]<b[1]){
                        count=0;
                        for (int j=b.length-1;j>=0; j--){
                            c[count]=b[j];
                            count++;
                        }
                    }else{
                        for (int j=0;j<b.length; j++){
                            c[j]=b[j];
                        }
                    }
                }else if(a[0]>b[0]){
                    for (int i=0; i<a.length;i++){
                        c[i]=a[i];
                        count++;
                    }
                    if (b[0]<b[1]){
                        for (int j=b.length-1;j>=0; j--){
                            c[count]=b[j];
                            count++;
                        }
                    }else{
                        for (int j=0;j<b.length; j++){
                            c[count]=b[j];
                        }
                    }
                }
            }
            Show(c);
            return c;
        }
    }

    public static void Show(int[] c) {
        for (int i=0; i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }

}

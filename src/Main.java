public class Main {
    public static void main(String[] args) {
       int[] arr = {2, 6, 4, 9, 5};
       boolean isSorted = false;
       while (!isSorted) {
           isSorted = true;
           for (int i = 1; i < arr.length; i++) {
               if (arr[i - 1] > arr[i]) {
                   int temp = 0;
                   temp = arr[i - 1];
                   arr[i - 1] = arr[i];
                   arr[i] = temp;
                   isSorted = false;
               }
           }
       }
        printArr(arr);
    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
import java.util.Scanner;

class SelectionSort {
    static void sort(int[] arr, int arrSize) {
        for (int i = 0; i < arrSize - 1; i++) {
            int idx = 0;
            int count = 0;
            int minIdx = arr[i];

            for (int j = i + 1; j < arrSize; j++)
                if (minIdx > arr[j]) {
                    minIdx = arr[j];
                    count++;
                    idx = j;
                }
            if (count != 0) {
                int temp = arr[i];
                arr[i] = minIdx;
                arr[idx] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the lenth of the array: ");
        int arrSize = sc.nextInt();

        int[] arr = new int[arrSize];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arrSize; i++)
            arr[i] = sc.nextInt();
        
        System.out.println("Before sorting ->");
        for (int i = 0; i < arrSize; i++) {
            System.out.printf("%d ", arr[i]);
        }

        sort(arr, arrSize);
            
        System.out.println("\nAfter sorting ->");
        for (int i = 0; i < arrSize; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
        sc.close();
    }
}
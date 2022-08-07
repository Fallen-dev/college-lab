import java.util.Scanner;

class MinInt {
    static int getMinimumInt(int[] arr, int arrLen) {
        int i, j, temp;

        for (i = 0; i < arrLen; i++)
            for (j = i+1; j < arrLen; j++)
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
        return arr[0];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lenth of the array: ");
        int arrLen = sc.nextInt();
        
        int[] arr = new int[arrLen];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arrLen; i++) 
            arr[i] = sc.nextInt();
        
        System.out.println("The minimum integer of the array is " + getMinimumInt(arr, arrLen));
        sc.close();
    }
}
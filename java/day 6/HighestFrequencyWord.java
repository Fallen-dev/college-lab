import java.util.Scanner;

class HighestFrequencyWord {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int count, maxCount;

        System.out.print("Enter a sentence :: ");
        String[] input = read.nextLine().split(" ");

        read.close();
        int inputLen = input.length;

        for (int i = 0; i < inputLen; i++) {
            count = 1;
            maxCount = count;
            for (int j = i + 1; j < inputLen - 1; j++) {
                if (input[i].equals(input[j])) {
                    count++;
                    for (int k = j; k < inputLen - 1; k++) {
                        input[k] = input[k + 1];
                    }
                    inputLen--;
                    j--;
                }
            }
            if (count > maxCount)
                System.out.printf("\"%s\" occurs the most at %d times\n", input[i], count + 1);
            count = 0;
        }
    }
}
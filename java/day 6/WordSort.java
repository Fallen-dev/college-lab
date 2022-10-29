import java.util.Scanner;

class WordSort {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter some words or a sentence -> ");
        String input = read.nextLine();
        read.close();
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++)
            for (int j = i + 1; j < words.length; j++)
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
        System.out.println("Sorted order ->");
        for (int i = 0; i < words.length; i++)
            System.out.printf("%s ", words[i]);
    }
}
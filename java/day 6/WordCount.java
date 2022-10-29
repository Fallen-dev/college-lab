import java.util.Scanner;

class WordCount {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = read.nextLine();
        read.close();
        int wordCount = input.replace(" ", "").length();
        System.out.println("The length is " + wordCount);
    }
}

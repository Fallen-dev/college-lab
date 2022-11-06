import java.util.Scanner;

class WordCount {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        System.out.println("The length is " +
                read.nextLine().trim().replace(" ", "").length());
        read.close();
    }
}

/*
 * OUTPUT
 * Enter a sentence: Debdutta roy
 * The length is 11
 */
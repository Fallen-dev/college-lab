import java.util.Scanner;

class TakeOutChars {
    static void takeOutChars(String input) {
        if (input.length() <= 10)
            throw new Error("String has less than 10 letters");

        System.out.println(input.substring(4, 10));
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter a sentence more than 10 letters :: ");
        String input = read.nextLine();

        read.close();
        takeOutChars(input);
    }
}
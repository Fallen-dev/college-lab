import java.util.Scanner;

class TakeOutChars {
    static void takeOutChars(String input) {
        if (input.length() <= 10)
            throw new Error("String has less than 10 letters");

        System.out.println(input.substring(3, 9));
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter a sentence more than 10 letters :: ");
        String input = read.nextLine();

        read.close();
        takeOutChars(input);
    }
}
/*
 * OUTPUT
 * Enter a sentence more than 10 letters :: It is a beautiful day
 * is a b
 */
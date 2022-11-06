import java.util.Scanner;

class CheckCharAndDigits {
    // utility for sysout
    static void log(String string, Object... objects) {
        System.out.print(String.format(string, objects));
    }

    static int checkCharAndDigits(String string) {
        boolean containsNum = string.matches("[0-9]+");
        boolean containsChar = string.matches("[a-z]+[0-9]+");
        int contains = 0;

        if (containsNum)
            return contains = 1;
        if (containsChar)
            return contains = 2;

        return contains;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        log("Word :: ");
        String input = read.next();
        read.close();

        switch (checkCharAndDigits(input.toLowerCase())) {
            case 0:
                log("\nContains chars only\n");
                break;
            case 1:
                log("\nContains only digit\n");
                break;
            case 2:
                log("\nContains both digit and chars\n");
                break;
        }
    }
}

/*
 * OUTPUT
 * 1.
 * Word :: TwentyTwo
 * Contains chars only
 * 2.
 * Word :: 22
 * Contains only digit
 * 3.
 * Word :: Twenty2
 * Contains both digit and chars
 */
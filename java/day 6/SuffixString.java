import java.util.Scanner;

public class SuffixString {
    static void print(String string, Object... args) {
        System.out.print(String.format(string, args));
    }

    static boolean isSuffix(String fst, String snd) {
        if (fst.endsWith(snd))
            return true;
        if (snd.endsWith(fst))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        print("Enter first string :: ");
        String fst = read.nextLine();

        print("Enter second string :: ");
        String snd = read.nextLine();

        read.close();
        print(isSuffix(fst, snd) ? "Suffix\n" : "Not a suffix\n");
    }
}

/*
 * OUTPUT
 * Enter first string :: happier
 * Enter second string :: er
 * Suffix
 */
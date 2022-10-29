import java.util.Objects;
import java.util.Scanner;

public class CompareTwoStrings {
    private static void log(String string, Object... args) {
        System.out.print(String.format(string, args));
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        log("Enter first string :: ");
        String fst = read.nextLine();

        log("Enter second string :: ");
        String snd = read.nextLine();

        read.close();

        if (Objects.equals(fst, snd))
            log("Equal\n");
        else
            log("Not equal\n");
    }
}

import java.util.Scanner;

class Calculator {
    static void calculator(int choice, int fst, int snd) {
        switch (choice) {
            case 1:
                System.out.printf("\n%d + %d = %d\n", fst, snd, (fst + snd));
                break;
            case 2:
                System.out.printf("\n%d - %d = %d\n", fst, snd, (fst - snd));
                break;
            case 3:
                System.out.printf("\n%d x %d = %d\n", fst, snd, (fst * snd));
                break;
            case 4:
                System.out.printf("\n%d / %d = %d\n", fst, snd, (fst / snd));
                break;
            default:
                System.out.println("Input Error!");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("#### JAVA CALCULATOR ####");
        System.out.print("Enter first number: ");
        int fst = sc.nextInt();

        System.out.print("Enter second number: ");
        int snd = sc.nextInt();

        System.out.println("\n1. Add\n2. Substract\n3. Multiply\n4. Divide");
        System.out.print("Your choice: ");
        int choice = sc.nextInt();

        do {
            calculator(choice, fst, snd);
            System.exit(0);
        } while (choice != 5);
        sc.close();
    }
}
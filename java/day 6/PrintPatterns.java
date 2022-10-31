class PrintPatterns {
    static int i, j;

    static void print(String string, Object... args) {
        System.out.print(String.format(string, args));
    }

    static void a(String string) {
        for (i = 0; i < string.length(); i++) {
            for (j = 0; j <= i; j++)
                print(string.split("")[j]);
            print("\n");
        }
        print("\n");
    }

    static void b(String string) {
        String[] splittedStrings = string.split("");

        for (i = 0; i <= string.length() - 1; i++) {
            for (j = 0; j <= i; j++) {
                print("%s ", splittedStrings[j]);
            }
            print("\n");
        }
        for (i = string.length() - 1; i >= 0; i--) {
            for (j = 0; j <= i - 1; j++) {
                print("%s ", splittedStrings[j]);
            }
            print("\n");
        }
    }

    public static void main(String[] args) {
        String string = "Hello".toUpperCase();
        a(string);
        b(string);
    }
}

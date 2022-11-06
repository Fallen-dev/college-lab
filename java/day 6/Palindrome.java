class Palindrome {
    static String isPalindrome(String string) {
        String revString = "";

        for (int i = string.length() - 1; i >= 0; i--)
            revString += string.charAt(i);

        String result = string.equalsIgnoreCase(revString) ? "Palindrome" : "Not Palindrome";
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Malayalam"));
    }
}
/*
 * OUTPUT
 * Palindrome
 */
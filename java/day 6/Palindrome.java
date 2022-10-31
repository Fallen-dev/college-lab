class Palindrome {
    static String isPalindrome(String string) {
        String result = "Not palindrome";
        String revString = "";

        for (int i = string.length() - 1; i >= 0; i--)
            revString += string.charAt(i);

        if (string.equalsIgnoreCase(revString))
            return result = "Palindrome";

        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Malayalam"));
    }
}
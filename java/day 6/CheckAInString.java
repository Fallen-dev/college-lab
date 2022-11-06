class CheckAInString {
    public static void main(String[] args) {
        String sentence = "At the end of the day".toLowerCase();
        System.out.println(sentence.matches(".*a.*"));
    }
}
/*
 * OUTPUT
 * true
 */
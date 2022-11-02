public class OccurenceOfChar {
    public static void main(String[] args) {
        String string = "java program";
        String find = "a";

        System.out.printf("No. of occurence of char '%s' is %d\n",
                find, string.length() - string.replace(find, "").length());
    }
}

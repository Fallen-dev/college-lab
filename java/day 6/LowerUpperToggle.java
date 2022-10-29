class LowerUpperToggle {
    static StringBuffer toToggleCase(String string) {
        StringBuffer toggleCase = new StringBuffer();

        for (int i = 0; i < string.length(); i++) {
            Character c = string.charAt(i);

            if (Character.isLowerCase(c))
                toggleCase.replace(i, i + 1, Character.toUpperCase(c) + "");
            else
                toggleCase.replace(i, i + 1, Character.toLowerCase(c) + "");
        }
        return toggleCase;
    }

    public static void main(String[] args) {
        String string = "This is a String";
        System.out.printf(
                "Lower case :: %s\nUpper case :: %s\nToggle case :: %s\n",
                string.toLowerCase(),
                string.toUpperCase(),
                toToggleCase(string));
    }
}

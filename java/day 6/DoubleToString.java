class DoubleToString {
    public static void main(String[] args) {
        double value = 234.78;
        String d2s = String.valueOf(value);

        System.out.printf("Before type: %s\nAfter conversion: %s\n", ((Object) value).getClass().getSimpleName(),
                d2s.getClass().getSimpleName());
    }
}

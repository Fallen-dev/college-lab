class DoubleToString {
    public static void main(String[] args) {
        double value = 234.78;
        String d2s = String.valueOf(value);

        System.out.printf("Type before conversion: %s\nType after conversion: %s\n",
                ((Object) value).getClass().getSimpleName(),
                d2s.getClass().getSimpleName());
    }
}

/*
 * OUTPUT
 * Type before conversion: Double
 * Type after conversion: String
 */

import java.util.Scanner;

class Complex {
    int real;
    int imaginary;

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    static Complex add(Complex c1, Complex c2) {
        Complex temp = new Complex(0, 0);

        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;

        return temp;
    }

    static Complex substract(Complex c1, Complex c2) {
        Complex temp = new Complex(0, 0);

        temp.real = c1.real - c2.real;
        temp.imaginary = c1.imaginary - c2.imaginary;

        return temp;
    }

    static boolean isequal() {
        Complex temp = new Complex(0, 0);

        if (temp.real == temp.imaginary)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first real number: ");
        int real1 = sc.nextInt();

        System.out.print("Enter the first complex number: ");
        int complex1 = sc.nextInt();

        System.out.print("Enter the second real number: ");
        int real2 = sc.nextInt();

        System.out.print("Enter the second complex number: ");
        int complex2 = sc.nextInt();

        sc.close();

        Complex c1 = new Complex(real1, complex1);
        Complex c2 = new Complex(real2, complex2);

        Complex add = add(c1, c2);
        Complex substract = substract(c1, c2);
        boolean isequal = isequal();
        
        System.out.println("- Addition");
        System.out.printf("%d + %di\n", add.real, add.imaginary);

        System.out.println("- Substraction");
        System.out.printf("%d + %di\n", substract.real, substract.imaginary);

        System.out.println("- Are they equal");
        System.out.println(isequal);
    }
}

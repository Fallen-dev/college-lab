import java.util.Scanner;

class Rectangle {
    int length;
    int width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    int calcArea() {
        return length * width;
    }
    void display() {
        System.out.println("The area of the rectangle is " + calcArea());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter width: ");
        int width = sc.nextInt();
        sc.close();

        Rectangle rect = new Rectangle(length, width);
        rect.calcArea();
        rect.display();
    }
}
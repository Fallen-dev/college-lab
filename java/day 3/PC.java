import java.util.Scanner;

class PC {
    double area;
    int f;
 
    PC(double a) {
        area = Math.pow(a, 2);
        f = 1;
    }
 
    PC(double a, double b) {
        area = a * b;
        f = 2;
    }
 
    void display() {
        if (f == 1)
            System.out.println("Area of the square is : " + area);
        else
            System.out.println("Area of the rectangle is : " + area);
 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PC rectangle=new PC(12.5, 6.5);
        PC square=new PC(22.3);
        
        rectangle.display();
        square.display();
        sc.close();
    }
}

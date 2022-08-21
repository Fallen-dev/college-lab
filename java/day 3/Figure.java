import java.util.Scanner;

class Figure {
    double area;
 
    // cube
    Figure(double r) {
        area = 6.0 * Math.pow(r, 2);
    }
 
    // cylinder
    Figure(double r, double h) {
        area = 2.0 * Math.PI * (r + h);
    }
 
    Figure(int r) {
        area = 4 * Math.PI * Math.pow(r, 2);
    }
 
    // sphere
    void result() {
        System.out.println("Calculated Area is : " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Figure cube = new Figure(4.5);
        Figure cylinder = new Figure(5.6, 4);
        Figure sphere = new Figure(5);
        
        cube.result();
        cylinder.result();
        sphere.result();
        sc.close();
    }
}
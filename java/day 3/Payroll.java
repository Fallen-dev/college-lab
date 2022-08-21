import java.util.Scanner;

class Payroll {
    String name;
    int id;
    private double rate;
    private double workedHour;
 
    Payroll(String name, int id) {
        this.name = name;
        this.id = id;
    }
 
    public double getRate() {
        return rate;
    }
 
    public double getWorkedHour() {
        return workedHour;
    }
 
    public void setRate(double rate) {
        this.rate = rate;
    }
 
    public void setWorkedHour(double workedHour) {
        this.workedHour = workedHour;
    }
 
    double grossPay() {
 
        return getRate() * getWorkedHour();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Payroll emp1 = new Payroll("John", 1);
        
        System.out.println("Enter the rate: ");
        double rate = sc.nextInt();
        
        emp1.setRate(rate);
        
        System.out.println("Enter the working hour: ");
        double workedHour = sc.nextInt();
        
        emp1.setWorkedHour(workedHour);
        
        System.out.println("Gross Pay: " + emp1.grossPay());
        sc.close(); 
    }
}
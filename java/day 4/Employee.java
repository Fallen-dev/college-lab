import java.util.regex.Pattern;

class Employee {
    String name, id, hiredOn;
}

class ProdunctionWorker extends Employee {
    private String shifting, payRate;

    ProdunctionWorker employee(String name, String id, String hiredOn) {
        this.name = name;
        if (Pattern.matches("[0-9][0-9][0-9]", id.split("-")[0]) &&
                Pattern.matches("[A-M]", id.split("-")[1]))
            this.id = id;
        else
            this.id = "Error: ID must be XXX-L where X = 0-9 and L = A-M";
        this.hiredOn = hiredOn;
        return this;
    }

    ProdunctionWorker shifting(int shift) {
        if (shift == 1)
            shifting = "Day";
        else if (shift == 2)
            shifting = "Night";
        else
            shifting = "Shifting must be 1/Day or 2/Night";
        return this;
    }

    ProdunctionWorker payRate(double hourlyPayRate) {
        payRate = hourlyPayRate + " /- per hour";
        return this;
    }

    void display() {
        System.out.printf(
                "\nEmployee: %s\nID: %s\nHired on: %s\nShifting: %s\nHourly pay rate: %s\n", name, id, hiredOn,
                shifting, payRate);
    }
}

class MyEmployee {
    public static void main(String[] args) {
        new ProdunctionWorker()
                .employee("John Doe", "999-D", "today")
                .shifting(1).payRate(3000.00).display();
    }
}
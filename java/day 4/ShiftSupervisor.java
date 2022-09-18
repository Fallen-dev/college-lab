class Employee {
    String name, id, hiredOn;
}

class ShiftSupervisor extends Employee {
    private String annualSalary;
    private String annualBonus = "Did not meet production goal hence no bonus";

    ShiftSupervisor employee(String name, int id, String hiredOn) {
        this.name = name;
        this.id = Integer.toString(id);
        this.hiredOn = hiredOn;
        return this;
    }

    ShiftSupervisor salary(double salary) {
        this.annualSalary = salary + " /- per year";
        return this;
    }

    ShiftSupervisor bonus(double bonus) {
        this.annualBonus = bonus + " /- per year";
        return this;
    }

    void display() {
        System.out.printf(
                "\nEmployee: %s\nID: %s\nHired on: %s\nSalary: %s\nBonus: %s\n", name, id, hiredOn, annualSalary,
                annualBonus);
    }
}

class MyShiftSupervisor {
    public static void main(String[] args) {
        new ShiftSupervisor()
                .employee("Rick Astley", 0, "12/02/2005")
                .salary(30000).display();
    }
}
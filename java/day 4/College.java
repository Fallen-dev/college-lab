class College { // output file = MyCollege.class
    private String collegeName, address;

    College setCollegeDetails(String collegeName, String address) {
        this.collegeName = collegeName;
        this.address = address;
        return this;
    }

    void showCollegeDetails() {
        System.out.printf("\n## College details\nCollege name: %s\nAddrss: %s\n", collegeName, address);
    }
}

class DeptFaculty extends College {
    private String name, experience;

    DeptFaculty set(String name, String expperience) {
        this.name = name;
        this.experience = expperience;
        return this;
    }

    void showFacultyDetails() {
        System.out.printf("\n## Faculty details\nFaculty name: %s\nExperience: %s\n", name, experience);
    }
}

class Dept extends College {
    private String deptName, hodName;

    Dept set(String deptName, String hodName) {
        this.deptName = deptName;
        this.hodName = hodName;
        return this;
    }

    void showDeptDetails() {
        System.out.printf("\n## Dept details\nDept. name: %s\nName of HOD: %s\n", deptName, hodName);
    }
}

class MyCollege {
    public static void main(String[] args) {
        Dept dept = new Dept();
        dept.setCollegeDetails("RCCIIT", "CIT More, Beleghata").showCollegeDetails();
        dept.set("CSE", "Rajib Saha").showDeptDetails();

        new DeptFaculty().set("Arup Sir", "Java").showFacultyDetails();
    }
}
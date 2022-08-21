class Person {
    String name;
    int age;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void compare(Person p1, Person p2) {
        if (p1.age > p2.age)
            System.out.printf("%s (%d y/o) is senior than %s\n", p1.name, p1.age, p2.name);
        else if (p1.age < p2.age)
            System.out.printf("%s (%d y/o) is senior than %s\n", p2.name, p2.age, p1.name);
        else
            System.out.printf("%s and %s are at the same age\n", p1.name, p2.name);
    }

    public static void main(String[] args) {
        Person p1 = new Person(32, "John");
        Person p2 = new Person(54, "Alex");

        p1.compare(p1, p2);
    }
}
public class Person {
    String name;
    int age;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    static Person compare(Person p1, Person p2) {
        if (p1.age > p2.age)
            System.out.printf("%s is senior than %s\n", p1.name, p2.name);
        else if (p1.age < p2.age)
            System.out.printf("%s is senior than %s\n", p2.name, p1.name);
        else
            System.out.printf("%s and %s are at the same age\n", p1.name, p2.name);
        return null;
    }

    public static void main(String[] args) {
        Person p1 = new Person(32, "John");
        Person p2 = new Person(54, "Alex");

        Person compare = compare(p1, p2);
        System.out.println(compare);
    }
}
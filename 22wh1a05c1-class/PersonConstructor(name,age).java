class Person {
    String name;
    int age;

    Person(String nme, int age) {
        name = nme;
        this.age = age;
    }

    void displayName() {
        System.out.println("Name: " + name);
    }

    void displayAge() {
        System.out.println("Age: " + age);
    }
}

class StudentData {
    public static void main(String[] args) {
        Person p1 = new Person("Maya", 25);
        Person p2 = new Person("John", 40);

        p1.displayName();
        p1.displayAge();

        p2.displayName();
        p2.displayAge();
    }
}

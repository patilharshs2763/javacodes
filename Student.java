/*Java Constructor Having Parameters
We can also define constructors having parameters.*/

class Student {

    String name;
    int age;

    // constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void printDetails() {
        System.out.println("My name is " + name + " and my age is " + age);
    }
}

class Test {

    public static void main(String[] args) {
        Student st1 = new Student("John", 25);
        Student st2 = new Student("Julie", 20);

        st1.printDetails();
        st2.printDetails();
    }
}
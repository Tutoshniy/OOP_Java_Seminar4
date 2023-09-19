package Domen;

public class Student extends Person implements Comparable<Student> {
    private int id;
    private static int generalID;

    public Student(String name, int age) {
        super(name, age);
        this.id = generalID;
        generalID++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person name: " + super.getName() + "; age: " + super.getAge() + "; id:" + id;
    }

    @Override
    public int compareTo(Student o) {
        if (super.getAge() == o.getAge())
            return 0;
        else {
            if (super.getAge() > o.getAge())
                return 1;
            else {
                return -1;
            }
        }
    }

}

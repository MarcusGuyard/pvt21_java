package se.bjornkjellgren;

public class Student extends Person {
    public Student(String first_name, String last_name, Short age) {
        super(first_name, last_name, age);
    }

    public void greet(){
        System.out.println("Hej jag heter " + getFirst_name() + " och är student");
    }
}

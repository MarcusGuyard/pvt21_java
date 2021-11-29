package se.bjornkjellgren;

public class School {

    public static void main(String[] args){
        Person p1 = new Person("Björn", "Kjellgren", (short) 40);
        Person p2 = new Person("Louise", "Kjellgren", (short) 38, new Address("En adress", "", "","51196", "", "Sverige"));
        Student s1 = new Student("Carl", "Kjellgren", (short) 5);
        Teacher t1 = new Teacher("Björn", "Kjellgren", (short) 40, "bjorn.kjellgren@kyh.se", "123145150", new Address("","", "", "", "", ""));
        System.out.println(p2);
        s1.greet();
        System.out.println(t1);
    }
}

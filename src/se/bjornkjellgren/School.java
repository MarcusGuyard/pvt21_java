package se.bjornkjellgren;

public class School {

    public static void main(String[] args){
        Person p1 = new Person("Björn", "Kjellgren", (short) 40);
        Person p2 = new Person("Louise", "Kjellgren", (short) 38, new Address("En adrress", "", "","51196", "", "Sverige"));
        System.out.println(p1);
        System.out.println(p2);
    }
}

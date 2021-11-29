package se.bjornkjellgren;

public class Teacher extends Person {
    private String email;
    private String phone_no;

    public Teacher(String first_name, String last_name, Short age, String email, String phone_no, Address address) {
        super(first_name, last_name, age, address);
        this.email = email;
        this.phone_no = phone_no;
    }

    @Override
    public String toString() {
        return "Teacher{" + getFirst_name() +
                "email='" + email + '\'' +
                ", phone_no='" + phone_no + '\'' +
                '}';
    }
}

package se.bjornkjellgren;

public class Person {
    private String first_name; // Private betyder att bara klassen själv har direkt tillgång till variabeln
    private String last_name;
    private Short age;
    private Address address;

    /*
    För heltal har vi ett antal olika typer att välja på
    byte, är 1 byte lång, kan lagra tal mellan -128 upp till 127
    short, är 2 byte lång, kan lagra tal mellan -32768 upp till 32767
    int, är 4 bytes lång, kan lagra tal mellan  -2,147,483,648 upp till 2,147,483,647
    long, är 8 byte lång, kan lagra tal mellan -9,223,372,036,854,775,808 upp till 9,223,372,036,854,775,807
     */

    public Person(String first_name, String last_name, Short age){
        this(first_name, last_name, age, new Address("","","","", "", ""));
    }

    public Person(String first_name, String last_name, Short age, Address address) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.address = address;
    }
    /*
    Vi har två konstruktorer med olika mängd argument. Vilken som används beror på de argument som
    skickas med när vi gör new Person()
     */

    public String getFirst_name(){
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age + address +
                '}';
    }
}

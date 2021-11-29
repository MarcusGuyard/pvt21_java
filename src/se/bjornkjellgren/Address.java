package se.bjornkjellgren;

public class Address {
    private String street;
    private String street_no;
    private String apartment_no;
    private String zip_code;
    private String city;
    private String country;

    public Address(String street, String street_no, String apartment_no, String zip_code, String city, String country) {
        this.street = street;
        this.street_no = street_no;
        this.apartment_no = apartment_no;
        this.zip_code = zip_code;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", street_no='" + street_no + '\'' +
                ", apartment_no='" + apartment_no + '\'' +
                ", zip_code='" + zip_code + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
    /*
    street: str
    street_no: str
    apartment_no: str
    zip_code: str
    city: str
    country: str
     */
}

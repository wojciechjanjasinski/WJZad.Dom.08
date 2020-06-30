package CoachingCompany;

public class Person extends Address {
    private String firstName;
    private String lastName;
    private int age;
    private int pesel;
    private int mobilePhoneNumber;

    public Person() {
    }

    public Person(String street, int homeNumber, int flatNumber, int zipCode, String city, String country, String firstName, String lastName, int age, int pesel, int mobilePhoneNumber) {
        super(street, homeNumber, flatNumber, zipCode, city, country);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public int getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(int mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel=" + pesel +
                ", mobilePhoneNumber=" + mobilePhoneNumber +
                "} " + super.toString();
    }
}

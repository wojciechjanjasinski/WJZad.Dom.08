package CoachingCompany;

public class Student extends People {
    private int identityCardNumber;
    private boolean paymentAlready;
    private boolean previousExperience;
    private boolean previousCustomer;
    private double discountLevel;

    public Student(String street, int homeNumber, int flatNumber, int zipCode, String city, String country, String firstName, String lastName, int age, int pesel, int mobilePhoneNumber, int identityCardNumber, boolean paymentAlready, boolean previousExperience, boolean previousCustomer, double discountLevel) {
        super(street, homeNumber, flatNumber, zipCode, city, country, firstName, lastName, age, pesel, mobilePhoneNumber);
        this.identityCardNumber = identityCardNumber;
        this.paymentAlready = paymentAlready;
        this.previousExperience = previousExperience;
        this.previousCustomer = previousCustomer;
        this.discountLevel = discountLevel;
    }

    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public boolean isPaymentAlready() {
        return paymentAlready;
    }

    public void setPaymentAlready(boolean paymentAlready) {
        this.paymentAlready = paymentAlready;
    }

    public boolean isPreviousExperience() {
        return previousExperience;
    }

    public void setPreviousExperience(boolean previousExperience) {
        this.previousExperience = previousExperience;
    }

    public boolean isPreviousCustomer() {
        return previousCustomer;
    }

    public void setPreviousCustomer(boolean previousCustomer) {
        this.previousCustomer = previousCustomer;
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "identityCardNumber=" + identityCardNumber +
                ", paymentAlready=" + paymentAlready +
                ", previousExperience=" + previousExperience +
                ", previousCustomer=" + previousCustomer +
                ", discountLevel=" + discountLevel +
                '}';
    }
}

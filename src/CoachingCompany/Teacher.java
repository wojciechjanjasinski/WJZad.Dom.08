package CoachingCompany;

public class Teacher extends Person {
    private double salary;
    private double bonus;
    private double overallWorkExperiencePeriod;
    private int workInOurCompanyTime;
    private double jobTime;

    public Teacher() {
    }

    public Teacher(String street, int homeNumber, int flatNumber, int zipCode, String city, String country, String firstName, String lastName, int age, int pesel, int mobilePhoneNumber, double salary, double bonus, double overallWorkExperiencePeriod, int workInOurCompanyTime, double jobTime) {
        super(street, homeNumber, flatNumber, zipCode, city, country, firstName, lastName, age, pesel, mobilePhoneNumber);
        this.salary = salary;
        this.bonus = bonus;
        this.overallWorkExperiencePeriod = overallWorkExperiencePeriod;
        this.workInOurCompanyTime = workInOurCompanyTime;
        this.jobTime = jobTime;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getOverallWorkExperiencePeriod() {
        return overallWorkExperiencePeriod;
    }

    public void setOverallWorkExperiencePeriod(double overallWorkExperiencePeriod) {
        this.overallWorkExperiencePeriod = overallWorkExperiencePeriod;
    }

    public int getWorkInOurCompanyTime() {
        return workInOurCompanyTime;
    }

    public void setWorkInOurCompanyTime(int workInOurCompanyTime) {
        this.workInOurCompanyTime = workInOurCompanyTime;
    }

    public double getJobTime() {
        return jobTime;
    }

    public void setJobTime(double jobTime) {
        this.jobTime = jobTime;
    }

    @Override
    public String toString() {
        return super.toString() + "Teacher{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                ", overallWorkExperiencePeriod=" + overallWorkExperiencePeriod +
                ", workInOurCompanyTime=" + workInOurCompanyTime +
                ", jobTime=" + jobTime +
                "} ";
    }

}

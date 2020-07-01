package CoachingCompany;

public class CourseGroup {
    private Teacher teacher = new Teacher();
    private Student students = new Student();

    public CourseGroup() {
    }

    public CourseGroup(Teacher teacher, Student students) {
        this.teacher = teacher;
        this.students = students;
    }

    public CourseGroup(Teacher teacher) {
        this.teacher = teacher;
    }

    public CourseGroup(Student students) {
        this.students = students;
    }


    Teacher teacherOne = new Teacher("Brzozowa", 14, 32, 5555, "Kąty Wrocławskie", "Polska", "Alfred", "Alberski", 33, 1111111, 111111111, 4500.99, 299.99, 3, 1, 40);
    Student studentOne = new Student("Beskidzka", 25, 54, 98765, "Łódź", "Polska", "Marta", "Krakowska", 24, 24567, 34567, 159, false, false, false, 0);
    Student studentTwo = new Student("Toyoty", 123, 0, 14567, "Połaniewo", "Poland", "Dawid", "Fabiak", 28, 56789, 345678, 19, true, true, true, 20);

    public void teacherOne() {
    }

    public void studentOne() {
    }

    public void studentTwo() {
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "CourseGroup{" +
                "teacher=" + teacher +
                ", students=" + students +
                '}';
    }


}

package CoachingCompany;

public class CourseGroup {
    private Teacher teacher = new Teacher();
    private Student students = new Student();

    public CourseGroup() {
    }

    public CourseGroup(Teacher teacher) {
        this.teacher = teacher;
    }

    public CourseGroup(Student students) {
        this.students = students;
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

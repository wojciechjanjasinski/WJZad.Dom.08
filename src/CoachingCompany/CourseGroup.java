package CoachingCompany;

import java.util.Arrays;

public class CourseGroup {
    private Teacher teacher = new Teacher();
    private Student student = new Student();
    private Student[] students = {};

    public CourseGroup() {
    }


    public Student enrollStudent(Student student){
        this.student = student;
        return new Student();
    }

    public Teacher newTeacher(Teacher teacher){
        return new Teacher();
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "CourseGroup{" +
                "teacher=" + teacher +
                ", student=" + student +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}

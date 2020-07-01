package CoachingCompany;

import java.util.Arrays;

public class CourseGroup {
    private Teacher teacher = new Teacher();
    private Student student = new Student();
    private Student[] students = {};

    public CourseGroup() {
    }

    public CourseGroup(Teacher teacher, Student student, Student[] students) {
        this.teacher = teacher;
        this.student = student;
        this.students = students;
    }

    public CourseGroup(Teacher teacher) {
    }

    Student enrollStudent(Student student){
        return student;
    }
    Teacher newTeacher(Teacher teacher){
    return teacher;
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

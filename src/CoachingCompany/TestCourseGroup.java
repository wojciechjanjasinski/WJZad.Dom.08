package CoachingCompany;

public class TestCourseGroup {
    public static void main(String[] args) {
        CourseGroup courseGroup = new CourseGroup();
        new Teacher();
        Teacher teacher = courseGroup.newTeacher(new Teacher("Brzozowa", 14, 32, 5555, "Kąty Wrocławskie", "Polska", "Alfred", "Alberski", 33, 1111111, 111111111, 4500.99, 299.99, 3, 1, 40));
        CourseGroup courseGroupone = new CourseGroup(new Teacher("Brzozowa", 14, 32, 5555, "Kąty Wrocławskie", "Polska", "Alfred", "Alberski", 33, 1111111, 111111111, 4500.99, 299.99, 3, 1, 40));
        Student [] students = new Student[2];
        students[0] = courseGroupone.enrollStudent(new Student("Toyoty", 123, 0, 14567, "Połaniewo", "Poland", "Dawid", "Fabiak", 28, 56789, 345678, 19, true, true, true, 20));
        students[1] = courseGroupone.enrollStudent(new Student("Beskidzka", 25, 54, 98765, "Łódź", "Polska", "Marta", "Krakowska", 24, 24567, 34567, 159, false, false, false, 0));

        System.out.println(teacher);
        System.out.println(students[0].toString());
        System.out.println(students[1].toString());




    }
}

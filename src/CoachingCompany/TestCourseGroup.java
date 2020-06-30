package CoachingCompany;

public class TestCourseGroup {
    public static void main(String[] args) {
        CourseGroup courseGroupTeacher = new CourseGroup(new Teacher("Brzozowa", 14, 32, 5555, "Kąty Wrocławskie", "Polska", "Alfred", "Alberski", 33, 1111111, 111111111, 4500.99, 299.99, 3, 1, 40));
        CourseGroup[] courseGroupStudents = new CourseGroup[2];
        courseGroupStudents[0] = new CourseGroup(new Student("Klonowa", 25, 55, 5567, "Kąty Raciorskie", "Polska", "Anna", "Kowalska", 22, 22222, 22222222, 123, true, false, false, 0));
        courseGroupStudents[1] = new CourseGroup(new Student("Arbuzowa", 23, 45, 3333, "Opole", "Polska", "Franciszek", "Faniewicz", 28, 34567, 345543, 122, false, true, true, 10));

        System.out.println(courseGroupTeacher);

        for (CourseGroup courseGroup: courseGroupStudents){
            System.out.println(courseGroup);
        }
    }
}

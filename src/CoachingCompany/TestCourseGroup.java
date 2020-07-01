package CoachingCompany;

public class TestCourseGroup {
    public static void main(String[] args) {
        CourseGroup courseGroup = new CourseGroup();
        courseGroup.teacherOne();
        courseGroup.studentOne();
        courseGroup.studentTwo();

        System.out.println(courseGroup.teacherOne);
        System.out.println(courseGroup.studentOne);
        System.out.println(courseGroup.studentTwo);


    }
}

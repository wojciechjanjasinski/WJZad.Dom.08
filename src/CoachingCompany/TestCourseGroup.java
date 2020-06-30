package CoachingCompany;

import java.util.ArrayList;

public class TestCourseGroup {
    public static void main(String[] args) {
        ArrayList<Object> objectsTwo = new ArrayList<>();
        objectsTwo.add(0, new Teacher("Przestrzenna", 555, 555, 55555, "Bielany Wrocławskie", "Polskie", "Adam", "Alfeldi", 34, 34567, 34567, 4699,99, 10, 5, 40));
        objectsTwo.add(1, new Student("Słoneczna", 444, 444, 45665, "Bielany Wrocławskie", "Poland", "Urszula", "Kocioł", 28, 287654, 34567, 13, true, true, true, 25));
        objectsTwo.add(2, new Student("Logistyczna", 333, 333, 33333, "Bielany Wrocławskie", "Polska", "Zbigniew", "Tauzend", 45, 45678, 456789, 15, false, false, false, 0));

        TestCourseGroup.objectsTwoPrint(objectsTwo);

    }
    static void objectsTwoPrint(ArrayList<Object> objectsTwo) {
        System.out.println(objectsTwo.get(0));
        System.out.println(objectsTwo.get(1));
        System.out.println(objectsTwo.get(2));
        System.out.println(objectsTwo.size());
    }
}

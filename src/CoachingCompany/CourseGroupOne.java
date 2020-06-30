package CoachingCompany;

import java.util.ArrayList;

public class CourseGroupOne {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(0, new Teacher("Brzozowa", 14, 32, 5555, "Kąty Wrocławskie", "Polska", "Alfred", "Alberski", 33, 1111111, 111111111, 4500.99, 299.99, 3, 1, 40));
        persons.add(1, new Student("Klonowa", 25, 55, 5567, "Kąty Raciorskie", "Polska", "Anna", "Kowalska", 22, 22222, 22222222, 123, true, false, false, 0));
        persons.add(2, new Student("Arbuzowa", 23, 45, 3333, "Opole", "Polska", "Franciszek", "Faniewicz", 28, 34567, 345543, 122, false, true, true, 10));
        persons.add(3, new Student("Elektromobilności", 14, 14, 12332, "Gdańsk", "Polska", "Anna", "Chmielewska", 35, 23454, 456654, 129, true, true, true, 15));
        persons.add(4, new Student("Kleszczewska", 24, 45, 12345, "Kociałkowo", "Poland", "Anna", "Chmielwska", 44, 44567, 456789, 141, true, false, false, 0));
        persons.add(5, new Student("Wodorowa", 67, 76, 14556, "Lipowo", "Polska", "Cyprian", "Etul", 25, 123321, 1245678, 155, false, false, false, 0));
        persons.add(6, new Student("Toyoty", 123, 0, 14567, "Połaniewo", "Poland", "Dawid", "Fabiak", 28, 56789, 345678, 19, true, true, true, 20));
        persons.add(7, new Student("Beskidzka", 25, 54, 98765, "Łódź", "Polska", "Marta", "Krakowska", 24, 24567, 34567, 159, false, false, false, 0));

        for (Person person : persons) {
            System.out.println(person);

        }
        System.out.println(persons.size());
    }
}

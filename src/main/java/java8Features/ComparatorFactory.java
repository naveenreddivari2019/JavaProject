package java8Features;

import java.util.Comparator;

public class ComparatorFactory {
    public static Comparator<Student> sortOnID=Comparator.comparing(Student::getId);
    public static Comparator<Student> sortOnName=Comparator.comparing(e->e.getName());
    public static Comparator<Student> sortOnNameReverse=sortOnName.reversed();
}

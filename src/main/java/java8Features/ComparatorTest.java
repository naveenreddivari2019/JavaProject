package java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {

        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(5, "D"));
        al.add(new Student(2, "H"));
        al.add(new Student(1, "A"));
        al.add(new Student(7, "Z"));

        //Collections.sort(al, ComparatorFactory.sortOnID);
        //Collections.sort(al, ComparatorFactory.sortOnName);
        Collections.sort(al, ComparatorFactory.sortOnNameReverse);
        al.forEach(
                e -> {
                    System.out.println(e.getId() + " | " + e.getName());
                }
        );

    }
}

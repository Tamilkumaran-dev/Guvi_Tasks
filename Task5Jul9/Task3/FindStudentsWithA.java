package Task5Jul9.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStudentsWithA {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Arun", "Bala", "Anjali", "Deepak", "Akhil");
            System.out.println("before");
            System.out.println(students);
        List<String> aStudents = students.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
         System.out.println("After");
         System.out.println(aStudents);
    }

}

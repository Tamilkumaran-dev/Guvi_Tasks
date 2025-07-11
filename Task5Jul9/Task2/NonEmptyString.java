package Task5Jul9.Task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyString {

        public static void main(String[] args) {
            List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
            List<String> nonEmptyStrings = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
            System.out.println("Before");
            System.out.println(strings);
            System.out.println("After");
            System.out.println(nonEmptyStrings);
        }
    }



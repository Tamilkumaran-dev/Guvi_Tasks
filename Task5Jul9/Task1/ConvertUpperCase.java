package Task5Jul9.Task1;

import java.util.stream.Stream;

public class ConvertUpperCase {

    public static void main(String[] args){
        Stream<String> str = Stream.of("abc","d","ef");
        str.map(s->s.toUpperCase()).forEach(System.out::println);
    }

}

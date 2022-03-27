package stream;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringStream {
    public static void main(String[] args) {
        IntStream charsStream = "Stream".chars();

        Stream<String> stringStream = Pattern.compile(", ").splitAsStream("Eric, Elena, Java");

        Stream<String> stream1 = Stream.of("Java", "Scala", "Groovy");
        Stream<String> stream2 = Stream.of("Python", "Go", "Swift");
        Stream<String> concat = Stream.concat(stream1, stream2);


        // 스트림 가공
        List<String> names = Arrays.asList("Eric", "Elena", "Java");
        System.out.println("names : " + names);
    }
}

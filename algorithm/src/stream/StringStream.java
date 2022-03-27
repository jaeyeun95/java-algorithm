package stream;

import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringStream {
    public static void main(String[] args) {
        IntStream charsStream = "Stream".chars();

        Stream<String> stringStream = Pattern.compile(", ").splitAsStream("Eric, Elena, Java");
        
    }
}

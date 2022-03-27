package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ManufactureStream {
    public static void main(String[] args) {
        // filtering
        List<String> names = Arrays.asList("Eric", "Elena", "Java");
        Stream<String> stream = names.stream().filter(name -> name.contains("a"));

        // mapping
        Stream<String> upperList = names.stream().map(String::toUpperCase);
        System.out.println("upper : " + upperList);
    }
}

package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ManufactureStream {
    public static void main(String[] args) {
        // filtering
        List<String> names = Arrays.asList("Eric", "Elena", "Java");
        Stream<String> stream = names.stream().filter(name -> name.contains("a"));

        // mapping
        Stream<String> upperList = names.stream().map(String::toUpperCase);
        System.out.println("upper : " + upperList);

        // sorting
        IntStream.of(14, 11, 20, 39, 23).sorted().boxed().collect(Collectors.toList());
        System.out.println(IntStream.of(14, 11, 20, 39, 23).sorted().boxed().collect(Collectors.toList()));

        // 인자가 있는 경우
        List<String> lang = Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift");

        lang.stream().sorted().collect(Collectors.toList());
        System.out.println("lang sorted : "+lang.stream().sorted().collect(Collectors.toList()));
        System.out.println("lang sorted 2 : " + lang.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        System.out.println("글자수 짧은 것 부터 sorted" + lang.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList()));
        System.out.println("글자수 긴 것 부터 : " + lang.stream().sorted( (s1, s2) -> s2.length() - s1.length()).collect(Collectors.toList()));

        // iterating
        int sum = IntStream.of(1,3,5,7,9).peek(System.out::println).sum();
        System.out.println("sum : " + sum);

    }
}

package stream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamResult {
    public static void main(String[] args) {
        long count = IntStream.of(1, 3, 4, 7, 9).count();
        long sum = LongStream.of(1, 3, 5, 7, 9).sum();

        System.out.println("count : " + count);
        System.out.println("sum : " + sum);

        OptionalInt min = IntStream.of(1, 3, 5, 7, 9).min();
        OptionalInt max = IntStream.of(1, 3, 5, 7, 9).max();

        DoubleStream.of(1.1, 2.2, 3.3, 4.4, 5.5).average().ifPresent(System.out::println);

    }
}

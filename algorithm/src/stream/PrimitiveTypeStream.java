package stream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveTypeStream {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 5);
        LongStream longStream = LongStream.rangeClosed(1, 5);

        System.out.println("int : " + intStream.toString());
        System.out.println("long : " + longStream);
    }
}

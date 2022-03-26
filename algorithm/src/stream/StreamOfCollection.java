package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOfCollection {
    public static void main(String[] args) {
        // 컬렉션 스트림
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream = list.stream();
        Stream<String> parallelStream = list.parallelStream(); // 병렬 처리 스트림

        System.out.println("stream : " + stream);
        System.out.println("parallelStream : " + parallelStream);
    }
}

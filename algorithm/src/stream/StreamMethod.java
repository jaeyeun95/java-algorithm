package stream;

import java.util.stream.Stream;

public class StreamMethod {
    public static void main(String[] args) {
        // Stream.builder()
        Stream<String> builderStream = Stream.<String>builder()
                .add("Eric").add("Elena").add("Java")
                .build();

        // Stream.generate()
        Stream<String> generatedStream = Stream.generate(() -> "gen").limit(5);

        // Stream.iterate()
        Stream<Integer> iteratedStream = Stream.iterate(30, n -> n + 2).limit(5);


    }
}

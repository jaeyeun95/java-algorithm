package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOfArray {
    public static void main(String[] args) {
        // 배열 스트림
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stream = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);    // 1~2 요소 [b,c]

        System.out.println("stream : " + stream.toString());
        System.out.println("streamOfArrayPart : " + streamOfArrayPart.toString());

    }
}

package src.streams;

import java.util.List;
import java.util.stream.Stream;

public class Client {

  public static void main(String[] args) {
    // Streams Definition: Wrapper over data sets

    // How to create a stream
    // 1.
    Integer[] arr = {1,2,3,4,5,6,7};
    Stream<Integer> stream = Stream.of(arr);

    //2
    Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7,8);

    //3
    List<Integer> list = List.of(1,2,3,4);
    Stream<Integer> stream3 = list.stream();

  }

}

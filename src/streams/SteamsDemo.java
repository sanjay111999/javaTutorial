package src.streams;

import java.util.ArrayList;
import java.util.List;

public class SteamsDemo {

  public static void main(String[] args) {
    List<Integer> list = List.of(1,2,3,4,5,6);

    // Task1: Filter all the even values from the list
    // Traditional Method
    List<Integer> traditionalEvenList = new ArrayList<>();
    for (int x: list) {
      if (x %2 == 0) {
        traditionalEvenList.add(x);
      }
    }
    System.out.println(traditionalEvenList);
    // How to do above using streams

    List<Integer> evenList = list.stream().filter(x -> x%2==0).toList();
    System.out.println(evenList);
    System.out.println(list.stream().map(x -> x+2).toList());
  }

}

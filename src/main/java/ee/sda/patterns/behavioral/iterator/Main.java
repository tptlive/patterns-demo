package ee.sda.patterns.behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 45, 5, 7);

    Iterator<Integer> iterator = integers.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    for (Integer integer : integers) {
      System.out.println(integer);
    }
  }

}

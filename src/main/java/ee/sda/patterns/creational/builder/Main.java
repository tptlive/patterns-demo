package ee.sda.patterns.creational.builder;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    Person person = new Person.Builder()
        .fullName("John Smith")
        .age(500)
        .addFriend("1")
        .addFriend("2")
        .addFriend("3")
        .addFriend("4")
        .addFriend("5")
        .addFriends(Arrays.asList("6", "7", "8"))
        .addFriends("6", "7", "8")
        .build();

    System.out.println(person);
  }

}

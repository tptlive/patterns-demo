package ee.sda.patterns.creational.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Person {

  private String firstName;
  private String lastName;
  private int age;
  private List<String> friends;

  private Person() {
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", age=" + age +
        '}';
  }

  public static class Builder {

    private String firstName;
    private String lastName;
    private int age;
    private List<String> friends = new ArrayList<String>();

    public Builder fullName(String fullName) {
      String[] nameParts = fullName.split("\\s");
      this.firstName = nameParts[0];
      this.lastName = nameParts[1];
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Builder addFriend(String friend) {
      this.friends.add(friend);
      return this;
    }

    public Builder addFriends(Collection<String> friends) {
      this.friends.addAll(friends);
      return this;
    }

    public Builder addFriends(String... friends) {
      this.friends.addAll(Arrays.asList(friends));
      return this;
    }

    public Person build() {
      Person person = new Person();
      person.lastName = this.lastName;
      person.firstName = this.firstName;
      person.age = this.age;
      person.friends = this.friends;

      return person;
    }

  }

}

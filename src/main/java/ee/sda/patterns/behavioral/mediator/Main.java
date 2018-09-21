package ee.sda.patterns.behavioral.mediator;

public class Main {

  public static void main(String[] args) {
    Chat chat = new Chat();

    User john = new User("John", chat);
    User peter = new User("Peter", chat);
    User elsa = new User("Elsa", chat);

    chat.addUser(john);
    chat.addUser(peter);
    chat.addUser(elsa);

    john.send("HELLO");
  }

}

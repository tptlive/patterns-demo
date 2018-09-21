package ee.sda.patterns.behavioral.mediator;

public class User {

  private Chat chat;
  private String name;

  public User(String name, Chat chat) {
    this.name = name;
    this.chat = chat;
  }

  public void receive(String message) {
    System.out.println(name + " received message: " + message);
  }

  public void send(String message) {
    chat.send(message);
  }

}

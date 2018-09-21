package ee.sda.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Chat {

  private List<User> users;

  public Chat() {
    users = new ArrayList<>();
  }

  public void addUser(User user) {
    users.add(user);
  }

  public void send(String message) {
    for (User user : users) {
      user.receive(message);
    }
  }

}

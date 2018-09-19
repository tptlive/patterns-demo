package ee.sda.patterns.creational.singleton;

public class VeryExpensiveService {

  private static VeryExpensiveService instance;

  private VeryExpensiveService() {
  }

  public static VeryExpensiveService getInstance() {
    if (instance == null) {
      // simulate expensive creation
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      instance =  new VeryExpensiveService();
    }
    return instance;
  }

}

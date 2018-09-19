package ee.sda.patterns.creational.singleton;

public class Main {

  public static void main(String[] args) {
    VeryExpensiveService veryExpensiveService1 = VeryExpensiveService.getInstance();
    VeryExpensiveService veryExpensiveService2 = VeryExpensiveService.getInstance();
    VeryExpensiveService veryExpensiveService3 = VeryExpensiveService.getInstance();
    VeryExpensiveService veryExpensiveService4 = VeryExpensiveService.getInstance();
    VeryExpensiveService veryExpensiveService5 = VeryExpensiveService.getInstance();
    VeryExpensiveService veryExpensiveService6 = VeryExpensiveService.getInstance();
    VeryExpensiveService veryExpensiveService7 = VeryExpensiveService.getInstance();
    VeryExpensiveService veryExpensiveService8 = VeryExpensiveService.getInstance();
    VeryExpensiveService veryExpensiveService9 = VeryExpensiveService.getInstance();
  }

}

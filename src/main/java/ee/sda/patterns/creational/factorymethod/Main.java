package ee.sda.patterns.creational.factorymethod;

public class Main {

  public static void main(String[] args) {
    Integer integer = Integer.valueOf("100");
    String string = String.valueOf(100);

    ComputerType pc = ComputerType.of("Personal Computer");
    System.out.println(pc.name());
  }

}

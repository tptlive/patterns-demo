package ee.sda.patterns.creational.factorymethod;

import java.util.Arrays;

public enum ComputerType {

  PC("Personal Computer"),
  MAC("Computer from Apple");

  private String humanReadableValue;

  ComputerType(String s) {
    this.humanReadableValue = s;
  }

  @Override
  public String toString() {
    return humanReadableValue;
  }

  public static ComputerType of(String humanReadableValue) {
    return Arrays.stream(values())
        .filter(computerType -> computerType.humanReadableValue.equals(humanReadableValue))
        .findFirst().get();
  }

}

package ee.sda.patterns.structural.adapter;

public class Main {

  public static void main(String[] args) {
    CircleHole circleHole = new CircleHole(50);
    CirclePug circlePug50 = new CirclePug(50);
    CirclePug circlePug100 = new CirclePug(100);
    CirclePug circlePug25 = new CirclePug(25);

    System.out.println(circleHole.take(circlePug25));
    System.out.println(circleHole.take(circlePug50));
    System.out.println(circleHole.take(circlePug100));
  }

}

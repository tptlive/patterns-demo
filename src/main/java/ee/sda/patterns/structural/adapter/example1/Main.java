package ee.sda.patterns.structural.adapter.example1;

public class Main {

  public static void main(String[] args) {
    CircleHole circleHole = new CircleHole(50);
    BasicCirclePug circlePug50 = new BasicCirclePug(50);
    BasicCirclePug circlePug100 = new BasicCirclePug(100);
    BasicCirclePug circlePug25 = new BasicCirclePug(25);

    System.out.println(circleHole.take(circlePug25));
    System.out.println(circleHole.take(circlePug50));
    System.out.println(circleHole.take(circlePug100));

    SquarePug squarePug50 = new SquarePug(50);
    boolean result1 = circleHole.take(new SquareToCirclePugAdapter(squarePug50));
    System.out.println(result1);

    SquarePug squarePug1000 = new SquarePug(1000);
    boolean result2 = circleHole.take(new SquareToCirclePugAdapter(squarePug1000));
    System.out.println(result2);

  }

}

package ee.sda.patterns.structural.adapter.example1;

public class SquareToCirclePugAdapter implements CirclePug {

  private SquarePug squarePug;

  public SquareToCirclePugAdapter(SquarePug squarePug) {
    this.squarePug = squarePug;
  }

  @Override
  public int getRadius() {
    return (int) Math.floor((squarePug.getSideLength() * Math.sqrt(2)) / 2);
  }

}

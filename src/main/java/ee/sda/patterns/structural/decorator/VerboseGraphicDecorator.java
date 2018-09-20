package ee.sda.patterns.structural.decorator;

public class VerboseGraphicDecorator implements Graphic {

  private Graphic decoratedGraphic;

  public VerboseGraphicDecorator(Graphic decoratedGraphic) {
    this.decoratedGraphic = decoratedGraphic;
  }

  @Override
  public void draw() {
    System.out.println("START OF DRAWING");
    decoratedGraphic.draw();
    System.out.println("END OF DRAWING");
  }

}

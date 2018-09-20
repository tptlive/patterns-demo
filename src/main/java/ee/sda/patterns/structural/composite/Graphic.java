package ee.sda.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Graphic {

  private String name;
  private List<Graphic> children = new ArrayList<>();

  public Graphic(String name) {
    this.name = name;
  }

  public void add(Graphic g) {
    children.add(g);
  }

  public void draw() {
    System.out.println(name);
    for (Graphic child : children) {
      System.out.print("  ");
      child.draw();
    }
  }

}

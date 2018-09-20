package ee.sda.patterns.structural.adapter.example2;

// SHOULD BE REPLACED WITH BetterSingleClickHandler
public class ActualSingleClickHandler implements ClickHandler {

  @Override
  public void handleSingleClick() {
    System.out.println("Handling single click");
  }

  @Override
  public void handleDoubleClick() {
    // intentionally left blank
  }

  @Override
  public void handleLongClick() {
    // intentionally left blank
  }

}

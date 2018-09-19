package ee.sda.patterns.creational.abstractfactory;

import ee.sda.patterns.creational.abstractfactory.model.MacOsScrollBar;
import ee.sda.patterns.creational.abstractfactory.model.MacOsWindow;
import ee.sda.patterns.creational.abstractfactory.model.ScrollBar;
import ee.sda.patterns.creational.abstractfactory.model.Window;

public class MacOsWidgetFactory extends WidgetFactory {

  public Window createWindow() {
    return new MacOsWindow();
  }

  public ScrollBar createScrollBar() {
    return new MacOsScrollBar();
  }

}

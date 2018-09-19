package ee.sda.patterns.creational.abstractfactory;

import ee.sda.patterns.creational.abstractfactory.model.ScrollBar;
import ee.sda.patterns.creational.abstractfactory.model.Window;

public abstract class WidgetFactory {

  public abstract Window createWindow();

  public abstract ScrollBar createScrollBar();

  public static WidgetFactory getInstance() {
    String osName = System.getProperty("os.name");
    return getInstance(osName);
  }

  public static WidgetFactory getInstance(String osName) {
    WidgetFactory widgetFactory;
    if (osName.startsWith("Windows")) {
      widgetFactory = new WindowsWidgetFactory();
    } else if (osName.startsWith("Mac OS")) {
      widgetFactory = new MacOsWidgetFactory();
    } else {
      widgetFactory = new MacOsWidgetFactory();
    }
    return widgetFactory;
  }

}

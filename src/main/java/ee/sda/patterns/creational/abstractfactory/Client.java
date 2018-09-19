package ee.sda.patterns.creational.abstractfactory;

import ee.sda.patterns.creational.abstractfactory.model.ScrollBar;
import ee.sda.patterns.creational.abstractfactory.model.Window;

public class Client {

  public static void main(String[] args) {
//    WidgetFactory widgetFactory;
//    if (osName.startsWith("Windows")){
//      widgetFactory = new WindowsWidgetFactory();
//    } else if (osName.startsWith("Mac OS")) {
//      widgetFactory = new MacOsWidgetFactory();
//    } else {
//      widgetFactory = new MacOsWidgetFactory();
//    }
    WidgetFactory widgetFactory = WidgetFactory.getInstance();

    ScrollBar scrollBar = widgetFactory.createScrollBar();
    Window window = widgetFactory.createWindow();

    scrollBar.show();
    window.open();
  }

}

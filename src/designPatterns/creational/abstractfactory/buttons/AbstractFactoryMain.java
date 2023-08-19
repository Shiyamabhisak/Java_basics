package designPatterns.creational.abstractfactory.buttons;

public class AbstractFactoryMain {
    private static GuiFactory factory;
    private static Button button;
    private static Checkbox checkbox;
    public static void main(String[] args) {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOsFactory();
        } else {
            factory = new WindowsFactory();
        }
        button = factory.createButton();
        checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();
    }
}

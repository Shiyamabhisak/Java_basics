package designPatterns.creational.abstractfactory.buttons;

// Abstract factory knows about all (abstract) product types.
public interface GuiFactory {
    Button createButton();
    Checkbox createCheckbox();
}

class MacOsFactory implements GuiFactory{
    public Button createButton(){
        return new MacOsButton();
    }

    public Checkbox createCheckbox(){
        return new MacOsCheckbox();
    }
}

class WindowsFactory implements GuiFactory{
    public Button createButton(){
        return new WindowsButton();
    }

    public Checkbox createCheckbox(){
        return new WindowsCheckbox();
    }
}



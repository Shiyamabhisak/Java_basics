package designPatterns.creational.factorymethod.buttons;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public abstract class Dialog {
    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();
}

// Windows Dialog will produce Windows buttons.
class HtmlDialog extends Dialog{
    public Button createButton() {
        return new HtmlButton();
    }
}

class MacDialog extends Dialog {

    @Override
    public Button createButton() {
        return new MacButton();
    }
}



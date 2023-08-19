package designPatterns.creational.abstractfactory.buttons;

// This is the common interface for checkbox family.
public interface Checkbox {
    void paint();
}

// This create a MacOS Checkbox
class MacOsCheckbox implements Checkbox{
    public void paint(){
        System.out.println("Created a Mac-OS Checkbox");
    }
}

// This creates a Windows Checkbox
class WindowsCheckbox implements Checkbox{
    public void paint(){
        System.out.println("Created a Windows Checkbox");
    }
}

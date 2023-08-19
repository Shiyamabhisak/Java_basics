package designPatterns.creational.abstractfactory.buttons;

// Problem Statement: How can we create many number of objects involving several families of products, structured into separate class hierarchies, without actually modifying the client code again and again ?
// Solution: All products of the same family share the common interface.

// This is the common interface for buttons family.
public interface Button {
    void paint();
}

// This class creates a Mac OS Button
class MacOsButton implements Button{
    public void paint() {
        System.out.println("Created a Mac-OS Button.");
    }
}
// This class creates a Windows Button
class WindowsButton implements Button{
    public void paint() {
        System.out.println("Created a Windows Button.");
    }
}

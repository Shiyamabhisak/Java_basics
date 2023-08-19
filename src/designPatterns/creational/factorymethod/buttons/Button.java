package designPatterns.creational.factorymethod.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Problem Statement: How can we create many number of objects without actually modifying the client code again and again ?
//Solution: We can create product objects without specifying their concrete classes.


//Common interface for all buttons
public interface Button {
    void render();
    void onClick();
}

//HTML Button Implementation
class HtmlButton implements Button{
    public void render() {
        System.out.println("<button>HTML Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Clicked! Button says - 'Hello World!!!'");
    }
}

//Windows Button Implementation
class MacButton implements Button{
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;

    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(80, 19, 194));
        label.setFont(new Font("Dialog", Font.BOLD, 34));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        onClick();
        panel.add(button);

        frame.setSize(320, 200);
        frame.setVisible(true);
        onClick();
    }

    public void onClick() {
        button = new JButton("Exit");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });
    }
}

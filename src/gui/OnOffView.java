package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class OnOffView extends JFrame implements View {

    private JButton button;
    private JLabel label;

    public OnOffView() {
        initLayout();
    }

    private void initLayout() {
        label = new JLabel("an");
        label.setHorizontalAlignment(JLabel.CENTER);
        button = new JButton("Aus");

        add(button, BorderLayout.NORTH);
        add(label);

        setSize(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void setButtonListener(ActionListener listener) {
        button.addActionListener(listener);
    }

    @Override
    public void setButtonText(String text) {
        button.setText(text);
    }

    @Override
    public void setAusgabeText(String text) {
        label.setText(text);
    }

}

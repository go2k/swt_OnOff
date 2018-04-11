
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fenster extends JFrame {

    private JButton button;
    private JLabel label;

    public Fenster() {
        initLayout();
        initEvents();
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

    private void initEvents() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button.getText().equals("Aus")) {
                    button.setText("An");
                    label.setText("aus");
                } else {
                    button.setText("Aus");
                    label.setText("an");
                }
            }
        });
    }
}

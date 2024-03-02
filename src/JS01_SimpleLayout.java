import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JS01_SimpleLayout implements ActionListener {
    public JFrame jFrame;
    JLabel jLabel;
    JTextField jTextField;

    public JS01_SimpleLayout(){

        JButton jButton = new JButton("Click me");
        jButton.setBounds(100, 40, 100, 30);

        jLabel = new JLabel("This is lable");
        jLabel.setBounds(100, 90, 250, 30);

        jTextField = new JTextField();
        jTextField.setBounds(100, 150, 250, 30);

        jFrame.add(jTextField);
        jFrame.add(jLabel);
        jFrame.add(jButton);

        jButton.addActionListener(this);

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            jLabel.setText("This is replaced text");
            jTextField.setText("This is another replaced text");
        }

    public static void main(String[] args) {
        JS01_SimpleLayout ns = new JS01_SimpleLayout();
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JS03_PasswordField {
    public JFrame jFrame;
    public JS03_PasswordField(){
        jFrame = new JFrame("Password field");

        JLabel jLabel = new JLabel("Password");
        jLabel.setBounds(40, 10, 100, 20);
        JLabel jLabel2 = new JLabel("");
        jLabel2.setBounds(150, 40, 100, 20);

        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setBounds(150, 10, 100, 20);

        JButton jButton = new JButton("show");
        jButton.setBounds(150, 70, 100, 20);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel2.setText(jPasswordField.getText());
            }
        });

        jFrame.add(jPasswordField);
        jFrame.add(jLabel);
        jFrame.add(jLabel2);
        jFrame.add(jButton);

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JS03_PasswordField ns = new JS03_PasswordField();
    }
}

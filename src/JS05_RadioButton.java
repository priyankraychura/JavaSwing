import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JS05_RadioButton implements ActionListener {
    public JFrame jFrame;
    JRadioButton jRadioButtonOne, jRadioButtonTwo;
    public JS05_RadioButton() {
        jFrame = new JFrame("JFrame word and char count");

        jRadioButtonOne = new JRadioButton("Male");
        jRadioButtonOne.setBounds(100, 50, 100, 30);
        jRadioButtonTwo = new JRadioButton("Female");
        jRadioButtonTwo.setBounds(100, 100, 100, 30);

        JButton jButton = new JButton("Clcik me");
        jButton.setBounds(100, 150, 80, 30);

        jButton.addActionListener(this);

        jFrame.add(jButton);
        jFrame.add(jRadioButtonOne);
        jFrame.add(jRadioButtonTwo);

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (jRadioButtonOne.isSelected()){
            JOptionPane.showMessageDialog(jFrame, "you are male");
            jRadioButtonOne.setSelected(false);
        } if (jRadioButtonTwo.isSelected()){
            JOptionPane.showMessageDialog(jFrame, "You are female");
            jRadioButtonTwo.setSelected(false);

        }
    }

    public static void main(String[] args) {
        JS05_RadioButton ns = new JS05_RadioButton();
    }
}

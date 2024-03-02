import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JS04_CheackBox implements ActionListener {
    JFrame jFrame;
    JCheckBox checkBoxOne, checkBoxTwo, checkBoxThree;
    public JS04_CheackBox(){
        jFrame = new JFrame("Password field");

        JLabel jLabel = new JLabel("Food Billing");
        jLabel.setBounds(50, 50, 300, 20);

        checkBoxOne = new JCheckBox("Pizza 100");
        checkBoxOne.setBounds(100, 100, 150, 20);
        checkBoxTwo = new JCheckBox("Burger 100");
        checkBoxTwo.setBounds(100, 150, 150, 20);
        checkBoxThree = new JCheckBox("Tea 35");
        checkBoxThree.setBounds(100, 200, 150, 20);

        JButton jButton = new JButton("Total");
        jButton.setBounds(100, 250, 80, 30);

        jButton.addActionListener(this);

        jFrame.add(jButton);
        jFrame.add(jLabel);
        jFrame.add(checkBoxOne);
        jFrame.add(checkBoxTwo);
        jFrame.add(checkBoxThree);

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = "";
        if (checkBoxOne.isSelected()){
            amount += 100;
            msg += "Pizza 100\n";
        } if (checkBoxTwo.isSelected()){
            amount += 100;
            msg += "Burger 100\n";
        } if (checkBoxThree.isSelected()){
            amount += 35;
            msg += "Tea 35\n";
        }
        msg += "-------------------------\n";
        JOptionPane.showMessageDialog(jFrame, msg + "Total amount: " + amount);
    }

    public static void main(String[] args) {
        JS04_CheackBox ns = new JS04_CheackBox();
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JS02_WordAndCharCount implements ActionListener {
    public JFrame jFrame;
    JLabel jLabel;
    private final JTextArea jTextArea;
    public JS02_WordAndCharCount(){
        jFrame = new JFrame("JFrame word and char count");

        //JText area setup
        jTextArea = new JTextArea();
        jTextArea.setBounds(40, 40, 250, 250);

        jTextArea.setBackground(Color.cyan);
        jTextArea.setForeground(Color.red);

        jFrame.add(jTextArea);

        //JButton setup
        JButton jButton = new JButton("Word count");
        jButton.setBounds(150, 310, 150, 30);
        jFrame.add(jButton);

        //JLable setup
        jLabel = new JLabel("");
        jLabel.setBounds(40, 10, 250, 20);
        jFrame.add(jLabel);

        jButton.addActionListener(this);

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = jTextArea.getText();
        String[] word = text.split(" ");
        jLabel.setText("Total char: " + text.length() + " total word: " + word.length);
    }

    public static void main(String[] args) {
        JS02_WordAndCharCount ns = new JS02_WordAndCharCount();
    }
}

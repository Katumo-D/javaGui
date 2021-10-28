import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaGui extends JFrame{
    private JPanel main;
    private JTextField txtFirstName;
    private JTextField txtSecondName;
    private JTextField txtGender;
    private JTextField txtMobileNo;
    private JButton submitButton;

    public JavaGui() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String FirstName = txtFirstName.getText();
                String SecondName= txtSecondName.getText();
                String Gender= txtGender.getText();
                String MobileNo= txtMobileNo.getText();

                JOptionPane.showMessageDialog(null, FirstName);
                JOptionPane.showMessageDialog(null, SecondName);
                JOptionPane.showMessageDialog(null, Gender);
                JOptionPane.showMessageDialog(null, MobileNo);
            }
        });
    }

    public static void main(String[] args) {
        JavaGui G =  new JavaGui();
        G.setContentPane(new JavaGui().main);
        G.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        G.setVisible(true);
        G.pack();
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class JavaGui extends JFrame {
    private JPanel main;
    private JTextField txtFirstName;
    private JTextField txtSecondName;
    private JTextField txtGender;
    private JTextField txtMobileNo;
    private JButton submitButton;


    public static void main(String[] args) {
        JavaGui G = new JavaGui();
        G.setContentPane(new JavaGui().main);
        G.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        G.setVisible(true);
        G.pack();
    }

    Connection con;
    PreparedStatement pst;
    public void Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/user details ", "root", "");
            //System.out.println("Success");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public JavaGui() {
        Connect();
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String FirstName,SecondName,Gender,MobileNo;

                FirstName = txtFirstName.getText();
                SecondName = txtSecondName.getText();
                Gender = txtGender.getText();
                MobileNo = txtMobileNo.getText();

                try {
                    pst = con.prepareStatement("insert into test(FirstName,SecondName,Gender,MobileNo)values(?,?,?,?)");
                    pst.setString(1, FirstName);
                    pst.setString(2, SecondName);
                    pst.setString(3, Gender);
                    pst.setString(4, MobileNo);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Record Addedddddd!!!!");

                    txtFirstName.setText("");
                    txtSecondName.setText("");
                    txtGender.setText("");
                    txtMobileNo.setText("");

                    txtFirstName.requestFocus();
                }

                catch (SQLException e1)
                {
                    e1.printStackTrace();
                }
            }
        });
    }
}

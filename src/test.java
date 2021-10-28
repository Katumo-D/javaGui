import javax.swing.*;
import java.util.Scanner;

public class test {
    private JPanel panel1;
    private JPanel main;
    private JTextField textField1;
    private JTextField textField2;

    private void createUIComponents() {
        // TODO: place custom component creation code here
        Scanner s = new Scanner(System.in);
        System.out.println("===Enter Account Details===");
        System.out.println("Enter FirstName: " );
        String firstName=s.nextLine();
        System.out.println("Enter SecondName: " );
        String secondName=s.nextLine();
        System.out.println("Enter Gender : M/F ");
        char Gender=s.next().charAt(0);
        System.out.println("Enter Phoneno");
        int Phoneno= s.nextInt();
    }
}

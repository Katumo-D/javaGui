import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
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

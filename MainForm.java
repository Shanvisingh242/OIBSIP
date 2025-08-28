package task1;

import java.util.Scanner;

public class MainForm
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Login ID: ");
        String loginID=in.nextLine();
        String loginResult= LoginForm.validateLoginID(loginID);
        if(!loginResult.equals("Valid"))
        {
            System.out.println("Login Failed: "+loginResult);
            in.close();
            return;
        }
        System.out.print("Enter Password : " );
        String password=in.nextLine();
        String passResult= LoginForm.validatePassword(password);
        if(!passResult.equals("Valid"))
        {
            System.out.println("Login Failed: "+passResult);
            in.close();
            return;
        }
        System.out.println("\n Login Successful Welcome "+loginID);
        reservation r = new reservation();
        cancellation c=new cancellation(r.reservations);
        int choice;
        do {
            System.out.println("\n --- Online Reservation System ---");
            System.out.println("1. Reservation");
            System.out.println("2. Cancellation");
            System.out.println("3. Exit");
            System.out.print("Enter Your Choice: ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    r.reserveTicket();
                    break;
                case 2:
                    c.cancelTicket();
                    break;
                case 3:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid choice! \n Try again.");
            }
        }while (choice !=3);
        in.close();
    }
}

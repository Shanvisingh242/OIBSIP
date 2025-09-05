package task1;
import java.util.*;
public class cancellation
{
    private Map<Integer, String> reservations;
    public cancellation(Map<Integer, String> reservation){
        this.reservations=reservation;
    }
    public void cancelTicket(){
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the PNR to cancel: ");
        int pnr=in.nextInt();
            if (reservations.containsKey(pnr)) {
                System.out.println("Reservation Found: " + reservations.get(pnr));
                System.out.print("Do you want to cancel? (yes/no): ");
                String confirm = in.next();

                if (confirm.equalsIgnoreCase("yes")) {
                    reservations.remove(pnr);
                    System.out.println("Reservation Cancelled Successfully!");
                } else {
                    System.out.println("Cancellation Aborted.");
                }
            } else {
                System.out.println("No reservation found for given PNR!");
            }
    }
}

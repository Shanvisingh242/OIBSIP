package task1;
import java.util.*;
public class reservation
{
    static Map<Integer, String> trainD = new HashMap<>();
    public Map<Integer, String> reservations = new HashMap<>();
    private int pnrCounter = 1000;
    //Constructor to add some train's
    public reservation(){
        trainD.put(12370, "Kumbha Express");
        trainD.put(18524, "Banaras Vishakhapatnam Express");
        trainD.put(18612,"Banaras Ranchi Express");
        trainD.put(19304,"Bhopal Indore Express");
    }
    public void reserveTicket()
    {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name=in.nextLine();
        System.out.print("Enter Age : ");
        int age=in.nextInt();
        System.out.print("Enter Train Number : ");
        int trainNo = in.nextInt();
        in.nextLine();
        String trainName = trainD.get(trainNo);
        if(trainName==null){
            System.out.println("Invalid train number, Reservation Failed. ");
            return;
        }
        System.out.println("Train found: "+trainName);
        System.out.print("Enter Class Type (Sleeper,AC,General) :");
        String classType=in.nextLine();
        System.out.print("Enter Date of Journey (DD/MM/YYYY) :  ");
        String date=in.nextLine();
        System.out.print("Enter from (Place) : ");
        String from=in.nextLine();
        System.out.print("Enter Destination : ");
        String to=in.nextLine();
        int pnr= pnrCounter++;
        System.out.println("-----Reservation Successfull-----");
        System.out.println("PNR - " +pnr);
        System.out.println("Passenger Name - " +name);
        System.out.println("Age - " +age);
        System.out.println("Train number - " +trainNo);
        System.out.println("Train Name - " +trainName);
        System.out.println("Class - " +classType);
        System.out.println("Date Of Journey - " +date);
        System.out.println("From - " +from);
        System.out.println("To - " +to);
        System.out.print("------------------------------");
        String ticket = "PNR - " + pnr + "\nPassenger Name - " + name + "\nAge - " + age +
                "\nTrain Name - " + trainName + "\nClass - " + classType +
                "\n Date Of Journey - " + date + "\nFrom - " + from + "\nTo - " + to;

        reservations.put(pnr, ticket);
    }
}

package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    public static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    public static LinkedList<Suite> rooms = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        System.out.print("Enter the number of Room Details to be Entered : ");
        int count=Integer.parseInt(bufferedReader.readLine());
        Main main =new Main();
        main.insertRoomDetails(count);
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Room Details : ");
        main.displayRoomDetails();
    }
    public  void insertRoomDetails(int Count) throws IOException{
        for (int i = 0; i < Count; i++) {
            Suite room = new Suite();
            System.out.print("Room Number       : ");
            room.setRoomNumber(bufferedReader.readLine());
            System.out.print("Room Billing Type : ");
            room.setBillingType(bufferedReader.readLine());
            System.out.print("Room Price        : ");
            room.setPrice(Double.parseDouble(bufferedReader.readLine()));
            System.out.print("Suit Room Facilities : ");
            room.setFacilityDescription(bufferedReader.readLine());
            System.out.print("Suit room BreakFast included : ");
            room.setBreakFastIncluded(Boolean.parseBoolean(bufferedReader.readLine()));
            rooms.add(room);
        }
    }
    public  void displayRoomDetails(){
        Iterator it = rooms.iterator();
        while (it.hasNext()){
            Suite mt=(Suite)it.next();
            System.out.println("Room Number       : "+mt.getRoomNumber());
            System.out.println("Room billing Type : "+mt.getBillingType());
            System.out.println("Room Price        : "+mt.getPrice());
            System.out.println("Suit Room Facilities  : "+mt.getFacilityDescription());
            System.out.println("BreakFast Included    : "+(mt.isBreakFastIncluded() ? "BreakFast Included" :"BreakFast Not Included" ));
        }
    }
}

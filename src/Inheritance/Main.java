package Inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Amenity> rooms=new ArrayList<>();
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of records to be inserted : ");
        int count= scanner.nextInt();
        Main main =new Main();
        main.insertRoomDetails(count);
        main.displayRoomDetails();
    }

    public  void insertRoomDetails(int Count){
        for (int i=0;i<Count;i++){
            Amenity amenity=new Amenity();
            System.out.print("Room Number : ");
            amenity.setRoomNumber(scanner.nextLine());
            System.out.print("Room Type : ");
            amenity.setRoomType(scanner.nextLine());
            System.out.print("Room Capacity");
            amenity.setTotalCapacity(scanner.nextInt());

            System.out.print("Amenity Name : ");
            amenity.setAmenityName(scanner.nextLine());
            System.out.print("Amenity Description : ");
            amenity.setAmenityDescription(scanner.nextLine());
            System.out.print("Amenity Availability : ");
            amenity.setAvailable(scanner.nextBoolean());
            rooms.add(amenity);
        }
    }

    public void displayRoomDetails(){
        for (Amenity amenity:rooms){
            System.out.println("Room Number   : "+amenity.getRoomNumber());
            System.out.println("Room Type     : "+amenity.getRoomType());
            System.out.println("Room Capacity : "+amenity.getTotalCapacity());
            System.out.println("Amenity Name  : "+amenity.getAmenityName());
            System.out.println("Amenity Description     : "+amenity.getAmenityDescription());
            System.out.println("Amenity isAvailable : "+amenity.isAvailable());
        }
    }
}

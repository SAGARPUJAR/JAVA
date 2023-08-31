package HashMap.Hotel;

import Inheritance.Amenity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
public class Main {
    public HashMap<String, Inheritance.Amenity> rooms=new HashMap<>();
    public static InputStreamReader inputStreamReader=new InputStreamReader(System.in);
    public static BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
    public static void main(String[] args) throws IOException {
        Main main=new Main();
        int count=-1;
        do {
            try{
                System.out.print("Enter the no of records to be inserted : ");
                count=Integer.parseInt(bufferedReader.readLine());
            }catch (Exception ex){
                System.out.println(ex.fillInStackTrace()+", Invalid Details");
            }finally {
                if (count==-1){
                    System.out.println("Sorry !! you have Entered Invalid Valid input");
                }else{
                    System.out.println("Great !! you have Entered Valid input");
                }
            }
        }while (count==-1);
        main.insertRoomDetails(count);
        System.out.println("Details : ");
        main.displayRoomDetails();

        System.out.print("\n\n Search Data From List By Entering ID : ");
        String Id=bufferedReader.readLine();
        main.getRoomDetailsById(Id);
    }

    public  void insertRoomDetails(int Count) throws IOException {
        for (int i=0;i<Count;i++){
            Inheritance.Amenity amenity=new Inheritance.Amenity();
            StringBuilder builder=new StringBuilder("HRI");
            StringBuffer _amenityId=new StringBuffer("HRA");
            System.out.print("Room Number : ");
            builder.append(bufferedReader.readLine());
            amenity.setRoomNumber(builder.toString());
            System.out.print("Room Type : ");
            amenity.setRoomType(bufferedReader.readLine());
            int roomCapacity=-1;
            do {
                try{
                    System.out.print("Enter The Room Capacity               : ");
                    roomCapacity=(Integer.parseInt(bufferedReader.readLine()));
                    amenity.setTotalCapacity(roomCapacity);
                }catch (NumberFormatException ex){
                    System.out.println("Invalid Input");
                }finally {
                    if (roomCapacity!=-1){
                        System.out.println("Great !! you have Entered Valid input");
                    }else {
                        System.out.println("Sorry !! you have Entered InValid input");
                    }
                }
            }while(roomCapacity==-1);

            System.out.print("Amenity Name : ");
            amenity.setAmenityName(bufferedReader.readLine());
            System.out.print("Amenity Description : ");
            amenity.setAmenityDescription(bufferedReader.readLine());
            System.out.print("Amenity Availability : ");
            amenity.setAvailable(Boolean.parseBoolean(bufferedReader.readLine()));
            rooms.put(amenity.getRoomNumber(), amenity);
        }
    }

    public void displayRoomDetails(){
        System.out.println("\n");
        try {
            for (Inheritance.Amenity amenity : rooms.values()) {
                System.out.println("Room Number   : " + amenity.getRoomNumber());
                System.out.println("Room Type     : " + amenity.getRoomType());
                System.out.println("Room Capacity : " + amenity.getTotalCapacity());
                System.out.println("Amenity Name  : " + amenity.getAmenityName());
                System.out.println("Amenity Description     : " + amenity.getAmenityDescription());
                System.out.println("Amenity isAvailable : " + amenity.isAvailable());
            }
        }catch (Exception ex){
            System.out.println(ex.fillInStackTrace());
        }finally{
            System.out.println("Found All Details.");
        }
    }

    public void getRoomDetailsById(String roomId){
        Amenity _rooms= rooms.get(roomId);
        if (_rooms!=null)
        {
            System.out.println("Room Number   : " + _rooms.getRoomNumber());
            System.out.println("Room Type     : " + _rooms.getRoomType());
            System.out.println("Room Capacity : " + _rooms.getTotalCapacity());
            System.out.println("Amenity Name  : " + _rooms.getAmenityName());
            System.out.println("Amenity Description     : " + _rooms.getAmenityDescription());
            System.out.println("Amenity isAvailable : " + _rooms.isAvailable());
        }else{
            System.out.println("No Room Details Found, Please Enter Valid RoomId");
        }
    }
}

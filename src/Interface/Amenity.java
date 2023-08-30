package Interface;

import Interface.Room;

public class Amenity implements Room {
    String amenityName;
    String amenityDescription;
    boolean isAvailable;

    public String getAmenityName() {
        return amenityName;
    }

    public void setAmenityName(String amenityName) {
        this.amenityName = amenityName;
    }

    public String getAmenityDescription() {
        return amenityDescription;
    }

    public void setAmenityDescription(String amenityDescription) {
        this.amenityDescription = amenityDescription;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String getRoomNumber() {
        return null;
    }

    @Override
    public void setRoomNumber(String roomNumber) {

    }

    @Override
    public String getRoomType() {
        return null;
    }

    @Override
    public void setRoomType(String roomType) {

    }

    @Override
    public int getTotalCapacity() {
        return 0;
    }

    @Override
    public void setTotalCapacity(int totalCapacity) {

    }
}
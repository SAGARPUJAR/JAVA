package StringStringBuilderBuffer;

public class Amenity extends Room {
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
        return this.roomNumber;
    }

    @Override
    public void setRoomNumber(String roomNumber) {
            this.roomNumber = roomNumber;
    }

    @Override
    public String getRoomType() {
        return this.roomType;
    }

    @Override
    public void setRoomType(String roomType) {
        this.roomType=roomType;
    }

    @Override
    public int getTotalCapacity() {
        return this.totalCapacity;
    }

    @Override
    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity=totalCapacity;
    }
}
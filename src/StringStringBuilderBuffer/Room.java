package StringStringBuilderBuffer;

public abstract class Room {
    String roomNumber;
    String roomType;
    int totalCapacity;

    public abstract String getRoomNumber();

    public abstract void setRoomNumber(String roomNumber);

    public abstract String getRoomType();

    public abstract void setRoomType(String roomType);

    public abstract int getTotalCapacity();

    public abstract void setTotalCapacity(int totalCapacity);
}

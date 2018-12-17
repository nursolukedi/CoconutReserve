package assets.core;

public class HotelRoom implements SeatAndRoom{

    //IMPORTANT: If new variable is added, change Init as well
    private Hotel hotel;
    private String roomName;
    private int roomCapacity;
    private boolean isTaken;
    private int price;

    public HotelRoom(Hotel hotel, String roomName, int roomCapacity, int price)
    {
        this.hotel = hotel;
        this.roomName = roomName;
        this.roomCapacity = roomCapacity;
        this.isTaken = false;
        this.price = price;
    }

    @Override
    public int getCapacity() {
        return roomCapacity;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public boolean isTaken() {
        return isTaken;
    }

    @Override
    public void setAsTaken() {
        isTaken = true;
    }

    @Override
    public String toString(){
        return roomName;
    }

    @Override
    public String getName() {
        return roomName;
    }
}

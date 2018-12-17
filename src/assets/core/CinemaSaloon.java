package assets.core;

public class CinemaSaloon {

    private String name;
    private int capacity;
    private Film film;
    private int price; //This is here because film prices can change per cinema
    private CinemaSeat[][] seats;
    private int rowCount;
    private int columnCount;

    public CinemaSaloon(String name, Film film, int price, int rowCount, int columnCount) {
        this.name = name;
        this.film = film;
        this.price = price;
        capacity = 0;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void incrementCapacityBy(int cap)
    {
        capacity += cap;
    }


    public CinemaSeat[][] getSeats() {
        return seats;
    }
}

package assets.core;

public class Hotel implements Reservation {


    //IMPORTANT: If new variable is added, change Init as well
    private String name;
    private String description;
    private int capacity;
    private int num_of_floor;
    private double score;

    public Hotel(String name, String description, int capacity, int num_of_floor, double score)
    {
        if (name == null || description == null || capacity == 0 || num_of_floor == 0 || score == 0)
        {
            throw new NullPointerException("Parameters of hotel is empty");
        }
        else if (score > 10.0)
        {
            throw new ArithmeticException("Score can not be higher than 10");
        }

        this.name = name;
        this.description = description;
        this.capacity = capacity;
        this.num_of_floor = num_of_floor;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNum_of_floor() {
        return num_of_floor;
    }

    public double getScore() {
        return score;
    }
}

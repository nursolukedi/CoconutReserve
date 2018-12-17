package assets.core;

public class Cinema implements Reservation {

    //IMPORTANT: If new variable is added, change Init as well
    private String name;
    private String description;
    private int capacity;
    private String film;
    private int film_time_hour;
    private int film_time_minute;
    private double score;

    public Cinema(String name, String description, int capacity, String film,
                  int film_time_hour, int film_time_minute, double score)
    {
        if (name == null || description == null || capacity == 0 || film == null || score == 0 )
        {
            throw new NullPointerException("Parameters of cinema is empty");
        }
        else if (score > 10.0)
        {
            throw new ArithmeticException("Score can not be higher than 10");

        }else if (film_time_hour > 24 || film_time_minute > 60)
        {
            throw new ArithmeticException("Wrong reservation time in Cinema");
        }

        this.name = name;
        this.description = description;
        this.capacity = capacity;
        this.film = film;
        this.film_time_hour = film_time_hour;
        this.film_time_minute = film_time_minute;
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

    public String getFilm() {
        return film;
    }

    public double getScore() {
        return score;
    }

    public String getFilmTime(){
        return film_time_hour + ":" + film_time_minute;
    }
}
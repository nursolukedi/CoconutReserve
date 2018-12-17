package assets.core;

public class Cinema{

    //IMPORTANT: If new variable is added, change Init as well
    private String name;
    private String description;
    private double score;
    private int numOfSaloons;
    private CinemaSaloon[] cinemaSaloons;

    public Cinema(String name, String description, double score, int numOfSaloons)
    {
        if (name == null || description == null || score == 0 || numOfSaloons == 0 )
        {
            throw new NullPointerException("Parameters of cinema is empty");
        }
        else if (score > 10.0)
        {
            throw new ArithmeticException("Score can not be higher than 10");
        }

        this.name = name;
        this.description = description;
        this.score = score;

        cinemaSaloons = new CinemaSaloon[numOfSaloons];
        for (int i = 0; i < numOfSaloons; i++)
        {
            cinemaSaloons[i] = new CinemaSaloon("S"+i,)
        }

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getScore() {
        return score;
    }

    public int getNumOfSaloons() {
        return numOfSaloons;
    }

    public CinemaSaloon[] getCinemaSaloons() {
        return cinemaSaloons;
    }

    public String toString(){
        return name;
    }
}
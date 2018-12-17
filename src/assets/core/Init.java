package assets.core;

public class Init {

    private final int NUM_OF_CHOISES = 5; // Can be changed later


    private Reservation[] data;



    public Init(int type) {
        if (type == Constants.HOTEL)
        {
            data = new Hotel[NUM_OF_CHOISES];

            for (int i = 0; i < NUM_OF_CHOISES; i++)
            {
                String name = "Cool hotel name #"+i;
                String description = "Cool hotel description #"+i;
                int capacity = (int)(Math.random() * 50 + 1);
                int num_of_floors = (int)(Math.random() * 3 + 1);
                double score = (double) (Math.random() * 9 + 1);

                data[i] = new Hotel(name,description,capacity,num_of_floors,score);
            }
        }
        else if (type == Constants.CINEMA)
        {
            data = new Cinema[NUM_OF_CHOISES];

            for (int i = 0; i < NUM_OF_CHOISES; i++)
            {
                String name = "Cool cinema name #"+i;
                String description = "Cool cinema description #"+i;
                String film = "Cool Film #"+i;
                int capacity = (int)(Math.random() * 50 + 1);
                int film_hour = (int)(Math.random() * 23 + 1);
                int film_minute = (int)(Math.random() * 59 + 1);
                double score = (double) (Math.random() * 9 + 1);

                data[i] = new Cinema(name,description,capacity,film,film_hour,film_minute,score);
            }
        }
        else if (type == Constants.TRANSPORTION)
        {
            //Will be implemented later
        }
    }


    public Reservation[] getData(){
        return  data;
    }

}

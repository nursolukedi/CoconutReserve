import assets.core.*;

public class HotelReservationSystem {

    public static void main(String[] args) {

        Init init = new Init(Constants.HOTEL);

        Hotel[] hotels = (Hotel[]) init.getData();

        for (int i = 0; i <  Constants.NUM_OF_HOTELS; i++)
        {
            System.out.println("Hotel Name: " + hotels[i].getName());
            for (int j = 0; j < hotels[i].getNumOfRooms(); j++)
            {
                System.out.println("Hotel Room " + hotels[i].getHotelRooms()[j].getName());
                System.out.println("Hotel Room Capacity: " + hotels[i].getHotelRooms()[j].getCapacity());
            }

        }



    }
}

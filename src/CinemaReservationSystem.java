import assets.core.Cinema;
import assets.core.Init;
import assets.core.Constants;

public class CinemaReservationSystem {

    public static void main(String[] args) {

        Init init = new Init(Constants.CINEMA);

        Cinema[] cinemas = (Cinema[]) init.getData();



    }
}

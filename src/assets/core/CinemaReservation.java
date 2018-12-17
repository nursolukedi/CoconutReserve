package assets.core;

import java.util.Date;

public class CinemaReservation implements Reservation {

    private Cinema cinema;
    private Film film;
    private Date date;
    private CinemaSaloon cinemaSaloon;
    private CinemaSeat cinemaSeat;
    private String reserver_name;

    public CinemaReservation(Cinema cinema, Film film, Date date, CinemaSaloon cinemaSaloon, CinemaSeat cinemaSeat,
                             String reserver_name) {
        this.cinema = cinema;
        this.film = film;
        this.date = date;
        this.cinemaSaloon = cinemaSaloon;
        this.cinemaSeat = cinemaSeat;
        this.reserver_name = reserver_name;
    }

    @Override
    public String getReservationInfo() {
        return "Fill this I'm lazy";
    }

    @Override
    public String getReserverName() {
        return reserver_name;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public int getPrice() {
        return cinemaSeat.getPrice();
    }
}

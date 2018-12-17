package assets.core;

import java.util.Date;

public class HotelReservation implements Reservation {

    Hotel hotel;
    HotelRoom hotelRoom;
    Date date;
    String reserver_name;

    public HotelReservation(Hotel hotel, HotelRoom hotelRoom, Date date, String reserver_name){

        if (hotel == null || hotelRoom == null || date == null || reserver_name == null)
        {
            throw new NullPointerException("HotelReservation parameters are null!");
        }

        this.hotel = hotel;
        this.hotelRoom = hotelRoom;
        this.date = date;
        this.reserver_name = reserver_name;
    }


    @Override
    public String getReservationInfo() {
        return "Hotel Reservation for person: " + reserver_name +"\n for hotel: " + hotel + "\n for room: "
                + hotelRoom + "\n for time: " + date + " \n for price: " + getPrice();
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
        return hotelRoom.getPrice();
    }
}

package assets.core;

import java.util.Date;

public interface Reservation {
    String toString();
    String getReservationInfo();
    String getReserverName();
    Date getDate();
    int getPrice();
}

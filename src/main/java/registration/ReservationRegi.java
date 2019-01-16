package registration;

import model.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public class ReservationRegi {
    private List<Reservation> reservationsRecords;
    private static ReservationRegi rsvreg = null;

    private ReservationRegi(){
        reservationsRecords = new ArrayList<Reservation>();
    }

    public static ReservationRegi getInstance(){
        if ( rsvreg == null ){
            rsvreg = new ReservationRegi();
            return rsvreg;
        }
        else {
            return rsvreg;
        }
    }

    public void add (Reservation rsv){
        reservationsRecords.add(rsv);
    }

    public List<Reservation> getReservationsRecords(){
        return reservationsRecords;
    }

}

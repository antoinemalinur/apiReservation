package controller;

import model.Reservation;
import model.ReservationReply;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import registration.ReservationRegi;

import java.util.List;

@Controller
public class ReservationController {
    @RequestMapping(method = RequestMethod.GET, value="/reservation/allreservations")
    @ResponseBody
    public Reservation getAllReservation() {
        Reservation reservation = new Reservation("ref","23Mars","24Mars","11h","12h","Strasbourg", "Paris","120",true,"antoine","34","eco","Successfull");
        return reservation;
        //return ReservationRegi.getInstance().getReservationsRecords();
    }

    @RequestMapping(method = RequestMethod.POST, value="/register/reservations")
    @ResponseBody
    public ReservationReply registerReservation( @RequestBody Reservation reservation) {
        System.out.println("In registerStudent");
        ReservationReply rsvreply = new ReservationReply();
        ReservationRegi.getInstance().add(reservation);

        rsvreply.setId(reservation.getId());
        rsvreply.setReference(reservation.getReference());

        rsvreply.setDateDepart(reservation.getDateDepart());
        rsvreply.setDateArrivee(reservation.getDateArrivee());

        rsvreply.setHeureDepart(reservation.getHeureDepart());
        rsvreply.setHeureArrivee(reservation.getHeureArrivee());

        rsvreply.setLieuDepart(reservation.getLieuDepart());
        rsvreply.setLieuArrivee(reservation.getLieuArrivee());

        rsvreply.setDureeTrajet(reservation.getDureeTrajet());

        rsvreply.setPaiement(reservation.getPaiement());

        rsvreply.setNom(reservation.getNom());

        rsvreply.setPlace(reservation.getPlace());

        rsvreply.setClasse(reservation.getClasse());

        rsvreply.setRegistrationStatus("Successful");
        return rsvreply;
    }
}

package model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@Entity
public class ReservationReply {

    private @Id @GeneratedValue Long id;
    private String reference;
    private String dateDepart;
    private String dateArrivee;
    private String heureDepart;
    private String heureArrivee;
    private String lieuDepart;
    private String lieuArrivee;
    private String dureeTrajet;
    private Boolean paiement;
    private String nom;
    private String place;
    private String classe;
    private String registrationStatus;


    public ReservationReply() {}

    public ReservationReply( String reference, String dateDepart, String dateArrivee, String heureDepart, String heureArrivee, String lieuDepart, String lieuArrivee, String dureeTrajet, Boolean paiement, String nom, String place, String classe, String registrationStatus ) {
        this.reference = reference;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
        this.lieuDepart = lieuDepart;
        this.lieuArrivee = lieuArrivee;
        this.dureeTrajet = dureeTrajet;
        this.paiement = paiement;
        this.nom = nom;
        this.place = place;
        this.classe = classe;
        this.registrationStatus = registrationStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference( String reference ) {
        this.reference = reference;
    }

    public String getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart( String dateDepart ) {
        this.dateDepart = dateDepart;
    }

    public String getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee( String dateArrivee ) {
        this.dateArrivee = dateArrivee;
    }

    public String getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart( String heureDepart ) {
        this.heureDepart = heureDepart;
    }

    public String getHeureArrivee() {
        return heureArrivee;
    }

    public void setHeureArrivee( String heureArrivee ) {
        this.heureArrivee = heureArrivee;
    }

    public String getLieuDepart() {
        return lieuDepart;
    }

    public void setLieuDepart( String lieuDepart ) {
        this.lieuDepart = lieuDepart;
    }

    public String getLieuArrivee() {
        return lieuArrivee;
    }

    public void setLieuArrivee( String lieuArrivee ) {
        this.lieuArrivee = lieuArrivee;
    }

    public String getDureeTrajet() {
        return dureeTrajet;
    }

    public void setDureeTrajet( String dureeTrajet ) {
        this.dureeTrajet = dureeTrajet;
    }

    public Boolean getPaiement() {
        return paiement;
    }

    public void setPaiement( Boolean paiement ) {
        this.paiement = paiement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom( String nom ) {
        this.nom = nom;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace( String place ) {
        this.place = place;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse( String classe ) {
        this.classe = classe;
    }

    public String getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus( String registrationStatus ) {
        this.registrationStatus = registrationStatus;
    }
}

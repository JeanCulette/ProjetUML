/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.HashMap;

/**
 *
 * @author fricaudc
 */
public class Emprunt implements Serializable {
    
    private static final long serialVersionUID = -2198144180851370130L;
    
    // -----------------------------------------------
    //Attributs
    // -----------------------------------------------
    
    private Integer numLecteur;
    private Integer numExemplaire;
    private String isbnOuvrage;
    private GregorianCalendar dateEmprunt;
    private GregorianCalendar dateRetour;
    private EtatEmprunt etat; 
      
    // -----------------------------------------------
    //Constructeur
    // -----------------------------------------------
    
    public Emprunt(Integer numLecteur, Integer numExemplaire, String isbn) {
        this.numLecteur = numLecteur;
        this.numExemplaire = numExemplaire;
        this.isbnOuvrage = isbn;
        this.dateEmprunt = new GregorianCalendar();
        this.dateRetour = (GregorianCalendar) GregorianCalendar.getInstance();
        dateRetour.add((GregorianCalendar.DAY_OF_WEEK),8);
        this.etat = EtatEmprunt.en_cours;   
    }  
    
    public int getNumLecteur() {
        return numLecteur;
    }   
    
    public int getNumExemplaire() {
        return numExemplaire;
    }
    
    public String getIsbn() {
        return isbnOuvrage;
    }
    
    public GregorianCalendar getDateEmprunt() {
        return dateEmprunt;
    }
   
    public GregorianCalendar getDateRetour() {
        return dateRetour;
    }
    
    public EtatEmprunt getEtatEmprunt() {
        return etat;
    }
    
    // -----------------------------------------------
    //Méthodes
    // -----------------------------------------------    
    
    public void afficherEmprunt() {
        System.out.println("Numero de l'emprunteur : " + this.getNumLecteur());
        System.out.println("Isbn de l'ouvrage emprunté : " + this.getIsbn());
        System.out.println("Numero de l'exemplaire emprunté : " + this.getNumExemplaire());
        String dateEm = EntreesSorties.ecrireDate(this.dateEmprunt);
        System.out.println("Date d'emprunt :" + dateEm);        
        String dateR = EntreesSorties.ecrireDate(this.dateRetour);
        System.out.println("Date de retour prévue : " + dateR);
        System.out.println("Etat de l'emprunt  : " + this.getEtatEmprunt());        
        EntreesSorties.afficherMessage("");
    }
      
    public void setEtatEmprunt(EtatEmprunt etat){
        this.etat = etat;
    }
    

}

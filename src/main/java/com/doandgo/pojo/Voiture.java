package com.doandgo.pojo;

public class Voiture {

    Energie energie;

    String nom;

    boolean state;

    public Voiture(){
        //init des éléments
        this.energie = Energie.ESSENCE;
        this.nom = "K-2000";
        this.state = true;
    }
    public Voiture(Energie energie){
        //init des éléments
        this.energie = energie;
        this.nom = "K-2000";
        this.state = true;
    }
    public Voiture(Energie energie, boolean isState){
        //init des éléments
        this.energie = energie;
        this.nom = "K-2000";
        this.state = isState;
    }
    public Voiture(Energie energie,String nom, boolean state){
        //init des éléments
        this.energie = energie;
        this.nom = nom;
        this.state = state;
    }



    @Override
    public String toString(){
        return "Ma voiture est au " + energie + ", et elle s'appelle " + nom;
    }

    public Energie getEnergie() {
        return energie;
    }

    public void setEnergie(Energie energie) {
        System.out.println ("pas de changement possible ! ");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isState(){
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}

package com.doandgo.pojo;

public class Voiture {

    Energie energie;

    String nom;

    public Voiture(){
        //init des éléments
        this.energie = Energie.ESSENCE;
        this.nom = "K-2000";
    }

    @Override
    public String toString(){
        return "Ma voiture est au " + energie + ", et elle s'appelle " + nom;
    }

    public Energie getEnergie() {
        return energie;
    }

    public void setEnergie(Energie energie) {
        this.energie = energie;
        // on peut empêche le changement si besoin
        // par ex : On met juste un message -> System.out.println ("pas de changement possible ! ")
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

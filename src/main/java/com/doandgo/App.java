package com.doandgo;

import com.doandgo.customException.IllegalNumberChoice;
import com.doandgo.pojo.Energie;
import com.doandgo.pojo.Garage;
import com.doandgo.pojo.Voiture;
import com.doandgo.pojo.VoitureElectrique;
import com.sun.security.jgss.GSSUtil;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class App 
{
    static Scanner sc = new Scanner(System.in);
    public static void main( String[] args )
    {
//        Voiture maVoiture = new Voiture();
//        VoitureElectrique maVoitureElectrique = new VoitureElectrique();
//
//        List maListe = new ArrayList();
//        maListe.add(maVoitureElectrique);
//        maListe.add(maVoiture);
//
//        Garage garage = new Garage((maListe));

        //Je veux récupérer toutes les voitures electriques de mon garage
//        List<Voiture> garages = garage.getLesVoitures();

        //Programmation impérative
        // à éviter car c'est bloquant
//        for (Voiture voiture : garages){
//            if(voiture.getEnergie().equals(Energie.ELECTRIQUE)){
//                System.out.println(voiture);
//            }
//        }

        //Programmation réactive
//        System.out.println(garages
//                .stream()
//                .anyMatch(voiture -> voiture.isState())
//                );
//            System.out.println(garages
//                    .stream()
//                    .filter(voiture -> voiture.isState())
//                    .collect(Collectors.toList()));

        /////////////  LIVE 8  //////////////

        //Création d'une voiture
        System.out.println("Donner le nom de la voiture : ");
        String nom = sc.nextLine();

        //System.out.println(nom);

        String state = "";
        while(!state.equals("O") && !state.equals("N")) {
            System.out.println("Est-ce que votre voiture est allumée ? o/n");
            state = sc.nextLine().toUpperCase();
        }

        boolean stateVoiture = state.equals("O");
        //System.out.println(stateVoiture);

        System.out.println("Voici les énrergies disponibles: ");
        Energie[] values = Energie.values();
        //System.out.println(Arrays.stream(values).collect(Collectors.toList()));
//        String energiesPossible = "";
//        for (int i =0; i< values.length; i++){
//            energiesPossible += i + " - " + values[i] + "\n";
//        }
//        System.out.println(energiesPossible);
        //Avec le StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0; i< values.length; i++){
            stringBuilder.append(i).append(" - ").append(values[i]).append("\n");
        }
        System.out.println(stringBuilder);

        int nbEnergie = -1;

        try{
            nbEnergie = choiceEnergie(values);
        }catch(IllegalNumberChoice | NumberFormatException e){
            System.out.println(e.getMessage());
        }

        Energie monEnergie = null;

        try {
            monEnergie = values[nbEnergie];
        }catch (ArrayIndexOutOfBoundsException e){
            monEnergie = values[0];
        }

        System.out.println(new Voiture(monEnergie, nom, stateVoiture));

    }

    public static int choiceEnergie(Energie[] values)throws IllegalNumberChoice, NumberFormatException{
        boolean verif = false;
        int nbEnergie = -1;
        while (!verif) {
            //Gestion de l'erreur

            System.out.println("Entrez votre choix : ");
            String saisie = sc.nextLine();
            nbEnergie = Integer.parseInt(saisie);
            if (nbEnergie < 0 || nbEnergie >= values.length) {
                throw new IllegalNumberChoice();
            }
            verif = true;
        }
        return nbEnergie;
    }
}

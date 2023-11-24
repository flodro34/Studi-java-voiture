package com.doandgo;

import com.doandgo.pojo.Energie;
import com.doandgo.pojo.Garage;
import com.doandgo.pojo.Voiture;
import com.doandgo.pojo.VoitureElectrique;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App 
{
    public static void main( String[] args )
    {
        Voiture maVoiture = new Voiture();
        VoitureElectrique maVoitureElectrique = new VoitureElectrique();

        List maListe = new ArrayList();
        maListe.add(maVoitureElectrique);
        maListe.add(maVoiture);

        Garage garage = new Garage((maListe));

        //Je veux récupérer toutes les voitures electriques de mon garage
        List<Voiture> garages = garage.getLesVoitures();

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

            System.out.println(garages
                    .stream()
                    .filter(voiture -> voiture.isState())
                    .collect(Collectors.toList()));

    }
}

package com.doandgo;

import com.doandgo.pojo.Energie;
import com.doandgo.pojo.Voiture;
import com.doandgo.pojo.VoitureElectrique;

public class App 
{
    public static void main( String[] args )
    {
        Voiture maVoiture = new Voiture();
        System.out.println( maVoiture );
        maVoiture.setEnergie(Energie.GAZ);
        System.out.println(maVoiture);

        VoitureElectrique mavoitureEectrique = new VoitureElectrique();
        System.out.println(mavoitureEectrique);

    }
}

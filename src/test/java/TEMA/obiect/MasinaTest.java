package TEMA.obiect;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class MasinaTest {

    @Test

    public void metodaTest() {
        System.out.println("======MERCEDES BENZ GLA");
        List<String> dotariMercedesBenzGLA =new ArrayList<>();
        dotariMercedesBenzGLA.add("Pilot automat");
        dotariMercedesBenzGLA.add("Faruri LED");
        dotariMercedesBenzGLA.add("Senzori parcare fata");
        dotariMercedesBenzGLA.add("Senzori parcare spate");
        dotariMercedesBenzGLA.add("Camera video spate");
        dotariMercedesBenzGLA.add("Oglinzi exterioare incalzite");
        dotariMercedesBenzGLA.add("Bluetooth");
        dotariMercedesBenzGLA.add("Sistem navigatie");
        dotariMercedesBenzGLA.add("Geamuri electrice fata+spate");

        List<String> motorizareMercedesBenzGLA = new ArrayList<>();
        motorizareMercedesBenzGLA.add("Putere: 136 CP");
        motorizareMercedesBenzGLA.add("Transmisie: 4x4 (manual)");
        motorizareMercedesBenzGLA.add("Norma de poluare: Euro 6");
        motorizareMercedesBenzGLA.add("Cutie de viteze: Automata");

        List<String> caroserieMercedesBenzGLA = new ArrayList<>();
        caroserieMercedesBenzGLA.add("Numar de portiere: 5");
        caroserieMercedesBenzGLA.add("Numar de locuri: 5");
        caroserieMercedesBenzGLA.add("Tip Caroserie: SUV");
        caroserieMercedesBenzGLA.add("Culoare: Gri Metalizat");

        Masina MercedesBenzGLA =new Masina("Mercedes Benz","GLA",2015,"SUV", 16000,"Diesel",false,199075,
                "Germania",dotariMercedesBenzGLA,motorizareMercedesBenzGLA,caroserieMercedesBenzGLA,"Second Hand");
        MercedesBenzGLA.infoMasina();


        System.out.println("======RANGE ROVER EVOQUE");
        List<String> dotariRangeRoverEvoque =new ArrayList<>();
        dotariRangeRoverEvoque.add("Plafon panoramic");
        dotariRangeRoverEvoque.add("Senzor ploaie");
        dotariRangeRoverEvoque.add("Incalzire scaun sofer");
        dotariRangeRoverEvoque.add("Faruri Bi-Xenon");
        dotariRangeRoverEvoque.add("Sistem recunoastere indicatoare de viteza");
        dotariRangeRoverEvoque.add("Oglinzi exterioare cu reglare electrica");
        dotariRangeRoverEvoque.add("Bluetooth");
        dotariRangeRoverEvoque.add("Sistem navigatie");
        dotariRangeRoverEvoque.add("Avertizare sonora pre-coliziune");

        List<String> motorizareRangeRoverEvoque = new ArrayList<>();
        motorizareRangeRoverEvoque.add("Putere: 180 CP");
        motorizareRangeRoverEvoque.add("Transmisie: 4x4 ");
        motorizareRangeRoverEvoque.add("Norma de poluare: Euro 4");
        motorizareRangeRoverEvoque.add("Cutie de viteze: Manuala");

        List<String> caroserieRangeRoverEvoque = new ArrayList<>();
        caroserieRangeRoverEvoque.add("Numar de portiere: 5");
        caroserieRangeRoverEvoque.add("Numar de locuri: 5");
        caroserieRangeRoverEvoque.add("Tip Caroserie: SUV");
        caroserieRangeRoverEvoque.add("Culoare: Negru");

        Masina RangeRoverEvoque =new Masina("Land Rover","Range Rover Evoque",2017,"SUV", 19000,"Benzina",true,148000,
                "Franta",dotariRangeRoverEvoque,motorizareRangeRoverEvoque,caroserieRangeRoverEvoque,"Second Hand","Far stanga fata spart");
        RangeRoverEvoque.infoMasina();













    }
}
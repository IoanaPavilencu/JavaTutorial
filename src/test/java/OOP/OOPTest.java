package OOP;

import org.openqa.selenium.bidi.log.Log;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OOPTest {

    @Test
    public void testMethod() {
        // Dam o comanda de o masina Dacia:
        List<String> echipamenteLogan = Arrays.asList("Pachet Techno", "Pachet Clima", "Pachet Parking");
        List<String> accesoriiLogan = Arrays.asList("Covorase", "Scrumiera", "Suport de pahare");


        DaciaConfigurator Logan = new DaciaConfigurator("Dacia", "Logan", 2024, "Essential", "TCE s90", "Grey", "Standard",
                "Standard", echipamenteLogan, accesoriiLogan);
        Logan.infoDacia();

        System.out.println("-----------------------------------------------------------------------------------");

        //Tema: Mai definesc o Dacia:

        List<String> echipamenteDuster = Arrays.asList("Heated seats","Parking Pack","Techno Pack");
        List<String> accesoriiDuster = Arrays.asList("Carlig remorcare","Suport bicicleta","Suport tetiera","Suport portbagaj");

        DaciaConfigurator Duster = new DaciaConfigurator("Dacia","Duster",2023,"Prestige","HEV 140","Black","Standard",
                "Piele",echipamenteDuster,accesoriiDuster);
        Duster.infoDacia();

        System.out.println("-----------------------------------------------------------------------------------");
//
//
//        // Dam o comanda de o masina Volkswagen:
//        List<String> dotariOptionalePolo= Arrays.asList("Pachet Comfort", "Trapa de sticla panoramica","Alarma antifurt","Keyless access");
//
//        VolkswagenConfigurator Polo = new VolkswagenConfigurator("Volkswagen","Polo", 2023,"Advanced", "Polo life 1.0","Gri","Roti15","stofa",dotariOptionalePolo);
//        Polo.infoVolkswagen();
//
//        System.out.println("-----------------------------------------------------------------------------------");
//
//
//        //TEMA: Mai definesc 2 Volkwagen
//
//        List<String> dotariOptionaleTiguan = Arrays.asList("Pachet Iarna","Plasa despartitoare portbagaj","Set bare transversale");
//
//        VolkswagenConfigurator Tiguan = new VolkswagenConfigurator("Volkswagen","Tiguan",2024,"Elegance","Hybrid 1,5 TSI DSG","Red","Aliaj 20''","Piele",dotariOptionaleTiguan);
//        Tiguan.infoVolkswagen();
//        Tiguan.calculPretStandard();
//        Tiguan.calculPretFinal();
//
//        System.out.println("-----------------------------------------------------------------------------------");
//
//        List<String> dotariOptionalePassat = Arrays.asList("Pachet Comfort", "Cutie bagaje basic Volkswagen 340l, culoare negru mat");
//
//        VolkswagenConfigurator Passat = new VolkswagenConfigurator("Volkswagen","Passat",2023,"Base", " 2.0 TDI","White","Aliaj 18''","Standard",dotariOptionalePassat);
//        Passat.infoVolkswagen();
//
//        System.out.println("-----------------------------------------------------------------------------------");
//
//        List<String> echipareQ8 = Arrays.asList("Pachet sport - S line","Adaptive air suspension","Centuri de siguranta Audi Exclusive","Audi Phone Box - Wireless Charging Qi");
//
//        AudiConfigurator Q8 = new AudiConfigurator("Audi","Q8",2022,"Q8","Q8 PI 45 TDI quattro","Gold metalizat","Jante 20''",
//                "Tapiterie S line piele",echipareQ8);
//        Q8.infoAudi();
//
//        System.out.println("-----------------------------------------------------------------------------------");
//
//        List<String> echipareA4 = Arrays.asList("Pachet asistenta City","Carlig remorcare rabatabil mecanic","Faruri Matrix LED si stopuri LED","Instalatie de spalare a farurilor","Volan multifunctional plus");
//
//        AudiConfigurator A4 = new AudiConfigurator("Audi","A4",2023,
//                "Advanced","A4 Avant 30 TDI","Gri metalizat","Jante Aliaj 16''","Tapiterie Stofa",echipareA4);
//        A4.infoAudi();
    }
}

package Obiect;

import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelefonTest {

    @Test
    public void metodaTest(){
        System.out.println("===TELEFON: IPHONE15===");
        Map<String, String> specificatiiIphone15= new HashMap<>(); //am definit posibilitatea unei structuri de tipul cheie=valoare
        specificatiiIphone15.put("Model Procesor","Apple A16 Bionic");
        specificatiiIphone15.put("Sistem de Operare","iOS");
        specificatiiIphone15.put("Memorie RAM","6 GB");
        specificatiiIphone15.put("Rezolutie video", "Full HD");
        specificatiiIphone15.put("Tip display","Super Retina XDR");
        specificatiiIphone15.put("Porturi","USB Type C");

        List<String> accesoriiIphone15=new ArrayList<>();
        accesoriiIphone15.add("Telefon");
        accesoriiIphone15.add("Incarcator");
        accesoriiIphone15.add("Cablu USB");
        accesoriiIphone15.add("Casti");
        accesoriiIphone15.add("Cheita");
        accesoriiIphone15.add("Stickere");

        Telefon Iphone15 =new Telefon("Iphone","15","Albastru","128 GB", 4500, specificatiiIphone15, accesoriiIphone15, false);
        //Iphone15.infoTelefon();

        System.out.println("===TELEFON: SAMSUNG24===");
        Map<String, String> specificatiiSamsung24= new HashMap<>(); //am definit posibilitatea unei structuri de tipul cheie=valoare
        specificatiiSamsung24.put("Model Procesor","Exynos 2400");
        specificatiiSamsung24.put("Sistem de operare", "Android 14");
        specificatiiSamsung24.put("Memorie RAM","8 GB");
        specificatiiSamsung24.put("Rezolutie video", "8K");
        specificatiiSamsung24.put("Tip display","Dynamic AMOLED");
        specificatiiSamsung24.put("Porturi","USB Type C");

        List<String> accesoriiSamsung24=new ArrayList<>();
        accesoriiSamsung24.add("Telefon");
        accesoriiSamsung24.add("Incarcator");
        accesoriiSamsung24.add("Cablu USB");

        Telefon Samsung24 =new Telefon("Samsung","24","Alb","256 GB", 6600, specificatiiSamsung24,accesoriiSamsung24, false);
        //Samsung24.infoTelefon();

        System.out.println("===TELEFON: Huawei");
        Map<String ,String> specificatiiHuawei= new HashMap<>();
        specificatiiHuawei.put("Model procesor","Exynus 2400");
        specificatiiHuawei.put("Sistem de operare","Android 14");

        List<String> accesoriiHuawei= new ArrayList<>();
        accesoriiHuawei.add("Telefon");
        accesoriiHuawei.add("Incarcator");

        Telefon HuaweiPro = new Telefon("Huawei","Pro","Verde","256 GB", 7000, specificatiiHuawei, accesoriiHuawei, true, "Produs cu urme fine de utilizare");
        HuaweiPro.infoTelefon();



    }
}

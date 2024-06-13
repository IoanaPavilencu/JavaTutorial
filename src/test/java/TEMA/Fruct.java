package TEMA;

import org.testng.annotations.Test;


public class Fruct {
    //descriem fructe cu anumite proprietati
    //6-7 fructe cu metoda @test
    //ca in Masina
    //mai multe variabile

    public String denumire;
    public String culoare;
    public Double greutate;
    public Boolean areSeminte;
    public Boolean esteDulce;
    public Boolean esteAcru;
    public Float pret;

    @Test
    public void metodaTest() {
        afisareFruct();
        System.out.println("==Exemplu orice fruct");
        afisareOriceFruct("capsuna", "rosie", 15.0, true, true, false, 3f);
        afisareOriceFruct("mar", "verde", 50.0, true, false, true, 2f);
        afisareOriceFruct("caisa", "portocaliu", 20.0, false, true, false, 7f);
        afisareOriceFruct("pepene", "rosu", 7000.0, true, true, false, 35f);
        afisareOriceFruct("pomelo", "galben", 1000.0, true, false, true, 20f);
        afisareOriceFruct("kiwi", "verde", 75.0, true, false, true, 9f);

    }

    //Descriem un fruct

    public void afisareFruct() {
        denumire = "Ananas";
        culoare = "galben";
        greutate = 500.0;
        areSeminte = false;
        esteDulce = true;
        esteAcru = false;
        pret = 30.5f;
        System.out.println("Denumirea fructului este " + denumire);
        System.out.println("Culoare fructului este " + culoare);
        System.out.println("Greutatea fructului este " + greutate);
        System.out.println("Are seminte fructul ? " + areSeminte);
        System.out.println("Este dulce fructul ?" + esteDulce);
        System.out.println("Este acru fructul ?" + esteAcru);
        System.out.println("Pretul fructului este " + pret);
    }

//Descriem orice fruct

    public void afisareOriceFruct(String denumire, String culoare, Double greutate, Boolean areSeminte, Boolean esteDulce, Boolean esteAcru, Float pret) {
        System.out.println("Denumirea fructului este " + denumire);
        System.out.println("Culoare fructului este " + culoare);
        System.out.println("Greutatea fructului este " + greutate);
        System.out.println("Are seminte fructul ? " + areSeminte);
        System.out.println("Este dulce fructul ?" + esteDulce);
        System.out.println("Este acru fructul ?" + esteAcru);
        System.out.println("Pretul fructului este " + pret);
    }
}


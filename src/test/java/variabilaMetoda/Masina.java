package variabilaMetoda;

import org.testng.annotations.Test;

public class Masina {

    public String marca;
    public String model;
    public Float pret;
    public Integer an;
    public Double greutate;
    public Boolean esteDecapotabila;


    @Test
    public void metodaTest(){
        afisareMasina();
        System.out.println("===Exemplu orice masina===");
        afisareOriceMasina("Hyundai","ioniq",5000.5f, 2010, 850.5, false);
        afisareOriceMasina("Mazda","cx",15000f, 2018, 999.8, false);

    }

    //Descriem o masina

    public void afisareMasina(){
        marca="Mercedes";
        model="GLS";
        pret=2565.5f;
        an=2016;
        esteDecapotabila=true;
        greutate=54.0;
        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Pretul masinii este " + pret);
        System.out.println("Anul masinii este " + an);
        System.out.println("Greutatea masinii este " + greutate);
        System.out.println("Este masina decapotabila? " + esteDecapotabila);
    }



    //Descriem orice masina


    public void afisareOriceMasina(String marca, String model, Float pret, Integer an, Double greutate, Boolean esteDecapotabila){

        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Pretul masinii este " + pret);
        System.out.println("Anul masinii este " + an);
        System.out.println("Greutatea masinii este " + greutate);
        System.out.println("Este masina decapotabila? " + esteDecapotabila);

    }
}

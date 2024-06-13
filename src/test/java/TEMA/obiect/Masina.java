package TEMA.obiect;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;


import java.util.List;


public class Masina {

    public String marca;
    public String model;
    public Integer an;
    public String tipCaroserie;
    public Integer pret;
    public String combustibil;
    public Boolean areAvarii;
    public Integer kilometri;
    public String taraOrigine;
    public List<String> dotari;
    public List<String> motorizare;
    public List<String> detaliiCaroserie;
    public String stareAutovehicul;
    public String observatiiAvarii;

    public Masina(String marca, String model, Integer an, String tipCaroserie, Integer pret, String combustibil, Boolean areAvarii, Integer kilometri,
                  String taraOrigine, List<String> dotari, List<String> motorizare, List<String> detaliiCaroserie, String stareAutovehicul) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.tipCaroserie = tipCaroserie;
        this.pret = pret;
        this.combustibil = combustibil;
        this.areAvarii = areAvarii;
        this.kilometri = kilometri;
        this.taraOrigine = taraOrigine;
        this.dotari = dotari;
        this.motorizare = motorizare;
        this.detaliiCaroserie = detaliiCaroserie;
        this.stareAutovehicul = stareAutovehicul;
    }

    public Masina(String marca, String model, Integer an, String tipCaroserie, Integer pret, String combustibil, Boolean areAvarii, Integer kilometri,
                  String taraOrigine, List<String> dotari, List<String> motorizare, List<String> detaliiCaroserie, String stareAutovehicul, String observatiiAvarii) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.tipCaroserie = tipCaroserie;
        this.pret = pret;
        this.combustibil = combustibil;
        this.areAvarii = areAvarii;
        this.kilometri = kilometri;
        this.taraOrigine = taraOrigine;
        this.dotari = dotari;
        this.motorizare = motorizare;
        this.detaliiCaroserie = detaliiCaroserie;
        this.stareAutovehicul = stareAutovehicul;
        this.observatiiAvarii = observatiiAvarii;
    }

    public void infoMasina() {
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Anul fabricatiei masinii este: " + an);
        System.out.println("Caroseria este de tipul: " + tipCaroserie);
        System.out.println("Pretul masinii este de: " + pret + " euro.");
        System.out.println("Combustibilul masinii este: " + combustibil);
        System.out.println("Are avarii masina?" + areAvarii);
        System.out.println("Masina are " + kilometri + " km.");
        System.out.println("Tara in care este fabricata masina este: " + taraOrigine);
        System.out.println("Dotarile masinii sunt: ");
        for (Integer index = 0; index < dotari.size(); index++) {
            System.out.println(dotari.get(index));
        }
        System.out.println("Motorizarea masinii: ");
        for (Integer index = 0; index < motorizare.size(); index++) {
            System.out.println(motorizare.get(index));
        }
        System.out.println("Detalii caroserie masina: ");
        for (Integer index = 0; index < detaliiCaroserie.size(); index++) {
            System.out.println(detaliiCaroserie.get(index));
        }
        System.out.println("Starea autovehiculului este: " + stareAutovehicul);
        if (areAvarii){
            System.out.println("Masina are urmatoarele avarii: " + observatiiAvarii);
        } else {
            System.out.println("Masina nu are avarii.");
        }
    }
}
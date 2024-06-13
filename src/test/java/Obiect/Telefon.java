package Obiect;

import java.util.List;
import java.util.Map;

public class Telefon {

    public String marca;
    public String model;
    public String culoare;
    public String memorie;
    public Integer pret;
    public Map<String, String> specificatiiTehnice;
    public List<String> accesoriiIncluse;
    public Boolean produsResigilat;
    public String observatiiUzura;

    public Telefon(String marca, String model, String culoare, String memorie, Integer pret, Map<String, String> specificatiiTehnice,
                   List<String> accesoriiIncluse, Boolean produsResigilat) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.memorie = memorie;
        this.pret = pret;
        this.specificatiiTehnice = specificatiiTehnice;
        this.accesoriiIncluse = accesoriiIncluse;
        this.produsResigilat = produsResigilat;
    }

    public Telefon(String marca, String model, String culoare, String memorie, Integer pret, Map<String, String> specificatiiTehnice,
                   List<String> accesoriiIncluse, Boolean produsResigilat, String observatiiUzura) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.memorie = memorie;
        this.pret = pret;
        this.specificatiiTehnice = specificatiiTehnice;
        this.accesoriiIncluse = accesoriiIncluse;
        this.produsResigilat = produsResigilat;
        this.observatiiUzura = observatiiUzura;
    }

    public void infoTelefon() {
        System.out.println("Marca telefonului este: " + marca);
        System.out.println("Modelul telefonului este: " + model);
        System.out.println("Culoarea telefonului este: " + culoare);
        System.out.println("Memoria telefonului este: " + memorie);
        System.out.println("Pretul telefonului este " + pret + " de lei");

        System.out.println("Specificatiile telefonului sunt: ");
        for (String key : specificatiiTehnice.keySet()) {
            System.out.println(key + " " + specificatiiTehnice.get(key));
        }

        System.out.println("Accesoriile din cutie sunt: ");
        for (Integer index = 0; index < accesoriiIncluse.size(); index++) {
            System.out.println(accesoriiIncluse.get(index));
        }
        if (produsResigilat){
            System.out.println("Produsul este resigilat: " + observatiiUzura);
        } else {
            System.out.println("Produsul este nou");
        }
    }
}

package multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework3 {

    @Test

    public void carteRetete(){
        Map<String, List<String>> retete= new HashMap<>();
        List<String> supaPui= new ArrayList<>();
        supaPui.add("3 l de apa");
        supaPui.add("1 kg carne de pui");
        supaPui.add("3 morcovi");
        supaPui.add("250 g taitei");
        supaPui.add("sare");
        supaPui.add("piper");

        List<String> ciorbaLegume= new ArrayList<>();
        ciorbaLegume.add("5 l apa");
        ciorbaLegume.add("2 morcovi");
        ciorbaLegume.add("1 ceapa");
        ciorbaLegume.add("1 pastarnac");
        ciorbaLegume.add("1 telina");
        ciorbaLegume.add("1 sfecla rosie");
        ciorbaLegume.add("250 g fasole verde");
        ciorbaLegume.add("3 cartofi");
        ciorbaLegume.add("sare");
        ciorbaLegume.add("piper");

        List<String> tocanitaVita=new ArrayList<>();
        tocanitaVita.add("500 g carne de Vita");
        tocanitaVita.add("3-4 cartofi");
        tocanitaVita.add("1 morcov");
        tocanitaVita.add("1 ceapa");
        tocanitaVita.add("200 ml suc de rosii");
        tocanitaVita.add("1 l apa");
        tocanitaVita.add("sare");
        tocanitaVita.add("piper");
        tocanitaVita.add("oregano");

        List<String> risottoCiuperci= new ArrayList<>();
        risottoCiuperci.add("250 g orez");
        risottoCiuperci.add("750 ml supa pui");
        risottoCiuperci.add("50 g unt");
        risottoCiuperci.add("200 g ciuperci");
        risottoCiuperci.add("50 g parmezan");
        risottoCiuperci.add("30 ml vin alb");
        risottoCiuperci.add("sare");

        List<String> bananaBread= new ArrayList<>();
        bananaBread.add("2 oua");
        bananaBread.add("2 banane");
        bananaBread.add("100 g unt");
        bananaBread.add("20 ml lapte");
        bananaBread.add("1 lg ulei");
        bananaBread.add("150 g faina");
        bananaBread.add("1 plic praf de copt");
        bananaBread.add("50 g zahar");
        bananaBread.add("5 g sare");

        retete.put("Supa de pui", supaPui);
        retete.put("Ciorba de legume", ciorbaLegume);
        retete.put("Risotto de ciuperci", risottoCiuperci);
        retete.put("Tocanita de vita", tocanitaVita);
        retete.put("Banana Bread", bananaBread);

        for (String key: retete.keySet()){
            System.out.println("Reteta este " +key);
            System.out.println("Ingredientele sunt " +retete.get(key));
        }

    }
}

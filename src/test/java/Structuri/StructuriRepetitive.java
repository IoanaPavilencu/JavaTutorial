package Structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    // Structuri repetitive = For, While, For each

    @Test
    public void testMethod(){
       // afisareNrFor();
       // afisareNrWhile();
        afisamNrPare();
    }

    // Afisam numerele pana la 15 cu FOR
    //index++=ia valoarea initiala si adauga +1
    //index--= ia valoarea initiala si scade-1

    public void afisareNrFor(){
        for (Integer index=0; index <=15; index++){
            System.out.println(index);
        }
    }

    public void afisareNrWhile(){
        Integer index=0;
        while (index<=15){
            System.out.println(index);
            index++;
        }
    }

    // Afisam numerele pare de la 0 la 20 (cu structura alternativa si repetitiva)

    public void afisamNrPare(){
        for (Integer index=0; index<=20; index++){
            if (index %2==0){
                System.out.println("Numarul " + index + " este par");
            }
        }
    }
}

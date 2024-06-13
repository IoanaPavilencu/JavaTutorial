package Structuri;

import org.testng.annotations.Test;

public class Homework1 {

    public Integer varsta;
    public String nume;
    public String prenume;
    public String caracter;
    public String caracter1;

    @Test

    //1.Afisam mesajul "Hello World!"
    public void afisareMesaj(){
        afisareVarsta();
        afisareNumePrenume();
        caracterM();
        caracterH();
        System.out.println("Hello World!");
    }

    //2.Afisez varsta mea
    public void afisareVarsta(){
        varsta=27;
        System.out.println("Eu am " + varsta + " de ani.");

    }

    //3.Afisez numele si prenumele pe 2 randuri
    public void afisareNumePrenume(){
        nume="Pavilencu";
        prenume="Ioana";
        System.out.println("Numele meu este " + nume);
        System.out.println("Prenumele meu este " + prenume);

    }

    //4.Afisez cuvantul "Salut" urmat de litera M
    public void caracterM(){
        caracter="M";
        System.out.println("Salut" + caracter);
    }

    //5.Afisez litera H inaintea cuvantului "Hello"
    public void caracterH(){
        caracter1="H";
        System.out.println(caracter1 + "Hello");
    }

    //6.Adaug la "Ana are mere,pere,prune" dupa fiecare vocala de la finalul cuvantului caracterul "Z"
    public void vocale(){

    }
}

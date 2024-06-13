package variabilaMetoda;

import org.testng.annotations.Test;

public class Cursant {

    //asta e un comentariu
    //Recunoastem o clasa intr-un fisier Java dupa cuvantul cheie class
    //Intr-un fisier Java putem avea o multime de clase pe care le diferentiem prin numele lor
    //Nu este un practice bun in Java sa avem intr-un fisier mai multe clase
    //In fiecare clasa trebuie sa definim un nume
    //Intelegem printr-o clasa ca fiind un sablon specific din viata reala
    //Intr-o clasa putem defini variabile si metode
    //Variabila = proprietate a unei clase
    //Intr-o clasa putem avea o multime de variabile
    //Variabilele se diferentiaza prin tip si nume
    //Variabilele pot fi de 2 feluri: global si local
    //Variabila globala = proprietate vizibila oriunde in cod
    //Variabila locala = proprietate vizibila doar in locul definit
    //Tipuri de date: string (sir de caractere), integer, double/float, character, boolean(true/false)

    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areRestante;

    //Metoda = actiunea unei clase
    //Intr-o clasa putem avea o multime de metode diferentiate prin numele acestora
    //Exista 2 tipuri de metode: void si return
    //Metoda void = actiune pe care vrem sa o afisam / interpretam fara a fi nevoie sa o returnam
    //Pentru o metoda trebuie sa specificam un access control (public),() si {}

    @Test
    public void metodaTest() {
        descrieCursantul();
        primesteBursa();
  }

    public void primesteBursa() {
        Integer bursa=1000;
        System.out.println("Bursa cursantului este " + bursa);

  }
    public void descrieCursantul() {
        nume = "Pavilencu";
        prenume = "Ioana";
        varsta = 27;
        adresa = "Strada Principala, nr.77C ...";
        inaltime = 1.67;
        greutate = 80.00f;
        sex = 'F';
        areRestante = true;

        System.out.println("Numele cursantului este " + nume); //concatenam valorile
        System.out.println ("Prenumele cursantului este " + prenume);
        System.out.println("Cursantul are " + varsta + " de ani");
        System.out.println("Cursantul are adresa " + adresa);
        System.out.println("Cursantul are inaltimea " + inaltime);
        System.out.println("Cursantul are " + greutate + " de kilograme");
        System.out.println("Sexul cursantului este " + sex);
        System.out.println("Are cursantul restante? " + areRestante);

    }



}
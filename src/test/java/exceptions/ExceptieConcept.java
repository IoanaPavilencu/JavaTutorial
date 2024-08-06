package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptieConcept {

    //Exceptie = eroare care apare in momentul cand programul ruleaza
    //Exceptiile trebuiesc tratate deoarece pot contine informatii din interior ce pot sa fie exploatate
    //Doua tipuri de exceptii: checked si unchecked

    //Checked = exceptii care se trateaza in timpul compilarii
    //Checked - acest tip de exceptii mostenesc clasa Exception

    //Unchecked = exceptii care nu se trateaza in timpul compilarii
    //Unchecked - acest tip de exceptii mostenesc clasa RuntimeException

    //Exista doua keywords pentru tratarea exceptiilor: throw si throws
    // Throw = folosit sa arunce explicit o exceptie/este regasit in interiorul unei metode
    // Throws = folosit in semnatura metodei ca sa declare ca o metoda poate arunca o exceptie
    // De cele mai multe ori exceptiile se trateaza folosind o structura try...catch...finally...

    //Incercam sa citim continutul dintr-un fisier
    public void checkedExceptionExample(){
        File file = new File("C://Proba.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("A intrat pe clauza de catch! Fisierul nu exista");
        }
        finally {
            System.out.println("A intrat pe clauza de finally! Indiferent daca a mers sau nu pe catch, tot apeleaza si finally");
        }
    }

    public void uncheckedExceptionExample(){
        Integer[] multimi = new Integer[2];
        multimi[0] = 15;
        multimi[1] = 30;
        multimi[2] = 40;

        System.out.println(multimi[2]);
    }

    public void throwExceptionExample(Integer varsta){
        if (varsta<18) {
            throw new RuntimeException("Nu iti dau tigari");
        }
        else {
            System.out.println("Persoana poate primi tigari");
        }
    }

    public void throwsExceptionExample() throws FileNotFoundException {
        File file = new File("C://Proba.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
    }
}
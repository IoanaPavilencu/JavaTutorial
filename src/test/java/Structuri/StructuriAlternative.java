package Structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //Structurile sunt de 2 feluri: alternative si repetitive
    //Structurile alternative: If..Then..Else../Switch..Case
    //If-ul se bazeaza pe conditie
    //Switch-ul se bazeaza pe valoare

    @Test
    public void metodaTest() {
        //verificNrMaiMare();
        //verificNrMaiMareV2(11);
        //verificNrMaiMareV2(8);
//        verificNrPar(7);
//        verificNrPar(6);
//        verificNrPar(0);
//        verificNrPar(-1);
//        verificNrPar(-4);
        zileleSaptamanii(7);

    }

    //Verificam daca un numar este mai mare decat 10
    //Java (in practica) nu are cuvantul then, se pune doar "{" iar programul da automat cealalta "}" prin apasarea enter-ului

    public void verificNrMaiMare() {
        if (15 > 10) {
            System.out.println("Numarul 15 este mai mare decat 10");
        } else {
            System.out.println("Numarul 15 nu este mai mare decat 10");
        }
    }

    //Varianta 2--Verificam daca un numar este mai mare decat 10

    public void verificNrMaiMareV2(Integer nr) {
        if (nr > 10) {
            System.out.println("Numarul " + nr + " este mai mare decat 10");
        } else {
            System.out.println("Numarul " + nr + " nu este mai mare decat 10");
        }
    }

    // Verificam daca un numar este par si pozitiv

    public void verificNrPar(Integer nr) {
        //Daca vrem sa luam catul impartirii = /(divide)
        //Daca vrem sa luam restul impartirii = %(modulo)

        if (nr > 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul meu este pozitiv " + nr + " si par");
            } else {
                System.out.println("Numarul meu este pozitiv " + nr + " si impar");
            }
        } else if (nr < 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul meu este negativ " + nr + " si par");
            } else {
                System.out.println("Numarul meu este negativ " + nr + " si impar");
            }
        } else {
            System.out.println("Numarul este egal cu 0");
        }
    }


    //Definim zilele saptamanii cu structura Switch
    //Este mult mai structurat, usor de citit, sintaxa e mai simplificata, se foloseste cel mai bine la site-uri cu meniuri

    public void zileleSaptamanii (Integer zi){
        switch (zi){
            case 1:
                System.out.println("Astazi este Luni.");
                break;
            case 2:
                System.out.println("Astazi este Marti.");
                break;
            case 3:
                System.out.println("Astazi este Miercuri.");
                break;
            case 4:
                System.out.println("Astazi este Joi.");
                break;
            case 5:
                System.out.println("Astazi este Vineri.");
                break;
            default:
                System.out.println("S-au terminat zilele.");

        }
    }
}


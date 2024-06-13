package Obiect;

public class Sportiv {

    // Programarea orientata obiect se bazeaza pe interactiunea cu obiecte
    // Obiect= instanta unei clase
    // Putem defini un obiect doar daca avem un constructor
    // Constructorul= are ca rol sa initializeze atributele unei clase
    // Intr-o clasa recunoastem un constructor dupa numele acesteia
    // Constructorul este de cele mai multe ori public
    // Intr-o clasa pot fi mai multi constructori diferentiati dupa numarul sau tipul de parametri
    // Intr-o clasa avem un constructor by default fara parametri
    // In momentul cand se defineste un obiect se apeleaza constructorul din clasa
    // Dintr-o clasa putem defini mai multe obiecte
    // Obiectele se diferentiaza prin nume si valorile date
    // Un obiect se instanteaza folosind cuvantul "new"
    // Un obiect se poate defini in orice clasa din orice pachet
    // In momentul cand instantiem un obiect putem avea acces la toate variabilele/metodele din clasa

    public String nume;
    public String prenume;
    public Integer varsta;
    public String sex;
    public String sportPracticat;
    public Boolean sportDeEchipa;
    public Integer salar;

    // Constructor
    //se poate genera automat prin click dreapta - generate - constructor - select all

    public Sportiv(String nume, String prenume, Integer varsta, String sex,
                   String sportPracticat, Boolean sportDeEchipa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.sportPracticat = sportPracticat;
        this.sportDeEchipa = sportDeEchipa;
    }

    public Sportiv(String nume, String prenume, Integer varsta, String sex,
                   String sportPracticat, Boolean sportDeEchipa, Integer salar) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.sportPracticat = sportPracticat;
        this.sportDeEchipa = sportDeEchipa;
        this.salar = salar;
    }

    public void prezentareSportiv() {
        System.out.println("Numele sportivului este " + nume);
        System.out.println("Prenumele sportivului este " + prenume);
        System.out.println("Varsta sportivului este " + varsta);
        System.out.println("Sexul sportivului este " + sex);
        System.out.println("Sportul Practicat este " + sportPracticat);
        System.out.println("Este sport de echipa? " + sportDeEchipa);
        if (salar != null) {
        //!= inseamna diferit
            System.out.println("Salarul sportivului este " + salar);
        }

    }

    public void verificareVarsta() {
        if (varsta >= 18) {
            System.out.println("Sportivul este major.");
        }
            else{
                System.out.println("Sportivul este minor.");
            }

    }
    public void marireSalar(Integer procent){
        if (salar != null){
            Integer marire = (salar * procent)/100;
            salar=salar+marire;
            System.out.println("Noul salar este de "+salar);
        } else {
            System.out.println("Sportivul nu are salar!");
        }
    }
}


package OOP;

public class MasinaConfigurator {

    private String marca;
    private String model;
    private Integer an;


    public MasinaConfigurator(String marca, String model, Integer an) {
        this.marca = marca;
        this.model = model;
        this.an = an;

    }

    // OOP = Programare Orientata pe Obiecte;
    // OOP = 4 principii --> Mostenire, Incapsulare, Polimorfism, Abstractizare;
    // Mostenirea = conceptul prin care o clasa mosteneste o alta clasa;
    // Clasa care este mostenita = PARINTE;
    // Clasa care mosteneste = COPIL;
    // In Java putem mosteni o singura clasa;
    // Mostenirea se realizeaza cu cuvantul "extends";
    // Cand copilul mosteneste parintele, copilul trebuie sa apeleze constructorul din parinte(adica sa preia strucura parintelui);
    // Copilul va avea acces la proprietatile/metodele din clasa parinte (daca se foloseste public/protected/default);
    // Ca sa apelam constructorul din parinte in copil se foloseste keyword-ul "super";

    //Incapsulare = conceptul prin care putem sa setam anumite restrictii de vizibilitate pentru proprietati/metode;
    // POLIMORFISM = conceptul prin care o metoda poate avea implementari diferite;
    // Polimorfismul poate sa fie de 2 feluri :DINAMIC (OVERRIDE) si STATIC (OVERLOAD);
    // Polimorfism DINAMIC = Intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite;
    // Polimorfismul dinamic este prezent doar la mostenire;
    // Polimorfism STATIC = Daca avem nevoie ca o metoda sa fie folosita in diferite circumstante, putem defini mai multe metode
    //                      cu acelasi nume avand numar de parametri/tip parametri diferiti;



    public void infoMasina(){
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Anul masinii este: " + an);

    }

    // POLIMORFISM DINAMIC:

    public void pornesteMotorul(){
        System.out.println("Masina se porneste cu ajutorul cheii.");
    }
    public void deschidereGeam(){
        System.out.println("Geamurile masinii se deschid electric.");
    }

    // POLIMORFISM STATIC:
     public void promotieDacia(){
         System.out.println("Pentru luna Iulie, Dacia nu are nici o promotie.");
     }

     public void promotieDacia(String ticket){
        System.out.println("Daca ai " +ticket + " RABLA, primeste reducere!");
    }

    public void promotieDacia(Integer reducere){
        System.out.println("In luna Decembrie, Dacia primeste " + reducere);
    }





    public String getMarca() {

        return marca;
    }

    public String getModel() {

        return model;
    }

    public Integer getAn() {

        return an;
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public void setAn(Integer an) {

        this.an = an;
    }
}

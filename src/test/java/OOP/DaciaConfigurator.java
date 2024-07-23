package OOP;

import java.util.List;

public class DaciaConfigurator extends MasinaConfigurator {

    private String versiune;
    private String motor;
    private String culoare;
    private String jante;
    private String interior;
    private List<String> echipamente;
    private List<String> accesorii;
    private Double pretStandard;
    private Double pretFinal;



    public DaciaConfigurator(String marca, String model, Integer an,String versiune, String motor,
                             String culoare, String jante, String interior, List<String> echipamente, List<String> accesorii) {
        super(marca, model, an);
        this.versiune = versiune;
        this.motor =motor;
        this.culoare = culoare;
        this.jante = jante;
        this.interior = interior;
        this.echipamente = echipamente;
        this.accesorii = accesorii;
    }

    public void infoDacia(){
        infoMasina();
        System.out.println("Versiunea masinii este: " + versiune);
        System.out.println("Motorul masinii este: " + motor);
        System.out.println("Culoarea masinii este: " + culoare);
        System.out.println("Jantele masinii sunt: " + jante);
        System.out.println("Ïnteriorul masinii este: " + interior);

        System.out.println("Echipamentele masinii sunt: ");
        for (Integer i=0; i<echipamente.size(); i++){
            System.out.println(echipamente.get(i));
        }
        System.out.println("Accesoriile masinii sunt: ");
        for (Integer j=0;j<accesorii.size(); j++){
            System.out.println(accesorii.get(j));
        }
        calculPretStandard();

        calculPretFinal();

    }

    // Aplicam Polimorfismul Dinamic

    public void pornesteMotorul(){
        System.out.println("Masinile Dacia pornesc de la buton.");

    }
    public void deschidereGeam(){
        System.out.println("Geamurile masinilor se deschid de la manivela.");
    }

    // Trebuie sa determinam pretul standard in functie de modelul masinii(Dacia vs VW vs Audi)

    public void calculPretStandard(){
        if (getModel().equals("Logan")){
            if (versiune.equals("Essential")){
                pretStandard =13.500;
            }
            if (versiune.equals("Expression")){
                pretStandard=14.150;
            }
            if (versiune.equals("Journey")){
                pretStandard=15.250;
            }
            if (versiune.equals("Journey+")){
                pretStandard=15.700;
            }
        } else if (getModel().equals("Duster")) {
            switch (versiune) {
                case "Essential":
                    pretStandard = 16.000;
                    break;
                case "Comfort":
                    pretStandard = 18.000;
                    break;
                case "Prestige":
                    pretStandard = 20.000;
                    break;
                case "Prestige+":
                    pretStandard = 22.000;
                    break;
            }

        }
        //System.out.println("Pretul standard este: "+pretStandard);

        //Metoda de afisare pret cu decimale
        // \n- new line from string
        System.out.printf("Pretul standard este: %,.3f \n", pretStandard);

    }

    public void calculPretFinal() {
        double pretOptiuni = 0.000;
        if (getModel().equals("Logan")) {
                switch (culoare) {
                    case "Grey":
                        pretOptiuni += 0.460;
                        break;
                    case "White":
                        pretOptiuni += 0;       // += shortcut pt pretOptiuni = pretOptiuni+0.460
                        break;
                }
                switch (jante) {
                    case "Standard":
                        pretOptiuni += 2.000;
                        break;
                }
                switch (interior) {
                    case "Standard":
                        pretOptiuni += 0;
                        break;
                }
            } else if (getModel().equals("Duster")) {
                switch (culoare){
                    case "Grey":
                        pretOptiuni += 0.500;
                        break;
                    case "Black":
                        pretOptiuni += 5.500;
                        break;
                    case "White":
                        pretOptiuni += 0.000;
                        break;
            }
            switch (jante){
                case "Standard":
                    pretOptiuni += 0.500;
                    break;
                case "Expression":
                    pretOptiuni += 2.500;
        }
        switch (interior){
            case "Piele":
                pretOptiuni += 3.000;
                break;
            case "Textil":
                pretOptiuni +=1.000;
                break;
        }
    }

            // Calculate the cost of optional features
            for (String echipament : echipamente) {
                switch (echipament) {
                    case "Pachet Techno":
                        pretOptiuni += 1.600;
                        break;
                    case "Pachet Clima":
                        pretOptiuni += 1.200;
                        break;
                    case "Pachet Parking":
                        pretOptiuni += 1.500;
                        break;
                    case "Pachet Off-Road":
                        pretOptiuni += 1.000;
                        break;
                    case "Pachet Confort":
                        pretOptiuni += 1.000;
                        break;
                    case "Pachet Siguranta":
                        pretOptiuni += 1.000;
                        break;
                }
            }

            for (String accesoriu : accesorii) {
                switch (accesoriu) {
                    case "Covorase":
                        pretOptiuni += 0.200;
                        break;
                    case "Scrumiera":
                        pretOptiuni += 1.000;
                        break;
                    case "Suport de pahare":
                        pretOptiuni += 0.100;
                        break;
                    case "Carlig remorcare":
                        pretOptiuni += 1.200;
                        break;
                    case "Suport bicicleta":
                        pretOptiuni += 0.350;
                        break;
                    case "Suport tetiera":
                        pretOptiuni += 0;
                        break;
                    case "Suport portbagaj":
                        pretOptiuni += 0.600;
                        break;

                }
            }
        pretFinal = pretStandard + pretOptiuni;
        System.out.printf("Pretul final este: %,.3f \n", pretFinal);


}

    public String getVersiune() {
        return versiune;
    }

    public void setVersiune(String versiune) {
        this.versiune = versiune;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getJante() {
        return jante;
    }

    public void setJante(String jante) {
        this.jante = jante;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public List<String> getEchipamente() {
        return echipamente;
    }

    public void setEchipamente(List<String> echipamente) {
        this.echipamente = echipamente;
    }

    public List<String> getAccesorii() {
        return accesorii;
    }

    public void setAccesorii(List<String> accesorii) {
        this.accesorii = accesorii;
    }

    public Double getPretStandard() {
        return pretStandard;
    }

    public Double getPretFinal() {
        return pretFinal;
    }
}


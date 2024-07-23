package OOP;

import java.util.List;

public class VolkswagenConfigurator extends MasinaConfigurator{

    private String linieDeEchipare;
    private String motor;
    private String vopsea;
    private String roti;
    private String tapiterie;
    private List<String> dotariOptionale;
    private Double pretStandard;
    private Double pretFinal;


    public VolkswagenConfigurator(String marca, String model, Integer an,
                                  String linieDeEchipare, String motor, String vopsea, String roti,String tapiterie, List<String> dotariOptionale) {
        super(marca, model, an);
        this.linieDeEchipare = linieDeEchipare;
        this.motor = motor;
        this.vopsea = vopsea;
        this.roti = roti;
        this.tapiterie = tapiterie;
        this.dotariOptionale = dotariOptionale;

    }
    public void infoVolkswagen(){
        infoMasina();
        System.out.println("Linia de echipare a masinii este: " +linieDeEchipare);
        System.out.println("Motorul masinii este: " + motor);
        System.out.println("Vopseaua masinii este: " + vopsea);
        System.out.println("Rotile masinii sunt: " + roti);
        System.out.println("Tapiteria masinii este: " + tapiterie);
        System.out.println("Dotarile optionale ale masinii sunt: ");
        for (Integer t=0; t<dotariOptionale.size(); t++){
            System.out.println(dotariOptionale.get(t));
        }

    }
    //Determinam pretul standard in functie de model
    public void calculPretStandard(){
        if (getModel().equals("Tiguan")){
            if(linieDeEchipare.equals("Base")){
                pretStandard += 33.302;
            }
            if (linieDeEchipare.equals("Life")){
                pretStandard += 35.539;
            }
            if (linieDeEchipare.equals("Advanced")){
                pretStandard += 40.052;
            }
            if (linieDeEchipare.equals("Elegance")){
                pretStandard += 42.294;
            }
            if (linieDeEchipare.equals("R-Line")){
                pretStandard += 43.190;
            }

        } else if (getModel().equals("Passat")) {
            switch (linieDeEchipare){
                case "Base":
                    pretStandard += 33.562;
                    break;
                case "Business":
                    pretStandard += 33.562;
                    break;
                case "Elegance":
                    pretStandard += 33.562;
                    break;
                case "RLine":
                    pretStandard += 33.562;
                    break;
            }

        }
        System.out.printf("Pretul standard este: %,.3f \n", pretStandard);
    }
    public void calculPretFinal(){
        double pretOptiuni = 0.000;
        if (getModel().equals("Tiguan")){
            switch (vopsea){
                case "White":
                    pretOptiuni += 0;
                    break;
                case "Blue":
                    pretOptiuni += 674.73;
                    break;
                case "Gray":
                    pretOptiuni += 674.73;
                    break;
                case "Red":
                    pretOptiuni += 674.73;
            }
            switch (roti){
                case "Jante aliaj 19''":
                    pretOptiuni += 0;
                    break;
                case "Jante aliaj 20''":
                    pretOptiuni +=504.56;
                    break;
            }
            switch (tapiterie){
                case "Standard":
                    pretOptiuni += 0;
                    break;
                case "Piele":
                    pretOptiuni += 2251.48;
                    break;
            }
        } else if (getModel().equals("Passat")){
            switch (vopsea){
                case "White":
                    pretOptiuni += 0;
                    break;
                case "Blue":
                    pretOptiuni += 624.75;
                    break;
                case "Gray":
                    pretOptiuni += 624.75;
                    break;
                case "Red":
                    pretOptiuni += 624.75;
            }
            switch (roti){
                case "Jante aliaj 18''":
                    pretOptiuni += 0;
                case "Jante aliaj 19''":
                    pretOptiuni +=549.78;
            }
            switch (tapiterie){
                case "Standard":
                    pretOptiuni += 0;
                    break;
                case "Piele":
                    pretOptiuni += 2015.86;
                    break;
            }

        }
        for (String dotariOptionale : dotariOptionale){
            switch (dotariOptionale){
                case "Pachet Comfort ":
                    pretOptiuni += 1055.53;
                    break;
                case "Pachet iarna":
                    pretOptiuni += 449.82;
                    break;
                case "Trapa de sticla panoramica":
                    pretOptiuni += 1205;
                    break;
                case "Alarma antifurt":
                    pretOptiuni += 0;
                    break;
                case "Keyless access":
                    pretOptiuni += 0;
                    break;
                case "Plasa despartitoare portbagaj":
                    pretOptiuni += 0;
                    break;
                case "Set bare transversale":
                    pretOptiuni += 0.800;
                    break;
                case "Cutie bagaje basic Volkswagen 340l, culoare negru mat":
                    pretOptiuni += 2.500;
                    break;

            }
        }
        pretFinal = pretStandard + pretOptiuni;
        System.out.printf("Pretul final este: %,.3f \n", pretFinal);
    }

    public String getLinieDeEchipare() {
        return linieDeEchipare;
    }

    public void setLinieDeEchipare(String linieDeEchipare) {
        this.linieDeEchipare = linieDeEchipare;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getVopsea() {
        return vopsea;
    }

    public void setVopsea(String vopsea) {
        this.vopsea = vopsea;
    }

    public String getRoti() {
        return roti;
    }

    public void setRoti(String roti) {
        this.roti = roti;
    }

    public String getTapiterie() {
        return tapiterie;
    }

    public void setTapiterie(String tapiterie) {
        this.tapiterie = tapiterie;
    }

    public List<String> getDotariOptionale() {
        return dotariOptionale;
    }

    public void setDotariOptionale(List<String> dotariOptionale) {
        this.dotariOptionale = dotariOptionale;
    }

    public Double getPretStandard() {
        return pretStandard;
    }

    public Double getPretFinal() {
        return pretFinal;
    }
}

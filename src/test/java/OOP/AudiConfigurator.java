package OOP;

import java.util.List;

public class AudiConfigurator extends MasinaConfigurator{

    public String linieDeEchipare;
    public String motor;
    public String vopsea;
    public String jante;
    public String interior;
    public List<String> echipare;

    public AudiConfigurator(String marca, String model, Integer an,
                            String linieDeEchipare, String motor, String vopsea, String jante, String interior,
                            List<String> echipare) {
        super(marca, model, an);
        this.linieDeEchipare = linieDeEchipare;
        this.motor = motor;
        this.vopsea = vopsea;
        this.jante = jante;
        this.interior = interior;
        this.echipare = echipare;
    }

    public void infoAudi(){
        infoMasina();
        System.out.println("Linia de echipare a masinii este: " +linieDeEchipare);
        System.out.println("Motorul masinii este: " + motor);
        System.out.println("Vopseaua masinii este: " + vopsea);
        System.out.println("Jantele masinii sunt: "+ jante);
        System.out.println("Interiorul masinii este din: " + interior);
        System.out.println("Echiparea masinii contine:");
        for (Integer k=0; k<echipare.size();k++){
            System.out.println(echipare.get(k));
        }
    }
}

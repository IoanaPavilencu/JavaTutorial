package lombok;

import java.util.List;

@Getter
@AllArgsConstructor
public class Telefon {

    @Setter
    private String marca;
    @Setter
    private String model;
    @Setter
    private Integer anFabricatie;
    @Setter
    private String specificatii;
    private Double pret;
    @Setter
    private List<String> accesorii;

    public Telefon(String marca, String model, Integer anFabricatie) {
        this.marca = marca;
        this.model = model;
        this.anFabricatie = anFabricatie;
    }
}

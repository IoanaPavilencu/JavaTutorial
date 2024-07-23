package AbstractizareRestaurant;

public class RestaurantMixt extends Restaurant implements VeganInterface,NonVeganInterface{

    public RestaurantMixt(String numeRestaurant, String adresa, String meniu, Boolean delivery, String tipRestaurant) {
        super(numeRestaurant, adresa, meniu, delivery, tipRestaurant);
    }

    @Override
    public void prezentareMeniu() {

    }

    @Override
    public void gatesteNonVegan() {

    }

    @Override
    public void gatesteVegan() {

    }

}

// TEMA!!!!!
// De incercat sa reproduc o nationala de fotbal.
// Primul nivel este Persoane, mai departe mergem la fotbalist/antrenor/medic


package abstractizareInterfata;

public interface AngajatInterface extends CommonInterface{

    // Recunoastem intr-un fisier Java o interfata dupa cuvantul interface;
    // O interfata contine numai metode abstracte (metode care nu au body);
    // Toate metodele dintr-o interfata sunt By Default publice;
    // Intr-o interfata putem avea atat metode void cat si metode cu return;
    // O interfata nu poate contine un constructor;
    // Dintr-o interfata nu putem sa facem un obiect;
    // O interfata se implementeaza;
    // Clasa care implementeaza interfata trebuie sa implementeze toate metodele abstracte din interfata;
    // O clasa poate implementa mai multe interfete;
    // O interfata poate mosteni o alta interfata;


    void mergeLaServiciu();
    void desfasoaraActivitate();
    void beaCafea();
    void incheieActivitatea();





}

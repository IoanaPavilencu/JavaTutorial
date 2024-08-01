package staticKeyword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test
    public void metodaTest(){
        Elev Stefan = new Elev("Popescu","Stefan Ioan", 13);
        Stefan.prezentare();
        System.out.println("---------------------------------------------------------------");
        Elev George = new Elev("Pavilencu","George Remus", 16);
        George.prezentare();
    }
}

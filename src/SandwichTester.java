import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TestSandwichBase {

    private final Sandwich sandwich = new McBurger();

    private TestSandwichBase(){
        sandwich.createSandwich();
    }
    @Test
    void testputMeatOnBread() {
        boolean hasString = false;
        for (int i = 0; i < sandwich.output.size(); i++){
            if (sandwich.output.get(i) == "Putting meat onto bread\n"){
                hasString = true;
            }
        }
        assertTrue(hasString);
    }
    @Test
    void testputCondiments() {
        boolean hasString = false;
        for (int i = 0; i < sandwich.output.size(); i++){
            if (sandwich.output.get(i) == "Putting condiments onto bread\n"){
                hasString = true;
            }
        }
        assertTrue(hasString);
    }
}

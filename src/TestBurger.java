import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestBurger {

    private final McBurger sandwich = new McBurger();

    private TestBurger(){
        sandwich.addCondiment("Ranch");
        sandwich.addCondiment("Mustard");
        sandwich.addCondiment("Vinegar");
        sandwich.createSandwich();
    }
    @Test
    void testHasCondiments() {
        int hasString = 0;
        for (int i = 0; i < sandwich.condiments.size(); i++){
            if (sandwich.condiments.get(i) == "Ranch"){
                hasString += 1;
            }
            else if (sandwich.condiments.get(i) == "Mustard"){
                hasString += 1;
            }
            else if (sandwich.condiments.get(i) == "Vinegar"){
                hasString += 1;
            }
        }
        assertEquals(3, hasString);
    }
    @Test
    void testDisplayCondiments() {
        int hasString = 0;
        for (int i = 0; i < sandwich.output.size(); i++){
            String test = sandwich.output.get(i);
            if (test.compareTo("You chose Ranch\n") == 0 || test.compareTo("You chose Mustard\n") == 0 || test.compareTo("You chose Vinegar\n") == 0) {
                hasString += 1;
            }
        }
        assertEquals(3, hasString);
    }
}


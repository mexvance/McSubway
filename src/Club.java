public class Club extends Sandwich {
    @Override
    void chooseBread() {
        output.add("Choosing Bread: You chose Sourdough bread\n");
    }

    @Override
    void chooseMeat() {
        output.add("Choosing Meat: You chose pastrami\n");
        output.add("Choosing Meat: You chose bacon\n");
    }

    @Override
    void chooseCheese() {
        output.add("Choosing Cheese: You chose Swiss\n");
    }
}

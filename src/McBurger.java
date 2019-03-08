public class McBurger extends Sandwich {
    @Override
    void chooseBread() {
        output.add("Choose Bread: ");
        output.add("You chose poppyseed Hamburger Bun\n");
    }

    @Override
    void chooseMeat() {
        output.add("Choose Meat: ");
        output.add("You chose 1/4 pounder\n");
    }

    @Override
    void chooseCheese() {
        output.add("Choose Cheese: ");
        output.add("You chose PepperJack\n");
    }
}

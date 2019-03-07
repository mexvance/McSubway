public class McBurger extends Sandwich {
    @Override
    void chooseBread() {
        System.out.println("You chose poppyseed Hamburger Bun");
    }

    @Override
    void chooseMeat() {
        System.out.println("You chose 1/4 pounder");
    }

    @Override
    void addCondiments() {
        System.out.println("You chose Mayonaise");
        System.out.println("You chose Mustard");
        System.out.println("You chose Ketchup");
        System.out.println("You chose Lettuce");
        System.out.println("You chose Tomatoes");
        System.out.println("You chose Pickles");
    }

    @Override
    void chooseCheese() {
        System.out.println("You chose PepperJack");
    }
}

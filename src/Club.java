public class Club extends Sandwich {
    @Override
    void chooseBread() {
        System.out.println("You chose Sourdough bread");
    }

    @Override
    void chooseMeat() {
        System.out.println("You chose pastrami");

        System.out.println("You chose bacon");
    }

    @Override
    void addCondiments() {
        System.out.println("You chose Mayonaise");
        System.out.println("You chose Mustard");
        System.out.println("You chose Ketchup");
        System.out.println("You chose Lettuce");
        System.out.println("You chose Tomatoes");
        System.out.println("You chose Avocado");
    }

    @Override
    void chooseCheese() {
        System.out.println("You chose Swiss");
    }
}

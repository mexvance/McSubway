public class Sub extends Sandwich {
    @Override
    void chooseBread() {
        System.out.println("You chose Italian Herbs and Cheese bread");
    }

    @Override
    void chooseMeat() {
        System.out.println("You chose Meatballs");
    }

    @Override
    void addCondiments() {
        System.out.println("You chose Ranch");
        System.out.println("You chose Mustard");
        System.out.println("You chose Vinegar");
        System.out.println("You chose Oil");
        System.out.println("You chose Spinach");
        System.out.println("You chose Onions");
        System.out.println("You chose Jalapeno peppers");
    }

    @Override
    void chooseCheese() {
        System.out.println("You chose Mozzarella");
    }
}

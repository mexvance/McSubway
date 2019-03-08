public class Sub extends Sandwich {
    boolean canToast;
    @Override
    void chooseBread() {
        output.add("Choosing Bread: You chose Italian Herbs and Cheese bread\n");
    }

    @Override
    void chooseMeat() {
        output.add("Choosing Meat: You chose Meatballs\n");
    }

    @Override
    void chooseCheese() {
        output.add("Choosing Cheese: You chose Mozzarella\n");
    }

    @Override
    boolean toastBunOption(){
        return canToast;
    }
}

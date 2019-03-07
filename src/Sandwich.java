public abstract class Sandwich {

    final void createSandwich() {
        chooseBread();
        chooseMeat();
        addCondiments();
        chooseCheese();
        if (addHotToppings()) {
            hotTopping();
        }
        if (toastBunOption()){
            toastBun();
        }
        putMeatOnBread();
        putCondiments();
    }

    abstract void chooseBread();
    abstract void chooseMeat();
    abstract void addCondiments();

    final void putMeatOnBread(){
        System.out.println ("Putting meat onto bread");
    }

    final void putCondiments(){
        System.out.println ("Putting condiments onto bread");
    }

    void hotTopping(){

    }
    void toastBun(){

    }
    void chooseCheese(){

    }

    //generically this returns false unless we override it and tell it otherwise
    boolean addHotToppings() {
        return false;
    }
    boolean toastBunOption() {
        return false;
    }



}

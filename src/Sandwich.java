public abstract class Sandwich {

    final void Sandwich() {
        chooseBread();
        chooseMeat();
        addCondiments();
        chooseCheese();
        if (addHotToppings()) {
            hotTopping();
        }
        addMeat();
        putMeatOnBread();
        putCondiments();
    }

    abstract void chooseBread();
    abstract void chooseMeat();
    abstract void addCondiments();
    abstract void chooseCheese();

    final void addMeat(){

    }

    final void putMeatOnBread(){

    }

    final void putCondiments(){

    }

    void hotTopping(){

    }

    boolean addHotToppings() {
        return true;
    }



}

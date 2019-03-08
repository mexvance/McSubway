import java.util.ArrayList;

public abstract class Sandwich {

    ArrayList<String> output = new ArrayList<>();
    ArrayList<String> condiments = new ArrayList<>();
    public Sandwich(){}
    final void createSandwich() {
        chooseBread();
        chooseMeat();
        addCondiments();
        chooseCheese();

        if (toastBunOption()){
            toastBun();
        }
        putMeatOnBread();
        putCondiments();
        print();
    }

    abstract void chooseBread();
    abstract void chooseMeat();

    final void putMeatOnBread(){
        output.add("Putting meat onto bread\n");
    }

    final void addCondiments() {
        for (int i=0; i<condiments.size();i++) {
            output.add("Adding Condiment: ");
            output.add("You chose " + condiments.get(i) + "\n");
        }
    }

    final void putCondiments(){
        output.add("Putting condiments onto bread\n");
    }

    final void toastBun(){
        output.add("Toasting Bread\n");
    }
    void chooseCheese(){

    }

    //generically this returns false unless we override it and tell it otherwise
    boolean toastBunOption() {
        return false;
    }

    void print(){
        String myOutput = "";
        for(int i=0;i<output.size(); i++){
            myOutput += output.get(i);
        }
        System.out.print(myOutput);
    }

    final void addCondiment(String string){
        condiments.add(string);
    }


}

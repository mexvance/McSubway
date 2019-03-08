public class Driver {
    public static void main(String [] args){
        System.out.println("\n****************************************************************************");
        System.out.println("Hamburger order");
        var burger = new McBurger();
        burger.addCondiment("Mustard");
        burger.addCondiment("Ketchup");
        burger.addCondiment("Tomatoes");
        burger.addCondiment("Lettuce");
        burger.addCondiment("Pickles");
        burger.createSandwich();

        System.out.println("\n****************************************************************************");
        System.out.println("Sub order");
        var sub = new Sub();
        sub.addCondiment("Ranch");
        sub.addCondiment("Mustard");
        sub.addCondiment("Vinegar");
        sub.addCondiment("Oil");
        sub.addCondiment("Spinach");
        sub.addCondiment("Onions");
        sub.addCondiment("Jalapeno Peppers");
        sub.canToast = true;
        sub.createSandwich();

        System.out.println("\n****************************************************************************");
        System.out.println("Club Sandwich order");
        var club = new Club();
        club.addCondiment("Mayonaise");
        club.addCondiment("Mustard");
        club.addCondiment("Ketchup");
        club.addCondiment("Lettuce");
        club.addCondiment("Tomatoes");
        club.addCondiment("Avocado");
        club.createSandwich();
    }
}

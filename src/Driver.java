public class Driver {
    public static void main(String [] args){
        System.out.println("\n****************************************************************************");
        System.out.println("Hamburger order");
        var burger = new McBurger();
        burger.createSandwich();

        System.out.println("\n****************************************************************************");
        System.out.println("Sub order");
        var sub = new Sub();
        sub.createSandwich();

        System.out.println("\n****************************************************************************");
        System.out.println("Club Sandwich order");
        var club = new Club();
        club.createSandwich();
    }
}

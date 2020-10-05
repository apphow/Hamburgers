public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Ground beef", 3.50, "Wheat");

        hamburger.addHamburgerAddition1("Tomato", 0.25);
        hamburger.addHamburgerAddition2("Onion", 0.25);
        hamburger.addHamburgerAddition3("Ketchup", 0.00);
        hamburger.addHamburgerAddition4("Lettuce", 0.00);
        hamburger.addHamburgerAddition5("Cheese", 1.11);
        System.out.println("Total hamburger price is " + hamburger.itemizeHamburger());


        HealthyBurger healthyBurger = new HealthyBurger("Veggie Burger", 4.23);
        healthyBurger.addHamburgerAddition1("Eggs", 2.00);
        System.out.println("Total healthy option price: " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        System.out.println("Your Deluxe Burger costs: "+ db.itemizeHamburger());

        db.addHamburgerAddition1("tomato", 200);

    }
}

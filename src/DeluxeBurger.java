public class DeluxeBurger extends Hamburger{

    public DeluxeBurger(){
            super("Deluxe Burger", "Hamburger", 7.49, "Wheat");
            super.addHamburgerAddition1("Chips", 1.00);
            super.addHamburgerAddition2("Drink", 1.00);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional item. Meal comes with chips and drink.");;
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional item. Meal comes with chips and drink.");;
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional item. Meal comes with chips and drink.");;
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional item. Meal comes with chips and drink.");;
    }

    @Override
    public void addHamburgerAddition5(String name, double price) {
        System.out.println("Cannot add additional item. Meal comes with chips and drink.");;
    }
}
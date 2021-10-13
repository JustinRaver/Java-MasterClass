package exercises.BillsBurgers;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe Burger", "Wagu", 19.10, "Brioche");
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Sorry additional toppings cannot be added");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Sorry additional toppings cannot be added");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Sorry additional toppings cannot be added");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Sorry additional toppings cannot be added");
    }
}

package exercises.BillsBurgers;

public class Hamburger {
    private final String name;
    private final String meat;
    private final String breadRollType;
    private final double price;
    private String addition1Name, addition2Name, addition3Name, addition4Name;
    private double addition1Price, addition2Price, addition3Price, addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        addition1Name = addition2Name = addition3Name = addition4Name = "";
        addition1Price = addition2Price = addition3Price = addition4Price = 0.00;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Price = price;
        this.addition1Name = name;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Price = price;
        this.addition2Name = name;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Price = price;
        this.addition3Name = name;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Price = price;
        this.addition4Name = name;
    }

    public double itemizeHamburger() {
        return price + addition1Price + addition2Price + addition3Price + addition4Price;
    }
}

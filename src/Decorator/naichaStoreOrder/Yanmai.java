package Decorator.naichaStoreOrder;


public class Yanmai extends CondimentDecorator {
    public Yanmai(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Yanmai";
    }

    public double cost() {
        return 2 + beverage.cost();
    }
}

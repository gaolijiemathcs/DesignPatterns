package Decorator.naichaStoreOrder;

public class Hongdou extends CondimentDecorator {
    public Hongdou(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Hongdou";
    }

    public double cost() {
        return 4 + beverage.cost();
    }
}

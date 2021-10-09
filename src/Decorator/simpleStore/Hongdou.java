package Decorator.simpleStore;

public class Hongdou extends CondimentDecorator{
    Beverage beverage;
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

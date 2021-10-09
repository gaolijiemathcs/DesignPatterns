package Decorator.simpleStore;

public class Xiancao extends CondimentDecorator{
    Beverage beverage;
    public Xiancao(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Xiancao";
    }

    public double cost() {
        return 3 + beverage.cost();
    }
}

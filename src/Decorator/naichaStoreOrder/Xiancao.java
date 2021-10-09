package Decorator.naichaStoreOrder;


public class Xiancao extends CondimentDecorator {
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

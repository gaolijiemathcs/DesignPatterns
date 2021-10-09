package Decorator.naichaStoreOrder;


/**
 * 椰果本身是一个装饰者 需要扩展CondimentDecorator
 */
public class Yeguo extends CondimentDecorator {
    public Yeguo(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Yeguo";
    }

    public double cost() {
        return 2 + beverage.cost();
    }
}

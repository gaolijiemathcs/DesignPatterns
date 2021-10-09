package Decorator.simpleStore;

/**
 * 椰果本身是一个装饰者 需要扩展CondimentDecorator
 */
public class Yeguo extends CondimentDecorator {
    /**
     * Yeguo引用一个Beverage
     * （1）用实例变量记录饮料被装饰者
     * （2）将被装饰者记录到实例变量中 这里使用的是将被装饰者作为构造器的参数 再使用构造器记录在实例变量中
     */
    Beverage beverage;
    public Yeguo (Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 委托的做法将调料的内容记录到叙述当中
     */
    public String getDescription() {
        return beverage.getDescription() + ", Yeguo";
    }

    /**
     * 计算价钱并且将调味料加入到委托对象中
     * @return
     */
    public double cost() {
        return 2 + beverage.cost();
    }
}

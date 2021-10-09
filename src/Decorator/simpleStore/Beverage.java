package Decorator.simpleStore;

/**
 *  饮料抽象类
 */
public abstract class Beverage {
    String description = "Unknow Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}

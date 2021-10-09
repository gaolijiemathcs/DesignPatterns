package Decorator.simpleStore;

public class NaichaStore {
    public static void main(String[] args) {
        Beverage beverage = new YuyuanNaicha();
        System.out.println(beverage.getDescription() + " price=" + beverage.cost() + "yuan");

        Beverage beverage2 = new WulongNaicha();
        beverage2 = new Yeguo(beverage2);
        beverage2 = new Yeguo(beverage2);
        beverage2 = new Xiancao(beverage2);
        System.out.println(beverage2.getDescription() + " price=" + beverage2.cost() + "yuan");

        Beverage beverage3 = new MochaNaicha();
        beverage3 = new Hongdou(beverage3);
        beverage3 = new Xiancao(beverage3);
        beverage3 = new Yeguo(beverage3);
        System.out.println(beverage3.getDescription() + " price=" + beverage3.cost() + "yuan");

    }
}

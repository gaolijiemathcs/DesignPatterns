package Decorator.naichaStoreOrder;

/**
 *  饮料抽象类
 */
public abstract class Beverage {

    public enum Size {TALL, GRANDE, VENTI};

    public enum Sweetness {WHOLE, SEVENTY, THIRTY, TINY};

    public enum Temperature {NORMAL_ICE, REMOVE_ICE, WARM};

    Size size = Size.TALL;

    Sweetness sweetness = Sweetness.SEVENTY;

    Temperature temperature = Temperature.REMOVE_ICE;

    String description = "Unknow Beverage";

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public Temperature getTemperature() {
        return this.temperature;
    }

    public void setSweetness(Sweetness sweetness) {
        this.sweetness = sweetness;
    }

    public Sweetness getSweetness() {
        return this.sweetness;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}

package Spacecrafts;

/**
 * It's the spacecraft's base with the mains tributes and  abstract methods
 */
public abstract class BaseSpacecraft {
    /**
     * Some main attributes the spaceship might have
     */
    public String name;
    public String objective;
    public double power;
    public double weight;
    public double height;
    public double speed;
    public String fuelType;
    public double capacity;

    public abstract boolean functional();
    public abstract void flying(String shipname);
    public abstract void shipDetails(String type);

}

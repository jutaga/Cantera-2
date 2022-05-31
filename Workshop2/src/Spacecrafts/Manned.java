package Spacecrafts;

/**
 * Manned ships base, with some forced values when user creates this type.
 */
public class Manned  extends BaseSpacecraft{
    /**
     * Specifics values to this kind of ship
     * @param fuelType is the fuel the ship will use
     * @param speed is a parameter that can be chosen by the user
     * @param height is a parameter that can be chosen by the user
     * @param name is a parameter that can be chosen by the user
     */
    public Manned(String fuelType, double speed, double height,String name){
        this.name = name;
        this.objective = "satellite maintenance";
        this.fuelType = fuelType;
        this.power =129;
        this.weight =350;
        this.height = height;
        this.speed = speed;
        this.capacity = 7;
    }

    /**
     * To know if the created ship can be functional
     * @return boolean value to know if the ship can work
     */
    @Override
    public boolean functional() {
        if(height > 0 || speed > 0){
            System.out.println("THE SHIP CAN BE FUNCTIONAL");
            return true;
        }else {
            return false;
        }
    }

    /**
     * To indicate that the ship is ORBITING EARTH NOW
     * @param shipName to set the ship's name into the evento printed
     */
    @Override
    public void flying(String shipName) {
        System.out.println("THE SHIP " + shipName +" IS ORBITING EARTH");
    }

    /**
     * to show the ship details in console
     * @param type to know the ships type
     */
    @Override
    public void shipDetails(String type){
        System.out.println("YOU HAVE CREATED THIS SHIP: " + type);
        System.out.println("Ship's Name: " + this.name);
        System.out.println("Objective: " + this.objective);
        System.out.println("Fuel Type: " + this.fuelType);
        System.out.println("Power: " + this.power +"hp "+ " Weight: " + this.weight +"Kgs");
        System.out.println("Speed: " + this.speed +"Km/h "+ " capacity: " + this.capacity + "People");
    }
}

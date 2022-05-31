package Spacecrafts;

/**
 * Unmanned ships base , with some forced values when you create from this class
 */
public class Unmanned extends BaseSpacecraft{
    public Unmanned(double power, double speed, String name, double capacity){
        super();
        this.name = name;
        this.objective = "address most interesting solar system";
        this.fuelType = "monomethylhydrazin";
        this.power =power;
        this.weight =3000;
        this.height = 300;
        this.speed = speed;
        this.capacity = capacity;
    }

    /**
     * method to check if the ship is able to fly
     * @return boolean value to know if the ship can work
     */
    @Override
    public boolean functional(){
        if(power > 0 || capacity > 0){
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
        System.out.println("THE SHIP " + shipName +" IS NOW ORBITING EARTH");
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

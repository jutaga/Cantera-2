package com.company;


/**
 * Planet class based on some Attributes of a real planet
 */
public class Planet {
    private final double mass;
    private final double density;
    private final double diameter;
    private final double distanceFromSun;
    private final String planetName;
    private final int id;

    /**
     * Constructor
     * @param mass gives the value to mass
     * @param density gives the value to density
     * @param diameter gives the value to diameter
     * @param distanceFromSun gives the value to distanceFromSun
     * @param planetName gives the planets name
     * @param id gives an id to the planet
     */

    public Planet(double mass,double density,double diameter,double distanceFromSun, String planetName, int id){
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceFromSun = distanceFromSun;
        this.planetName = planetName;
        this.id = id;
    }

    /**
     * Calculates the gravitationalAttraction
     * @param mass1 planet1 mass
     * @param mass2 planet2 mass
     * @param distance distance between planets
     * @return gives the math result
     */

    public double gravitationalAttraction(double mass1, double mass2 , double distance){
        return (-(6.67/(Math.pow(10,-11)))*((mass1*mass2)) / (Math.pow(distance,2)));
    }

    /**
     * Print toString
     * @return String type to print in that way the ArrayList
     */
    @Override
    public String toString(){
        return id + " Planet: " + planetName + ", Mass: " + mass + " Kg, Diameter: " + diameter + " Km , Density: " +
                density + " g/cm3, Distance From Sun: " + distanceFromSun + " Million Km";
    }

    /**
     * Get value mass attribute
     * @return mass value
     */
    public double getMass() {
        return mass;
    }

    /**
     * Get value planetName attribute
     * @return planetName value
     */
    public String getPlanetName() {
        return planetName;
    }
}



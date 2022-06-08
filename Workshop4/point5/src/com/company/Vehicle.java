package com.company;


    /**
     * Vehicle class with some main attributes
     */
    public abstract class Vehicle {
        public Integer passengers;
        public Boolean presence;
        public Integer wheels;
        public String registration;
        public String road;
        public String fuelType;


        /**
         * Method to check if the vehicle is empty
         * @param passengers mount of people inside
         * @return boolean value false if it's empty the vehicle , true if it has any mount
         */
        public Boolean presence(Integer passengers){
            presence = passengers > 0;
            return presence;
        }

        /**
         * Print toString
         * @return String type to print in that way the Array
         */
        @Override
        public String toString(){
            return "Passengers: " + passengers + ", Wheels: " + wheels + ", Registration: " + registration
                    + " Road: " + road;
        }
    }



package Taller1;

import java.util.Objects;

/**
 * clase que hace referencia a animales
 */
public class Animals {
    public String type;
    private String breed;
    protected int age;
    private String roar;
    public String name;
    public int weight;

    //metodos

    /**
     * Metodo para ver el tipo de animal
     */
    private void animalRoar(){
        if(this.breed.equals("ronronear")){
            this.type = "gato";
        }
    }

    /**
     * Metodo  para notificar acaricia
     */
    public void touchingAnimal(){
        System.out.println("LO ACARICIASTE");
    }

    /**
     * Metodo  para notificar movimiento
     */
    protected void movement(){
        System.out.println("EL ANIMAL SE ESTA MOVIENDO");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getRoar() {
        return roar;
    }

    public void setRoar(String roar) {
        this.roar = roar;
    }
}

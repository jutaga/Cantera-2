package Taller1;

/**
 * se hace referencia al juego de pokemon donde tenemos diferentes tipos de estos , con su salud , ataque y muchos mas atributos
 */
public class Pokemon {

    protected double health;
    protected double damage;
    private String genre;
    private int level;
    public String name;
    public String type;


    //metodos


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Metodo que revisa que nuestro pokemon esté con vida
     */
    private void checkHealth(){
        if(this.health == 0){
            System.out.println("TU POKEMON SE HA DEBILITADO");
        }
    }

    /**
     * Metodo donde vemos el nivel del pokemon para evolucionar
     */
    protected void evolution(){
        if(this.level == 16){
            System.out.println("EVOLUCIONANDO...");
        }else if (this.level == 32){
            System.out.println("EVOLUCIONANDO...");
        }
    }


}

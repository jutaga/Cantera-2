package Taller1;

/**
 * Clase con referencia a una pelota
 */
public class Balls {

    private int radio;
    private String type;
    public String tradeMark;
    protected String material;
    public String color;
    public int weight;


    //metodos

    /**
     * metodo para mostrar que la pelota esta en movimiento
     */
    public void spinnig(){
        System.out.println("LA PELOTA ESTA RODANDO");
    }

    /**
     * metodo para mostrar que la pelota se patea
     */

    public void kick(){
        System.out.println("LA PELOTA SE HA PATEADO");
    }

    /**
     * metodo para saver que tipo de balon es
     */
    private void typeBall(){
        if(this.type.equals("Futboll")){
            this.tradeMark = "nike";
        } else if (this.type.equals("BASKETBALL")) {
            this.tradeMark = "Mikasa";
        }
    }

    /**
     *
     * @return retorna un valor de radio
     */
    protected int getRadio(int radio){
        return radio;
    }

}

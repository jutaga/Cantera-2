package Taller1;

/**
 * Clase hace referencia a armas de fuego
 */
public class Guns {

    public String Type;
    private int Ammo;
    protected Boolean Charger;
    public Boolean Shoot;


    //metodos

    /**
     * Metodo para saber si el arma se encuentra accionada
     */
    private void shootGun(){
        if(!this.Shoot){
            System.out.println("EL ARMA NO ESTA DISPARANDO");
            this.Shoot = false;
        }else {
            System.out.println("EL ARMA SE ESTA DISPARANDO");
            this.Shoot = true;
        }
    }

    /**
     *
     * @return retorna un true si el cargador contiene municion
     */
    private void gunAmmo(){
        if(this.Ammo > 0){
            System.out.println("EL ARMA TIENE MUNICION");
            this.Charger = true;
        }else{
            System.out.println("EL ARMA NO TIENE MUNICION");
            this.Charger = false;
        }
    }

    /**
     * Metodo que entrega un valor de municion dependiendo del tipo de arma
     */
    public void gunsType(){
        if(this.Type == "Escopeta"){
            this.Ammo = 5;
        } else if (this.Type == "Pistola") {
            this.Ammo = 8;
        }else if (this.Type == "SubFusil") {
            this.Ammo = 30;
        }
    }

    /**
     *
     * @return metodo para obtener el valor privado
     */
    public int getAmmo() {
        return Ammo;
    }

    /**
     * metodo para dar valor al atributo privado
     * @param ammo
     */
    public void setAmmo(int ammo) {
        Ammo = ammo;
    }
}

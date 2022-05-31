package Taller1;
import java.util.Date;

public class Persona {
    //variables nativas de la clase

   public String name;
   public String lastName1;
   public String lastName2;
   public Date dateBirth;
   public float height;


//metodos
    public String getName(){
        return name;
    }

    public void setName(String name){

        this.name = name;
    }
}

import java.util.*;
/**
 * Write a description of class Perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perro extends Mamifero
{
   private String amo;
   
     

    /**
     * Constructor for objects of class Perro
     */
    public Perro()
    {
      super();
    }
    
    public Perro(String nombre,Integer edad,Integer patas,String amo)
    { 
        super(nombre,edad,patas);
        this.amo=amo;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    
    
    @Override
    
     public void imprimirDatos()
    {

        super.imprimirDatos();
        System.out.println(" El perro: "+getNombre()+"tiene un amo y se llama: "+getAmo());
      
     
    }
    
    public void ladrar()
    {
       System.out.println("El perro:"+getNombre()+"ladra: Guau Guau");
    }
    
     public void cuidarAmo()
    {
       System.out.println("Soy el mejor amigo del hombre y mi funcion es cuidar a: "+getAmo());
    }
    /**Metodo de acceso a la propiedad amo*/
    public String getAmo(){
        return this.amo;
    }//end method getAmo

    /**Metodo de modificación a la propiedad amo*/
    public void setAmo(String amo){
        this.amo = amo;
    }//end method setAmo

}

/**
 * Write a description of class Mamifero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mamifero
{
  protected String nombre;
  protected Integer edad;
  protected Integer patas;
  
    
    public Mamifero()
    {
    
    }
    
    public Mamifero(String nombre,Integer edad,Integer patas)
    {
      this.nombre=nombre;
      this.edad=edad;
      this.patas=patas;
 
    }
    
    public void imprimirDatos()
    {
     System.out.println ("El nombre del mamifero es: "+getNombre() +"\n La edad del mamifero es: "+getEdad()+"\n El numero de patas es: "+getPatas());
     
    }
    
    public void mama()
    {
     System.out.println ("Los mamiferos maman");
    }
    
    
    /**Metodo de acceso a la propiedad nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**Metodo de modificación a la propiedad nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**Metodo de acceso a la propiedad edad*/
    public Integer getEdad(){
        return this.edad;
    }//end method getEdad

    /**Metodo de modificación a la propiedad edad*/
    public void setEdad(Integer edad){
        this.edad = edad;
    }//end method setEdad

    /**Metodo de acceso a la propiedad patas*/
    public Integer getPatas(){
        return this.patas;
    }//end method getPatas

    /**Metodo de modificación a la propiedad patas*/
    public void setPatas(Integer patas){
        this.patas = patas;
    }//end method setPatas

}
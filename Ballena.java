
/**
 * Write a description of class Ballena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ballena extends Mamifero
{
   private String pais;

    /**
     * Constructor for objects of class Ballena
     */
    public Ballena()
    {
        
    }

     public Ballena(String nombre,Integer edad,Integer patas,String pais)
    {
        super(nombre,edad,patas);
        this.pais=pais;
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
        System.out.println(" La ballena: "+getNombre()+"vive en : "+getPais());
      
     
    }
     
    
   
    /**Metodo de acceso a la propiedad pais*/
    public String getPais(){
        return this.pais;
    }//end method getPais

    /**Metodo de modificación a la propiedad pais*/
    public void setPais(String pais){
        this.pais = pais;
    }//end method setPais

}
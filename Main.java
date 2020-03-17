import java.util.*;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static ArrayList<Mamifero> animal=new ArrayList <Mamifero>();
    
   
    public Main()
    {
    Mamifero perro1=new Perro("Lucas",4,4,"Claudia");
    Mamifero ballena1=new Ballena("Lucia",2,0,"Brasil");
    
    animal.add(perro1);
    animal.add(ballena1);
    
    for(Mamifero m:animal){
    m.imprimirDatos();
    }
    
    //perro1.imprimirDatos();
    //ballena1.imprimirDatos();
    
    
    }

    
        
  
}
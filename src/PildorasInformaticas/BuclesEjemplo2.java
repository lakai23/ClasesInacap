
package PildorasInformaticas;
import java.util.*;
public class BuclesEjemplo2 {
    
    public static void main(String[] args) {
        
        int aleatorio=(int)Math.random()*100;
        
        Scanner entrada=new Scanner(System.in);
        
        int numero=0;
        int intentos=0;
        
        while(numero!=aleatorio){
            
            System.out.println("Introduce un numero: ");
            
            numero=entrada.nextInt();
            
            if(aleatorio<numero){
                System.out.println("mas bajo");
               
                
            }
            
            else if(aleatorio>numero){
                System.out.println("mas alto");
            }
        }
        
        System.out.println("correcto");    
        
                            
    }
    
}

package PildorasInformaticas;
import javax.swing.*;
public class BuclesEjemplo1 {
    
    public static void main(String[] args) {
        
        String clave="Francisco";
        
        String pass="";
        
        while(clave.equals(pass)==false){
            
            pass=JOptionPane.showInputDialog("introduce la contraseña");
            
            if(clave.equals(pass)==false){
                
                System.out.println("contraseña incorrecta");
                
                      
            }
            
            
        }
        
        System.out.println("contraseña correcta");
    
        
    }
}

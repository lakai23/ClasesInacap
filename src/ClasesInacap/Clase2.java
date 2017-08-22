
package ClasesInacap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Clase2 {

    
    public static void main(String[] args) throws IOException 
    {
        
        //lectura por consola
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ingrese numero 1: ");
        int numero1= Integer.parseInt(br.readLine());
        
        System.out.print("ingrese numero 2: ");
        int numero2= Integer.parseInt(br.readLine());
        int resultado=numero1+numero2;
        System.out.println("las sumas es: " +resultado);
       
    }
    
}

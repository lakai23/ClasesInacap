
package ClasesInacap;

import java.io.*;
class InvertirNumero
{

public static void main(String Arg[ ]) throws IOException 
{
    int num ,num_inv ,div_entera ,resto_div;
    
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Ingrese numero : " ) ;

    num = Integer.parseInt(in.readLine()) ;

    num_inv = 0;

    div_entera = num;

    resto_div = 0;

    while (div_entera != 0) 
    {

    resto_div = div_entera % 10;
    div_entera = div_entera / 10;
    num_inv = num_inv * 10 + resto_div;
    }
    System.out.println("El numero " + num + " invertido es " + num_inv);
}

} 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocomandos1;
import java.util.Scanner;
/**
 *
 * @author fojomars
 */
public class EjemploComandos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        float millasMarinas = 0,millas=1852,conversion=0;
        //Aplicamos una constante
        final float millas1 = 1852;
        
        System.out.println("Introduzca las millas marinas: ");
        millasMarinas = ler.nextFloat();
        conversion = millasMarinas * millas; 
        System.out.println(millasMarinas + ", millas marinas son: " + conversion + "metros");
    }
    
}

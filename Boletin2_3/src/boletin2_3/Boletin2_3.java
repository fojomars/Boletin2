/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;
import java.util.Scanner;
/**
 *
 * @author fojomars
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int cCien = 0,cVeinte = 0,cCinco = 0,cUno = 0,bCien,bVeinte,bCinco,mUno;
        
        //Pedimos la cantidad de billetes de 100 por teclado
        System.out.println("Introduzca la cantidad de billetes de 100: ");
        cCien = ler.nextInt();
        
        //Pedimos la cantidad de billetes de 20 por teclado
        System.out.println("Introduzca la cantidad de billetes de 20: ");
        cVeinte = ler.nextInt();
        
        //Pedimos la cantidad de billetes de 5 por teclado
        System.out.println("Introduzca la cantidad de billetes de 5: ");
        cCinco = ler.nextInt();
        
        //Pedimos la cantidad de monedas de 1 por teclado
        System.out.println("Introduzca la cantidad de monedas de 1: ");
        cUno = ler.nextInt();
        
        //Calculamos la cantidad e billetes y monedas
        bCien = cCien*100;
        bVeinte = cVeinte*20;
        bCinco = cCinco*5;
        mUno = cUno;
        
        //Mostramos o resultado
        System.out.println("La cantidad total es: " + (bCien+bVeinte+bCinco+mUno) + "€");
        
        
        
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_2;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.K;
/**
 *
 * @author fojomars
 */
public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        float temperatura = 0;
        System.out.println("Introduzca la temperatura: ");
        temperatura = ler.nextFloat();
        //Calculo de celsius a kelvin
        System.out.println("Son " + (temperatura + 273.15) + "K" );
        //Calculo de celsius a fahrenheit
        System.out.println((("Son " + temperatura*9 / 5) + 32) + "ºF");
        
    }
    
}

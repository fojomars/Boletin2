/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;
import java.util.Scanner;
/**
 *
 * @author fojomars
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner(System.in);
        
        //Declaramos y pedimos las variables
        double sueldo, sueldoBruto, sueldoLiquido, km, dietas, ventas;
        
        System.out.println("Introduzca su sueldo: ");
        sueldo = ler.nextDouble(); 
        System.out.println("Introduzca su quilometraje: ");
        km = ler.nextDouble();
        System.out.println("Introduzca sus dietas: ");
        dietas = ler.nextDouble();
        System.out.println("Introduzca sus importes de ventas: ");
        ventas = ler.nextDouble();
        
        //Calculamos el sueldo bruto y el sueldo líquido
        sueldoBruto =  sueldo + (km*2) + (dietas*30) + (ventas*5/100);
        sueldoLiquido = sueldoBruto - (sueldoBruto*18/100) - 36;
        
        //Mostramos por pantalla el sueldo bruto y sueldo liquido
        System.out.println("El sueldo bruto es de " + sueldoBruto + "€");
        System.out.println("El sueldo líquido es de " + sueldoLiquido + "€");
        
        
       
        
        
    }
    
}

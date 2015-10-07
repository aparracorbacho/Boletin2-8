/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg8;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Boletin28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float temperatura;
        System.out.println("Introduce la temperatura en grados centigrados");
        Scanner temperaturaTeclado = new Scanner(System.in);
        temperatura = temperaturaTeclado.nextFloat();
        System.out.println("La temperatura en grados fahrenheit es :"+((1.8*temperatura)+32));
        System.out.println("La temperatura en grados kelvin es :"+(temperatura+273));
    }
    
}

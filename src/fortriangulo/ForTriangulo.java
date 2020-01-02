/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortriangulo;

import java.util.Scanner;

/**
 *
 * @author Walter Galdamez
 */
public class ForTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 0;
        char caracterFigura ='@';
        String salto_de_linea = "\n";
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero; ");

        numero = leer.nextInt();

        for (int i = 1,k = 0; i <= numero; i++,k = 0) {
            for (int j = 1; j <= (numero-i); j++) {
                System.out.print(" ");
            }
                while (k != (2*i)-1) {
                    System.out.print(caracterFigura);
                    k++;
            }
            System.out.print(salto_de_linea);
        }
    }
    
}

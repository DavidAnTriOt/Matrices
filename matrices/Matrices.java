/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author WILDA
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nColumnas;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("escriba el numero de filas: "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("escriba el numero de columnas: "));
        
        matriz = new int[nFilas][nColumnas];
        
        System.out.println("Escriba la matriz");
        for(int i = 0; i<nFilas; i++){
            for(int j = 0; j < nColumnas; j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("\nLa matriz es: ");
        for(int i = 0; i<nFilas; i++){
            for(int j = 0; j < nColumnas; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}

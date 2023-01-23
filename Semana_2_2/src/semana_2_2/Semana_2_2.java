/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana_2_2;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Semana_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pass = 0;
        while (pass == 0){
            System.out.println("BIENVENIDO");
            System.out.println("1- Vectores");
            System.out.println("2- Matrices");
            System.out.println("3- Salir");
            System.out.print("Ingrese la opción que desea: ");
            Scanner sc = new Scanner(System.in);
            Matrices matrix = new Matrices();
            int option = sc.nextInt();
            if (option == 1){
            
            } else if (option == 2){
                int[][] matrix_uno = {{1,2,3,4},{5,6,7,8},{1,2,3,4},{5,6,7,8}};
                int[][] matrix_dos = {{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}};
                System.out.println("Matriz 1");
                matrix.printMatrix(matrix_uno);
                System.out.println("Matriz 2");
                matrix.printMatrix(matrix_dos);
                int[][] matrix_result = matrix.sumarMatrices(matrix_uno, matrix_dos);
                System.out.println("Matriz Resultante");
                matrix.printMatrix(matrix_result);
            } else if(option == 3){
                pass++;
            } else{
                System.out.println("La opción ingresada es inválida");
                pass++;
            }
        }
    }
    
}

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
public class Matrices {
    public Matrices(){
    }
    public int[][] sumarMatrices(int[][] matrix_uno, int[][] matrix_dos){
        int[][] matrix_r = new int[4][4];
        for (int i = 0; i < matrix_uno.length; i++){
            for (int j = 0; j < matrix_dos.length; j++){
                matrix_r[i][j] = matrix_uno[i][j] + matrix_dos[i][j];
            }
        }
        return matrix_r;    
    }
    public void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primos;

/**
 *
 * @author Usuario
 */
public class Funciones {
    private int tablero;

    public Funciones() {
    }

    public Funciones(int tablero) {
        this.tablero = tablero;
    }
    public boolean calculate_primes(int num){
        int aux = num - 1;
        while (aux > 1){
            if (num % aux == 0){
                return false;
            }
            else{
                aux--;
            }
        }
        return true;
    }
}

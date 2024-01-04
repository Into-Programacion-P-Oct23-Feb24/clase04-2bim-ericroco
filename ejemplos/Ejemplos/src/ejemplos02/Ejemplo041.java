/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    public static void main(String[] args) {
        // 
        int[][] matriz1 = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] matriz2 = {{1, 2, 3}, {2, 2, 2}, {3, 1, 2}};
        int[][] matrizResultado = new int[3][3];
        int primerValor = 0;
        int segundoValor = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                primerValor = matriz1[i][j];
                segundoValor = matriz2[i][j];
                matrizResultado[i][j] = multiplicarValores(primerValor, segundoValor);
            }
        }
        presentarMatriz(matriz1);
        presentarMatriz(matriz2);
        presentarMatriz(matrizResultado);
    }

    public static int multiplicarValores(int a, int b) {
        int resultadoMultiplicacion;
        resultadoMultiplicacion = a * b;
        return resultadoMultiplicacion;
    }

    public static void presentarMatriz(int matriz[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(matriz[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("\n");

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo081 {

    public static void main(String[] args) {
        // 
        String mensajeOperaciones = "";

        for (int i = 1; i <= 10; i++) {

            mensajeOperaciones = String.format("%s%s\n",
                    mensajeOperaciones,
                    obtenerSumas(10, i)); // se invoca al método obtenerSumas

            mensajeOperaciones = String.format("%s%s\n",
                    mensajeOperaciones,
                    obtenerMultiplicaciones(10, i));

        }
        System.out.printf("%s\n", mensajeOperaciones);

    }

    public static String obtenerSumas(int limite, int tabla) {
        int resultadoSuma;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            resultadoSuma = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i,
                    resultadoSuma);
        }
        return cadena;
    }

    public static String obtenerMultiplicaciones(int limite, int tabla) {
        int resultadoMultiplicacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            resultadoMultiplicacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i,
                    resultadoMultiplicacion);
        }
        return cadena;

    }

}

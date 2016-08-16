
package programacion;

import java.util.Scanner;

public class Programa01 {

    public static void main(String[] args) {
        int n = 0;
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingresar cantidad de personas");
        n = intro.nextInt();
        char matriz[][] = new char[2][n];
        llenarMatriz1(matriz);
        llenarMatriz2(matriz);
        totalHombres(matriz);
        System.out.println("El total de personas que participaron en la encuesta fueron: "+n);
        
    }
    public static char[][] llenarMatriz1(char matriz[][]) {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j <matriz.length; j++) {
                char x = (char)(Math.random()*(78 - 72)+72);
                if (x == 'H' || x == 'M') { 
                    matriz[1][j] = x;
                }else {
                    j--;
                } 
            }
        }
        return matriz;
    }
    public static char[][] llenarMatriz2(char matriz[][]) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <matriz.length; j++) {
                char x = (char)(Math.random()*(78 - 72)+72);
                if (x == 's' || x == 'n' || x == 'x') { 
                    matriz[1][j] = x;
                }else {
                    j--;
                } 
            }
        }
        return matriz;
    }
    public static void totalHombres(char matriz[][]) {
        
    }
}

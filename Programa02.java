
package programacion;

public class Programa02 {
    private static int Matriz[][] = new int[3][3];
    private static boolean correcto;
    private static boolean cMagico; 
            
    public static void main(String[] args) {
        Matriz();
        
    }
    public static void Matriz() {
        int cuadrado = 1;
        int x = 1;
        int y = 1;
        do{
            cMagico = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Matriz[i][j]=0;
                }
              
            }
            for (int i = 0; i <= 9; i++) {
                do{
                    correcto = false;
                    x = (int)(Math.random()*3);
                    y = (int)(Math.random()*3);
                    if(Matriz[x][y] == 0){
                        correcto = true;
                        Matriz[x][y] = i;
                    }
                }while(!correcto);
            }
            cuadrado = Matriz[0][0] + Matriz[0][1] + Matriz[0][2];
            if (cuadrado != Matriz[1][0] + Matriz[1][1] + Matriz[1][2]){
                cMagico = false;
            }else if (cuadrado != Matriz[2][0] + Matriz[2][1] + Matriz[2][2]){
                cMagico = false;
            }else if (cuadrado != Matriz[0][0] + Matriz[1][0] + Matriz[2][0]){
                cMagico = false;
            }else if (cuadrado != Matriz[0][1] + Matriz[1][1] + Matriz[2][1]) {
                cMagico = false;
            }else if (cuadrado != Matriz[0][2] + Matriz[1][2] + Matriz[2][2]) {
                cMagico = false;
            }else if (cuadrado != Matriz[0][0] + Matriz[1][1] + Matriz[2][2]) {
                cMagico = false;
            }else if (cuadrado != Matriz[0][2] + Matriz[1][1] + Matriz[2][0]) {
                cMagico = false;
            }else {
                cMagico = true;
            }
        }while (!cMagico);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(Matriz[i][j]);
            }
            System.out.println();
        }
        
    }
    
}

package programacion;

import java.util.Scanner;

public class UsoString {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingresar un String");
        String str = leerString();
        System.out.println("1. largo Cadena\n"
                + "2. contar Vocales\n"
                + "3. contar Consonantes\n"
                + "4. invertir String\n"
                + "5. existe Char\n"
                + "6. existe SubString\n"
                + "7. crear ArrayChar\n"
                + "8. Salir");
        int op = intro.nextInt();
        do {
            switch (op) {
                case 1:
                    largoCadena(str);
                    break;
                case 2:
                    contarVocales(str);
                    break;
                case 3:
                    contarConsonantes(str);
                    break;
                case 4:
                    invertirString(str);
                    break;
                case 5:
                    System.out.println("Ingrese un char");
                    char ch = leerString().charAt(0);
                    if (existeChar(str, ch) >= 0) {
                        System.out.println("La letra existe en el lugar " + (existeChar(str, ch) + 1));
                    } else {
                        System.out.println("La letra no existe");
                    }
                    break;
                case 6:
                    System.out.println("La subcadena del inicio es " + existeSubString(str, 0, 2));
                    break;
                case 7:
                    crearArrayChar(str);
                    System.out.println("Fue creada con exito");
                    break;
                case 8:
                    System.out.println("Adios");
                    break;

            }
        } while (op != 8);
    }

    public static String leerString() {
        Scanner intro = new Scanner(System.in);
        String leer = intro.nextLine();
        return leer;
    }

    public static int largoCadena(String str) {
        return str.length();
    }

    public static int contarVocales(String str) {
        int contV = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u')) {
                contV = contV + 1;
            }
        }
        return contV;
    }

    public static int contarConsonantes(String str) {
        int contC = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) != 'a') || (str.charAt(i) != 'e') || (str.charAt(i) != 'i') || (str.charAt(i) != 'o') || (str.charAt(i) != 'u')) {
                contC = contC + 1;
            }
        }
        return contC;
    }

    public static String invertirString(String str) {
        String invertido = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            invertido = invertido + str.charAt(i);
        }
        return invertido;
    }

    public static int existeChar(String str, char ch) {
        return str.indexOf(ch);
    }

    public static String existeSubString(String str, int init, int end) {
        return str.substring(init, end);
    }

    public static char[] crearArrayChar(String str) {
        char ArregloChar[] = new char[str.length()];
        ArregloChar = str.toCharArray();
        return ArregloChar;
    }
}

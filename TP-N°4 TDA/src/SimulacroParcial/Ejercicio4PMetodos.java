package SimulacroParcial;

import java.util.Scanner;

public class Ejercicio4PMetodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena, palabra;
        int longC, i, pos;
        boolean valorCadena;
        palabra = "";
        i = 0;
        valorCadena = false;
        pos = 0;
        System.out.println("Ingrese cadena de texto");
        cadena = sc.nextLine();
        longC = cadena.length();
        while (!valorCadena && i < longC) {
            //hola mundo
            pos = cadena.indexOf(" ",pos);
            if (pos == -1) {
                valorCadena=true;
            }
            pos++;    
        }
    }
}

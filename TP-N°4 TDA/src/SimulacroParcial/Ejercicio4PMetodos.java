package SimulacroParcial;

import java.util.Scanner;

public class Ejercicio4PMetodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena, palabra, auxPalabra, frase;
        int longC, i, j, pos;

        palabra = "";
        auxPalabra = "";
        frase = "";
        i = 0;
        j = 0;
        pos = 0;

        System.out.println("Ingrese cadena de texto");
        cadena = sc.nextLine();

        cadena.trim();// NO FUNCIONA EL TRIM
        System.out.println(cadena);
        cadena = cadena + ' ';
        longC = cadena.length();

        while (i < longC) {
            pos = cadena.indexOf(" ", pos);// retora la posicion de la primera ocurrencia de otro string
            
            if (pos == -1) {//si la palabra es una sola
                i = longC;
            } else {
                palabra = cadena.substring(i, pos);// retorna una palabra sin espacios
                if (palabra.length() > 5) {
                    while (j < 5) {//concatenamiento de la palabra mientras la longitud sea menor a 5 
                        auxPalabra = auxPalabra + palabra.charAt(j);
                        j++;
                    }
                    j = 0;//reiniciamos j para volver a concatenar a la siguiente vuelta
                    auxPalabra = auxPalabra + '.';

                } else {
                    auxPalabra = palabra;
                }
                i = pos;
                pos = pos + 1;
            }
            frase = frase + auxPalabra + ' ';
            auxPalabra = "";
            i++;
        }
        System.out.println(frase);

    }
}

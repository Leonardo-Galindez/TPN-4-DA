package SimulacroParcial;

import java.util.Scanner;



public class Ejercicio4P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena, palabra, frase;
        int longC, longP, pos;
        boolean valorCadena;
        valorCadena = false;
        frase = "";
        palabra = "";
        pos = 0;
        System.out.println("Ingrese cadena de texto");
        cadena = sc.nextLine();
        longC = cadena.length();
        // hola mundo
        cadena.trim();
        for (int i = 0; i < longC; i++) {
            while (!valorCadena && i < longC) {
                
                longP = palabra.length();
                pos = cadena.indexOf(" ");
                if (cadena.charAt(i) != ' ' && longP < 5) {
                    palabra = palabra + cadena.charAt(i);
                } else {
                    if (longP >= 5 && pos != -1) {
                        i = pos;
                    }
                    palabra = palabra + '.';
                    valorCadena = true;
                }
                i++;
            }
            
            valorCadena = false;
            frase = frase + palabra + ' ';
            palabra = "";
            if(pos==-1){
                i=longC;
            }
            
        }
        System.out.println(frase);
    }
   
    
}

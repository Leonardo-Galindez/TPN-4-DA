package SimulacroParcial;
import java.util.Scanner;

public class Ejercicio3P {
    public static void main(String[] args) {

        int cantF, cantC;
        Scanner sc = new Scanner(System.in);

        //Solicitando orden de la matriz
        System.out.println("Ingrese cantidad de filas");
        cantF = sc.nextInt();
        System.out.println("Ingrese cantidad de columnas");
        cantC = sc.nextInt();

        //Declaracion de arreglos
        int[][] Matriz = new int[cantF][cantC];
        int [] Sumas = new int [cantF]; 

        //llamadasd a los modulos
        CargarMatriz(Matriz);
        MostrarMatriz(Matriz);
        Sumas=ArrelgoSuma(Matriz, cantF);
        MostrarArreglo(Sumas);
    }

    //Cargar la matriz con numeros reales
    public static void CargarMatriz(int[][] Matriz) {
        int num;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < Matriz.length; i++) {
            System.out.println("Ingrese numero fila:" + i);
            for (int j = 0; j < Matriz[0].length; j++) {
                num = sc.nextInt();
                Matriz[i][j] = num;
            }
        }
    }

    //Mostrar la matriz con sus elementos
    public static void MostrarMatriz(int[][] Matriz) {

        System.out.println();
        for (int i = 0; i < Matriz.length; i++) {

            for (int j = 0; j < Matriz[0].length; j++) {

                System.out.print(Matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    //Modulo que la suma de cada fila de la matriz se guarda en el arreglo
    public static int[] ArrelgoSuma(int[][] Matriz, int cantF) {
        int sumaF;
        sumaF = 0;

        int[] Sumas = new int[cantF];

        for (int i = 0; i < Matriz.length; i++) {

            for (int j = 0; j < Matriz[0].length; j++) {
                sumaF = sumaF + Matriz[i][j];
            }
            Sumas[i] = sumaF;
            sumaF=0;
        }

        return Sumas;
    }

    //Mostrar el arreglo que retorno el modulo ArregloSuma
    public static void MostrarArreglo(int[] Arreglo) {

        System.out.println();
        for (int i = 0; i < Arreglo.length; i++) {
            System.out.print(Arreglo[i]+" ");
        }
    }
}

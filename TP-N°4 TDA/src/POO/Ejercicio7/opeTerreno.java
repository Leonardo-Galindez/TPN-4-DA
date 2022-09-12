package POO.Ejercicio7;

import POO.Ejercicio1.Terreno;
import java.util.Scanner;

public class opeTerreno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo, manzana, rta, BuscaCodigo;
        double base, altura;
        boolean valorMenu, valorClave;
        valorMenu = false;
        valorClave = false;

        Terreno mistTerrenoS[] = new Terreno[4];

        for (int i = 0; i < mistTerrenoS.length; i++) {

            /*
             * if(i>0){
             * do{
             * System.out.println("Ingrese codigo");
             * codigo=sc.nextInt();
             * 
             * 
             * }while();
             * }else{
             * System.out.println("Ingrese codigo");
             * codigo=sc.nextInt();
             * }
             */

            System.out.println("Ingrese codigo");
            codigo = sc.nextInt();
            System.out.println("Ingrese base");
            base = sc.nextInt();
            System.out.println("Ingrese altura");
            altura = sc.nextInt();
            System.out.println("Ingrese manzana");
            manzana = sc.nextInt();
            mistTerrenoS[i] = new Terreno(codigo, base, altura, manzana);
            

        }

        
        do {
            rta = Menu();
            switch (rta) {
                case 1:
                    break;
                case 2:
                    System.out.println("ingrese codigo de terreno");
                    BuscaCodigo = sc.nextInt();
                    for (int i = 0; i < mistTerrenoS.length; i++) {
                        if (BuscaCodigo == mistTerrenoS[i].getCodigo()) {
                            System.out.println();
                            System.out.println(mistTerrenoS[i]);
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    valorMenu = true;
                    break;

            }
        } while (!valorMenu);

    }

    public static int Menu() {
        Scanner sc = new Scanner(System.in);
        int rta;
        System.out.println("Encontrar el terreno más grande---------------------------------1");
        System.out.println("Dado un código de terreno mostrar sus dimensiones---------------2");
        System.out.println("Dada una manzana mostrar los datos de cada uno de los terrenos--3");
        System.out.println("Mostrar el precio de cada uno de los terrenos-------------------4");
        System.out.println("Finalizar-------------------------------------------------------0");
        rta = sc.nextInt();
        return rta;
    }

}

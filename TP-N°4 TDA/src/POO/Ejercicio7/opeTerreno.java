package POO.Ejercicio7;

import POO.Ejercicio1.Terreno;

import java.util.Scanner;

public class opeTerreno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo, manzana, rta, BuscaCodigo, posMayor, BuscaManzana;
        double base, altura, perimetro, mayorTerreno, precioM2, precioTerreno;
        boolean valorMenu, valorClave;
        mayorTerreno = 0;
        posMayor = 0;
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
                    for (int i = 0; i < mistTerrenoS.length; i++) {
                        perimetro = mistTerrenoS[i].perimetro(mistTerrenoS[i].getBase(), mistTerrenoS[i].getAltura());
                        if (mayorTerreno < perimetro) {
                            mayorTerreno = perimetro;
                            posMayor = i;
                        }
                    }
                    System.out.println("El mayor terreno es:\n" + mistTerrenoS[posMayor]);
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
                    System.out.println("ingrese Manzana de terreno");
                    BuscaManzana = sc.nextInt();
                    for (int i = 0; i < mistTerrenoS.length; i++) {
                        if (BuscaManzana == mistTerrenoS[i].getManzana()) {
                            System.out.println();
                            System.out.println(mistTerrenoS[i]);
                            System.out.println();
                        }
                    }
                    break;
                case 4:
                    System.out.println("ingrese precio metro cuadrado del terreno");
                    precioM2 = sc.nextInt();
                    for (int i = 0; i < mistTerrenoS.length; i++) {
                        precioTerreno = precioM2
                                * mistTerrenoS[i].superficie(mistTerrenoS[i].getBase(), mistTerrenoS[i].getAltura());
                        System.out
                                .println("Precio del Terreno:" + mistTerrenoS[i].getCodigo() + " es $" + precioTerreno);
                    }
                    break;
                case 0:
                    valorMenu = true;
                    break;
                default:
                    System.out.println("ERROR");
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

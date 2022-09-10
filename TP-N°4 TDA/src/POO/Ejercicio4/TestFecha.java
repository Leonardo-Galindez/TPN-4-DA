package POO.Ejercicio4;

import java.util.Scanner;

public class TestFecha {
    public static void main(String[] args) {

        boolean valorFecha,valorBisiesto;
        int dias;
        valorFecha=false;

        Scanner sc= new Scanner(System.in);

        Fecha miFecha = new Fecha();

        do{
            valorFecha=CargaFecha();

        }while(!valorFecha);

        miFecha.Fecha(miFecha.getDia(), miFecha.getMes(), miFecha.getAnio());

        dias = miFecha.diasTranscurridos(miFecha.getDia(), miFecha.getMes(), miFecha.getAnio());
        System.out.println("Dias transcurridos:"+dias);

        valorBisiesto=miFecha.esBisiesto(miFecha.getAnio());

        System.out.println("Es bisiesto:"+valorBisiesto);
  
    }

    public static boolean CargaFecha(){
        Scanner sc= new Scanner(System.in);
        boolean valorFecha;
        valorFecha=false;
        int dias,dia,mes,anio;
        System.out.println("Ingrese fecha");

        System.out.println();

        System.out.println("Ingrese dia");
        dia=sc.nextInt();
        System.out.println("Ingrese mes");
        mes=sc.nextInt();
        System.out.println("Ingrese año");
        anio=sc.nextInt();

        if((dia<=31 && dia>=1) && (mes<=12 && mes>=1)&& (anio>1)){
            valorFecha=true;
        }
         return valorFecha;
    }

    
}

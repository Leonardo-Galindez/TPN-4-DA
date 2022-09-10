package POO.Ejercicio4;

import java.util.Scanner;

public class TestFecha {
    public static void main(String[] args) {

        int dias,dia,mes,anio,dia2,mes2,anio2;
        boolean valorFecha,valorBisiesto,valorMayor;

        valorFecha=false;

        Scanner sc= new Scanner(System.in);

        Fecha miFecha = new Fecha();
        Fecha miFecha2 = new Fecha();

        do{
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

        }while(!valorFecha);

        miFecha.Fecha(dia, mes, anio);

        dias = miFecha.diasTranscurridos(dia, mes, anio);
        System.out.println("Dias transcurridos:"+dias);

        valorBisiesto=miFecha.esBisiesto(anio);
        System.out.println("Es bisiesto:"+valorBisiesto);

        do{
            System.out.println("Ingrese fecha");

            System.out.println();

            System.out.println("Ingrese dia");
            dia2=sc.nextInt();
            System.out.println("Ingrese mes");
            mes2=sc.nextInt();
            System.out.println("Ingrese año");
            anio2=sc.nextInt();

            if((dia2<=31 && dia2>=1) && (mes2<=12 && mes2>=1)&& (anio2>1)){
                valorFecha=true;
            }

        }while(!valorFecha);
        
        miFecha2.Fecha(dia2, mes2, anio2);

        if(miFecha.esFechaAnterio(miFecha2.getDia(),miFecha2.getMes(),miFecha2.getAnio())){
            System.out.println(miFecha2.toString()+":es anterior a:"+miFecha.toString());
        }else{
            System.out.println(miFecha2.toString()+":es anterior a:"+miFecha.toString());
        }
        
    }

    
}

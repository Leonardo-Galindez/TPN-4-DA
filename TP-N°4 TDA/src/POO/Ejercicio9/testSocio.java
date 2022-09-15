package POO.Ejercicio9;

import java.util.Scanner;

public class testSocio {
    public static void main(String[] args) {
        int codSocio,cantTorneos,puntajeMAyor,edad;
        String nombre,apellido;
        boolean valorClave;

        Scanner sc= new Scanner(System.in);
        
        Socio otroSocio1 = new Socio(1,"Leonardo","Galindez",20,10,34);


        //validacion codigo
        do{
            System.out.println("Ingrese codigo de Socio");
            codSocio=sc.nextInt();
            Socio otroSocio2 = new Socio(codSocio);
            valorClave=otroSocio2.equals(otroSocio1);
            if(valorClave){
                valorClave=true;
            }
        }while(valorClave);
        

        System.out.println("Ingrese nombre del Socio");
        nombre=sc.next();
        System.out.println("Ingrese apellido del Socio");
        apellido=sc.next();
        System.out.println("Ingrese edad del Socio");
        edad=sc.nextInt();
        System.out.println("Ingrese Cantidad Torneos del Socio");
        cantTorneos=sc.nextInt();
        System.out.println("Ingrese puntaje mayor del Socio");
        puntajeMAyor=sc.nextInt();

        Socio otroSocio2 = new Socio(codSocio,nombre,apellido,edad,cantTorneos,puntajeMAyor);

        System.out.println();
        if(otroSocio1.getCantTorneos()>otroSocio2.getCantTorneos()){
            System.out.println("El socio que gano mas torneos es:"+otroSocio1.getNombre()+" "+otroSocio1.getApellido());
        }else{
            System.out.println("El socio que gano mas torneos es:"+otroSocio2.getNombre()+" "+otroSocio2.getApellido());
        }

        System.out.println();
        if(otroSocio1.getPuntajeMayor()>otroSocio2.getPuntajeMayor()){
            System.out.println("El socio que gano mas torneos es:"+otroSocio1.getNombre()+" "+otroSocio1.getApellido());
        }else{
            System.out.println("El socio que gano mas torneos es:"+otroSocio2.getNombre()+" "+otroSocio2.getApellido());
        }

    }
}

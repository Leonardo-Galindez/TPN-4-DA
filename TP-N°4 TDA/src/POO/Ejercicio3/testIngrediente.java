package POO.Ejercicio3;

import java.util.Scanner;

public class testIngrediente {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
       
        boolean valorClave;
        String nombre;
        int cantidad,rta,unidad;
        double gramo,litro;

        valorClave=true;

        Ingrediente nuevoIngrediente = new Ingrediente();
        Ingrediente nuevoIngrediente2 = new Ingrediente();

        nuevoIngrediente.Ingrediente("sal");
        valorClave=nuevoIngrediente.equals(nuevoIngrediente2);

        do{
            System.out.println("Ingrese nombre");
            nombre=sc.next();

            nuevoIngrediente2.setNombre(nombre);

            valorClave=nuevoIngrediente.equals(nuevoIngrediente2);

        }while(valorClave);

        System.out.println("Ingrese cantidad");
        cantidad=sc.nextInt();

        nuevoIngrediente.setCantidad(cantidad);

        System.out.println();

        rta=Menu();
        
        switch(rta){
            case 1: 

                System.out.println("Ingrese unidades");
                unidad=sc.nextInt();
                nuevoIngrediente.setMedidaUnidad(unidad);

            break;
            case 2: 

                System.out.println("Ingrese litros");
                litro=sc.nextDouble();
                nuevoIngrediente.setMedidaLitro(litro);

            break;
            case 3: 

                System.out.println("Ingrese gramos");
                gramo=sc.nextDouble();
                nuevoIngrediente.setMedidaGramo(gramo);

            break;
            default:
            
                System.out.println("ERROR");

            break;
        }

        System.out.println(nuevoIngrediente.toString());  

    }

    public static int Menu(){
        Scanner sc= new Scanner(System.in);
        int rta;
        System.out.println("Ingrese unidad de medida");
        System.out.println("Unidades-------1");
        System.out.println("Litros---------2");
        System.out.println("Gramos---------3");
        rta=sc.nextInt();

        return rta;
    }
}

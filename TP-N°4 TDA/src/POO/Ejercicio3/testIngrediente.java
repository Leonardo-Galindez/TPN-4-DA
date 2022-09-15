package POO.Ejercicio3;

import java.util.Scanner;

public class testIngrediente {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println();
        boolean valorClave;
        String nombre,unidad;
        int cantidad,rta;
        double gramo,litro;

        valorClave=true;
        
        Ingrediente nuevoIngrediente = new Ingrediente("",0,"");
        Ingrediente nuevoIngrediente2 = new Ingrediente("",0,"");

        Ingrediente nueIngrediente= new Ingrediente("sal");
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
                unidad=sc.next();
                nuevoIngrediente.setMedidaUnidad(unidad);

            break;
            case 2: 

                System.out.println("Ingrese litros");
                litro=sc.nextDouble();
               

            break;
            case 3: 

                System.out.println("Ingrese gramos");
                gramo=sc.nextDouble();
                

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

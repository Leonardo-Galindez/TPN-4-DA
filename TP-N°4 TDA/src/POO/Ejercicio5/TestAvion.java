package POO.Ejercicio5;

import java.util.Scanner;

public class TestAvion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int idAvion,Modelo,CantAsientos,kilometros,velocidadPromedio;
        
        System.out.println("Ingrese id del avion");
        idAvion=sc.nextInt();
        System.out.println("Ingrese modelo del avion");
        Modelo=sc.nextInt();
        System.out.println("Ingrese cantidad de asientos del avion");
        CantAsientos=sc.nextInt();
        System.out.println("Ingrese kilometraje del avion");
        kilometros=sc.nextInt();
        System.out.println("Ingrese velocidad promedio del avion");
        velocidadPromedio=sc.nextInt();

        Avion otrAvion1 = new Avion(idAvion,Modelo,CantAsientos,kilometros,velocidadPromedio);
        
        do{
            System.out.println("Ingrese id del avion");
            idAvion=sc.nextInt();
        }while(otrAvion1.equals(idAvion));

        System.out.println("Ingrese modelo del avion");
        Modelo=sc.nextInt();
        System.out.println("Ingrese cantidad de asientos del avion");
        CantAsientos=sc.nextInt();
        System.out.println("Ingrese kilometraje del avion");
        kilometros=sc.nextInt();
        System.out.println("Ingrese velocidad promedio del avion");
        velocidadPromedio=sc.nextInt();

        Avion otrAvion2 = new Avion(idAvion,Modelo,CantAsientos,kilometros,velocidadPromedio);
    }

}

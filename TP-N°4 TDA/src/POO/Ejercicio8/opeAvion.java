package POO.Ejercicio8;

import POO.Ejercicio5.Avion;
import POO.Ejercicio4.Fecha;
import java.util.Scanner;

public class opeAvion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rta, mayorVelo, posMayor,   PromKmTotal, acumKm;
        String idBusca,modeloBusa;
        acumKm = 0;
        boolean valorMenu;
        valorMenu = false;
        posMayor = 0;
        mayorVelo = 0;
        Avion misAviones[] = new Avion[2];
        CargaAvion(misAviones);
        do {
            rta = Menu();
            switch (rta) {
                case 1:
                    for (int i = 0; i < misAviones.length; i++) {
                        if (mayorVelo <= misAviones[i].getVelocidadPromedio()) {
                            mayorVelo = misAviones[i].getVelocidadPromedio();
                            posMayor = i;
                        }
                    }
                    System.out.println(misAviones[posMayor].toString());
                    break;
                case 2:
                    System.out.println("Ingrese id del Avion");
                    idBusca = sc.next();
                    Avion auxAvion = new Avion(idBusca);
                    for (int i = 0; i < misAviones.length; i++) {
                        if (idBusca == misAviones[i].getIdAvion()) {
                            System.out.println("La cantidad de asientos es:" + misAviones[i].getCantiAsientos());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingrese modelo del Avion");
                    modeloBusa = sc.next();
                    for (int i = 0; i < misAviones.length; i++) {
                        if (modeloBusa.equals(misAviones[i].getModelo())) {
                            System.out.println(misAviones[i].toString());
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < misAviones.length; i++) {
                        acumKm = acumKm + misAviones[i].getKilometros();
                    }
                    PromKmTotal = acumKm / misAviones.length;
                    System.out.println("El promedio de todos los aviones es:"+PromKmTotal);
                    acumKm=0;
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
        System.out.println("Mostrar el avión que tiene mayor velocidad-------1");
        System.out.println("Mostrar la cantidad de asientos------------------2");
        System.out.println("Mostrar cuantos aviones de un modelo hay---------3");
        System.out.println("Mostrar el promedio de km todos los avines-------4");
        System.out.println("Finalizar----------------------------------------0");
        rta = sc.nextInt();

        return rta;

    }

    public static void CargaAvion(Avion[] misAviones) {
        int   CantAsientos, kilometros, velocidadPromedio;
        Fecha fechaMantenimiento;
        String Modelo;

        fechaMantenimiento = new Fecha("",15, 15, 2001);
        String idAvion;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < misAviones.length; i++) {

            System.out.println("Ingrese id del avion");
            idAvion = sc.next();
            System.out.println("Ingrese Modelo del avion");
            Modelo = sc.next();
            System.out.println("Ingrese cantidad de asientos del avion");
            CantAsientos = sc.nextInt();
            System.out.println("Ingrese kilometraje del avion");
            kilometros = sc.nextInt();
            System.out.println("Ingrese velocidad promedio del avion");
            velocidadPromedio = sc.nextInt();

            misAviones[i] = new Avion(idAvion, Modelo, CantAsientos, kilometros, velocidadPromedio,fechaMantenimiento);
        }
    }
}

package POO.TP_TDA;

import POO.Ejercicio5.Avion;
import POO.Ejercicio4.Fecha;
import java.util.Scanner;

public class Mantenimiento {
    public static void main(String[] args) {
        int cantAvion;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cantidad de aviones");
        cantAvion = sc.nextInt();

        Avion miAvion[] = new Avion[cantAvion];
        Fecha Mantenimientos[] = new Fecha[cantAvion];

        CargarArreglo(miAvion, cantAvion, Mantenimientos);
        System.out.println();
        MostrarAvion(miAvion, Mantenimientos, cantAvion);


        int rta, mayorVelo, posMayor, PromKmTotal, acumKm;
        String idBusca, modeloBusa;
        acumKm = 0;
        boolean valorMenu;
        valorMenu = false;
        posMayor = 0;
        mayorVelo = 0;

        do {
            rta = Menu();
            switch (rta) {
                case 1:
                    for (int i = 0; i < miAvion.length; i++) {
                        if (mayorVelo <= miAvion[i].getVelocidadPromedio()) {
                            mayorVelo = miAvion[i].getVelocidadPromedio();
                            posMayor = i;
                        }
                    }
                    System.out.println(miAvion[posMayor].toString());
                    break;
                case 2:
                    System.out.println("Ingrese id del Avion");
                    idBusca = sc.next();
                    Avion auxAvion = new Avion(idBusca);
                    for (int i = 0; i < miAvion.length; i++) {
                        if (miAvion[i].equals(auxAvion)) {
                            System.out.println("La cantidad de asientos es:" + miAvion[i].getCantiAsientos());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingrese modelo del Avion");
                    modeloBusa = sc.next();
                    for (int i = 0; i < miAvion.length; i++) {
                        if (modeloBusa.equals((miAvion[i].getModelo()))) {
                            System.out.println(miAvion[i].toString());
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < miAvion.length; i++) {
                        acumKm = acumKm + miAvion[i].getKilometros();
                    }
                    PromKmTotal = acumKm / miAvion.length;
                    System.out.println("El promedio de todos los aviones es:" + PromKmTotal);
                    acumKm = 0;
                    break;

                case 5:
                    Fecha auxFecha;
                    for (int i = 0; i < miAvion.length; i++) {

                        if (miAvion[i].getKilometros() < 30000) {
                            auxFecha = new Fecha();
                            auxFecha = miAvion[i].getFechaMan();
                            auxFecha.calcularFecha(auxFecha.getDia(), auxFecha.getMes(), auxFecha.getAnio(), 60);
                            System.out.println("El proximo Mantenimiento del Avion " + miAvion[i].getIdAvion()
                                    + " es el:" + miAvion[i].getFechaMan());

                        } else {
                            if (miAvion[i].getKilometros() > 30000 && miAvion[i].getKilometros() < 100000) {
                                auxFecha = new Fecha();
                                auxFecha = miAvion[i].getFechaMan();
                                auxFecha.calcularFecha(auxFecha.getDia(), auxFecha.getMes(), auxFecha.getAnio(), 30);
                                System.out.println("El proximo Mantenimiento del Avion " + miAvion[i].getIdAvion()
                                        + " es el:" + miAvion[i].getFechaMan());
                            } else {

                                if (miAvion[i].getKilometros() > 100000) {
                                    auxFecha = new Fecha();
                                    auxFecha = miAvion[i].getFechaMan();
                                    auxFecha.calcularFecha(auxFecha.getDia(), auxFecha.getMes(), auxFecha.getAnio(),
                                            30);
                                    System.out.println("El proximo Mantenimiento del Avion " + miAvion[i].getIdAvion()
                                            + " es el:" + miAvion[i].getFechaMan());

                                }
                            }
                            if (miAvion[i].getModelo().equals("AirBus")) {

                                auxFecha = miAvion[i].getFechaMan();
                                auxFecha.calcularFecha(auxFecha.getDia(), auxFecha.getMes(), auxFecha.getAnio(), 4);
                                System.out.println("El proximo Mantenimiento del Avion " + miAvion[i].getIdAvion()
                                        + " es el:" + miAvion[i].getFechaMan());

                            }

                        }
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

    public static void CargarArreglo(Avion[] miAvion, int cantAvion, Fecha[] Mantenimientos) {

        Scanner sc = new Scanner(System.in);

        int tipo, idAvionInt, CantAsientos, kilometros, velocidadPromedio, dia, mes, anio;
        String idAvionString, idAvion, modelo;
        boolean valorClave, valorTipo;

        valorTipo = false;
        valorClave = false;
        idAvionInt = 0;
        idAvionString = "";

        for (int i = 0; i < cantAvion; i++) {
            Avion auxAvion;

            do {
                tipo = TipoAvion();
                if (tipo > 0 && tipo <= 5) {
                    if (tipo > 0 && tipo <= 2) {
                        System.out.println("Ingrese id del Avion numerico");
                        idAvionInt = sc.nextInt();
                    } else {
                        System.out.println("Ingrese id del Avion No numerico");
                        idAvionString = sc.next();
                    }
                } else {
                    valorTipo = true;
                }

                idAvion = SeleccionarTipoAvion(tipo, idAvionInt, idAvionString);
                auxAvion = new Avion(idAvion);

                valorClave = VerificarID(auxAvion, miAvion, cantAvion);

            } while (valorClave || valorTipo);

            System.out.println("Ingrese modelo del Avion");

            modelo = sc.next();

            modelo = sc.next();

            System.out.println("Ingrese Cantidad de asientos del Avion");
            CantAsientos = sc.nextInt();
            System.out.println("Ingrese kilometraje");
            kilometros = sc.nextInt();
            System.out.println("Ingrese velocidad Promedio del Avion");
            velocidadPromedio = sc.nextInt();

            System.out.println("Ingrese Fecha mantenimiento");

            do {
                System.out.println("Ingrese dia");
                dia = sc.nextInt();
                System.out.println("Ingrese mes");
                mes = sc.nextInt();
                System.out.println("Ingrese año");
                anio = sc.nextInt();
                Mantenimientos[i] = new Fecha(idAvion, dia, mes, anio);
            } while (!Mantenimientos[i].esFechaCorrecta());

            miAvion[i] = auxAvion;
            miAvion[i].setModelo(modelo);
            miAvion[i].setCantiAsientos(CantAsientos);
            miAvion[i].setKilometros(kilometros);
            miAvion[i].setVelocidadPromedio(velocidadPromedio);
            miAvion[i].setfechaMan(Mantenimientos[i]);

        }

    }


    public static int Menu() {
        Scanner sc = new Scanner(System.in);
        int rta;
        System.out.println("Mostrar el avión que tiene mayor velocidad-------1");
        System.out.println("Mostrar la cantidad de asientos------------------2");
        System.out.println("Mostrar cuantos aviones de un modelo hay---------3");
        System.out.println("Mostrar el promedio de km todos los avines-------4");
        System.out.println("Mostrar Proximo mantenimiento--------------------5");
        System.out.println();
        System.out.println("Finalizar----------------------------------------0");
        rta = sc.nextInt();

        return rta;

    }


    public static int TipoAvion() {
        int rta;

        Scanner sc = new Scanner(System.in);

        System.out.println("Uso general--------------------------------1");
        System.out.println("Gubernamental------------------------------2");
        System.out.println("Experimental-------------------------------3");
        System.out.println("Aeronave deportiva liviana-----------------4");
        System.out.println("Aeronave deportiva liviana experimental----5");
        rta = sc.nextInt();

        return rta;
    }

    public static void MostrarAvion(Avion[] miAvion, Fecha[] Mantenimiento, int cant) {

        for (int i = 0; i < cant; i++) {

            System.out.println(miAvion[i].toString());

            System.out.println(Mantenimiento[i].toString());



            System.out.println("");
        }
    }

    public static boolean VerificarID(Avion auxAvion, Avion[] miAvion, int cantAvion) {
        boolean repetido, noesNulo;
        int i;

        i = 0;
        repetido = false;
        noesNulo = false;

        while (i < cantAvion && !repetido && !noesNulo) {
            noesNulo = miAvion[i] != null;
            if (noesNulo) {
                repetido = miAvion[i].equals(auxAvion);
            }
            i++;
        }

        return repetido;
    }

    public static String SeleccionarTipoAvion(int tipo, int idAvionInt, String idAvionString) {

        String idAvion;

        switch (tipo) {
            case 1:
                idAvion = "LV" + '-' + idAvionInt;
                break;
            case 2:
                idAvion = "LQ" + '-' + idAvionInt;
                break;
            case 3:
                idAvion = "LV-X" + '-' + idAvionString;
                break;
            case 4:
                idAvion = "LV-S" + '-' + idAvionString;
                break;
            case 5:
                idAvion = "LV-SX" + '-' + idAvionString;
                break;
            default:
                idAvion = "Error";
                break;
        }
        return idAvion;

    }

}

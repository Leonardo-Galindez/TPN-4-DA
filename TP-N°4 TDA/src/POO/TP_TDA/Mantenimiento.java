package POO.TP_TDA;

import POO.Ejercicio5.Avion;
import java.util.Scanner;

public class Mantenimiento {
    public static void main(String[] args) {
        int cantAvion;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cantidad de aviones");
        cantAvion = sc.nextInt();

        Avion miAvion[] = new Avion[cantAvion];

        CargarArreglo(miAvion, cantAvion);
        System.out.println();
        MostrarAvion(miAvion, cantAvion);
    }

    public static void CargarArreglo(Avion[] miAvion, int cantAvion) {

        Scanner sc = new Scanner(System.in);

        int tipo, idAvionInt, modelo, CantAsientos, kilometros, velocidadPromedio;
        String idAvionString, idAvion;
        boolean valorClave, valorTipo;

        valorTipo = false;
        valorClave = false;
        idAvionInt = 0;
        idAvionString = "";

        for (int i = 0; i < cantAvion; i++) {
            Avion auxAvion;
            do {
                tipo =TipoAvion();
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
            modelo = sc.nextInt();
            System.out.println("Ingrese Cantidad de asientos del Avion");
            CantAsientos = sc.nextInt();
            System.out.println("Ingrese kilometraje");
            kilometros = sc.nextInt();
            System.out.println("Ingrese velocidad Promedio del Avion");
            velocidadPromedio = sc.nextInt();

            miAvion[i] = auxAvion;
            miAvion[i].setModelo(modelo);
            miAvion[i].setCantiAsientos(CantAsientos);
            miAvion[i].setKilometros(kilometros);
            miAvion[i].setVelocidadPromedio(velocidadPromedio);

        }
    }

    public static int  TipoAvion(){
        int rta;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Uso general--------------------------------1");
        System.out.println("Gubernamental------------------------------2");
        System.out.println("Experimental-------------------------------3");
        System.out.println("Aeronave deportiva liviana-----------------4");
        System.out.println("Aeronave deportiva liviana experimental----5");
        rta=sc.nextInt();

        return rta;
    }

    public static void MostrarAvion(Avion[] miAvion,int cant) {

        for (int i = 0; i < cant; i++) {

            System.out.println(miAvion[i].toString());

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

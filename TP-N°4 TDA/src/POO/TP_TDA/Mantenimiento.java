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
    }

    public static void CargarArreglo(Avion[] miAvion, int cantAvion) {
        Scanner sc = new Scanner(System.in);

        int tipo, idAvionInt,modelo,CantAsientos,kilometros,velocidadPromedio;
        String idAvionString, idAvion;
        boolean valorClave;

        valorClave = false;
        idAvionInt = 0;
        idAvionString = "";
        Avion auxAvion;

        for (int i = 0; i < cantAvion; i++) {
            do {
                System.out.println("Ingrese tipo Avion");
                tipo = sc.nextInt();
                if (tipo > 2) {
                    System.out.println("Ingrese id del Avion No numerico");
                    idAvionString = sc.next();
                } else {
                    System.out.println("Ingrese id del Avion numerico");
                    idAvionInt = sc.nextInt();
                }
                idAvion = TipoAvion(tipo, idAvionInt, idAvionString);
                auxAvion = new Avion(idAvion);

                valorClave = VerificarID(auxAvion, miAvion, cantAvion);

            } while (tipo <= 5 && tipo > 0 && valorClave);

            System.out.println("Ingrese modelo del Avion");
            modelo=sc.nextInt();
            System.out.println("Ingrese Cantidad de asientos del Avion");
            CantAsientos=sc.nextInt();
            System.out.println("Ingrese kilometraje");
            kilometros=sc.nextInt();
            System.out.println("Ingrese velocidad Promedio del Avion");
            velocidadPromedio=sc.nextInt();

            miAvion[i]=auxAvion;
            miAvion[i].setModelo(modelo);
            miAvion[i].setCantiAsientos(CantAsientos);
            miAvion[i].setKilometros(kilometros);
            miAvion[i].setVelocidadPromedio(velocidadPromedio);

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

    public static String TipoAvion(int tipo, int idAvionInt, String idAvionString) {

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

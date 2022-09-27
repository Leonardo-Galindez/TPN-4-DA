package POO.Ejercicio11;

import java.util.Scanner;

public class TestLavadero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Auto[] MisAutos = new Auto[3];
        CargarAuto(MisAutos);
        MostrarAuto(MisAutos);
    }

    // Consultar sobre el nextLine
    public static void CargarAuto(Auto[] MisAutos) {
        Scanner input = new Scanner(System.in);

        int telefono, rta;
        String patente, nombrePropietario,servicio;
        boolean valorPatente;

        valorPatente = false;
        for (int i = 0; i < MisAutos.length; i++) {
            Auto auxAuto;
            do {
                System.out.println("Ingrese Patente");
                patente = input.next();
                auxAuto = new Auto(patente);
                valorPatente = VerificarPantente(MisAutos, auxAuto);
            } while (valorPatente);

            System.out.println("Ingrese Nombre del Propietario");
            nombrePropietario = input.next();
            System.out.println("Ingrese telefono");
            telefono = input.nextInt();
            System.out.println("Externa: limpieza externa, solo el chasis-----1");
            System.out.println("Básica: limpieza externa e interna básica-----2");
            System.out.println("Full: limpieza con motor----------------------3");
            rta = input.nextInt();
            servicio=Menu(rta);

            MisAutos[i] = auxAuto;
            MisAutos[i].setNombrePropietario(nombrePropietario);
            MisAutos[i].setTelefono(telefono);
            MisAutos[i].setServicio(servicio);

            

        }
    }

    public static void MostrarAuto(Auto []MisAutos){
        for(int i=0;i<MisAutos.length;i++){
            if(MisAutos[i].getServicio().equalsIgnoreCase("Full")){
                System.out.println(MisAutos[i].toString());
            }
        }
        for(int i=0;i<MisAutos.length;i++){
            if(MisAutos[i].getServicio().equalsIgnoreCase("Basica")){
                System.out.println(MisAutos[i].toString());
            }
        }

        for(int i=0;i<MisAutos.length;i++){
            if(MisAutos[i].getServicio().equalsIgnoreCase("Externa")){
                System.out.println(MisAutos[i].toString());
            }
        }
    }

    public static String Menu(int rta) {
        String servicio;

        switch (rta) {
            case 1:
                servicio = "Externa";
                break;
            case 2:
                servicio = "Basica";
                break;
            case 3:
                servicio = "Full";
                break;
            default:
                servicio = "";
                break;
        }
        return servicio;

    }

    public static boolean VerificarPantente(Auto[] MisAutos, Auto auxAuto) {

        boolean vacio = false, repetido = false;
        int i = 0, valor;

        while (i < MisAutos.length) {// verificar si la celda esta vacio o no porque sino el equasl nos tira error de
                                     // compilado
            vacio = MisAutos[i] != null;
            if (vacio) {
                valor = MisAutos[i].compareTo(auxAuto);
                if (valor == 0) {
                    repetido = true;
                }
            }
            i++;
        }
        return repetido;

    }

}

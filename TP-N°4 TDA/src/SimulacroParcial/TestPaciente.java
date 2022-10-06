package SimulacroParcial;


import java.util.Scanner;

public class TestPaciente {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cantPaciente,dni;
        Paciente Pacientes[] = new Paciente[2];
        cantPaciente=0;
        boolean valorClave;
        valorClave=true;

        for (int i = 0; i < Pacientes.length; i++) {
            Paciente nuevoPaciente;
            
            do {
                
                System.out.println("Ingrese dni");
                dni=sc.nextInt();
                nuevoPaciente = new Paciente(dni);
                valorClave = CargarPaciente(nuevoPaciente, Pacientes,cantPaciente);
            } while (!valorClave);
            Pacientes[i]=nuevoPaciente;
            cantPaciente++;
           
        }
    }

    public static boolean CargarPaciente(Paciente p,Paciente[] Pacientes,int cant) {
        boolean valorClave;
        int i=0;
        valorClave = false;

        while(i<cant && !valorClave){
            valorClave = Pacientes[i].equals(p);
            i++;
        }
           
        return !valorClave;
    }
}

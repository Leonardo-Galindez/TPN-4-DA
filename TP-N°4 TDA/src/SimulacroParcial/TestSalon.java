package SimulacroParcial;

import java.util.Scanner;

import SimulacroParcial.Salon;

public class TestSalon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantSalon,posMayor;
        System.out.println("Ingrese cantidad de salones");
        cantSalon = sc.nextInt();
        Salon[] Salones = new Salon[cantSalon];
        CargarSalon(Salones);
        posMayor=MayorCapacidad(Salones);
        System.out.println(Salones[posMayor].toString());
    }

    public static  int MayorCapacidad(Salon []Salones){
        int posMayor,mayor;
        mayor=0;
        posMayor=0;
        for(int i=0;i<Salones.length;i++){
            if(Salones[i].getDisponibilidad()>mayor){
                mayor=Salones[i].getDisponibilidad();
                posMayor=i;
            }
        }
        return posMayor;
    }


    public static void CargarSalon(Salon Salones  []) {
        int disponibilidad, telefono, rta;
        String direccion, nombre;
        boolean musica, valorClave;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < Salones.length; i++) {
            Salon auxSalon;
            do {
                System.out.println("Ingrese nombre");
        
                //ERROR DE NEXTLINE
                nombre = sc.next();
                auxSalon = new Salon(nombre);

                valorClave=VerificarNombre(auxSalon, Salones);

            } while (valorClave);

            System.out.println("Ingrese disponibilidad");
            disponibilidad = sc.nextInt();
            System.out.println("Se pude usar musica true si, false no");
            musica = sc.nextBoolean();
            System.out.println("Ingrese direccion");
            direccion = sc.next();
            System.out.println("Ingrese telefono");
            telefono = sc.nextInt();

            Salones[i]=auxSalon;
            Salones[i].setDisponibilidad(disponibilidad);
            Salones[i].setMusica(musica);
            Salones[i].setDireccion(direccion);
            Salones[i].setTelefono(telefono);

        }
    }

    public static boolean VerificarNombre(Salon s, Salon Salones[]) {
        boolean repetido, vacio;
        int i;
        i = 0;
        repetido = false;
        vacio = false;

        while (i < Salones.length && !repetido && !vacio) {
            vacio=Salones[i]!=null;
            if(vacio){
                repetido=Salones[i].equals(s);
            }
            i++;
        }
        return repetido;
    }

}

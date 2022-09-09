
package POO.Ejercicio2;
import java.util.Scanner;

public class testMascota {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Mascota miMascota= new Mascota();
        int codigo,edad;
        String nombre;
        double peso;

        System.out.println("Ingrese codigo");
        codigo=sc.nextInt();
        miMascota.setCodigo(codigo);

        System.out.println("Ingrese nombre");
        nombre=sc.next();
        miMascota.setNombre(nombre);

        System.out.println("Ingrese peso");
        peso=sc.nextDouble();
        miMascota.setPeso(peso);

        System.out.println("Ingrese edad");
        edad=sc.nextInt();
        miMascota.setEdad(edad);

        miMascota.getNombre();
        System.out.println("El nombre de la mascota:"+codigo+" es:"+nombre);
        miMascota.cumpleMascota();
        System.out.println("Ingrse nuevo peso de la mascota "+codigo);
        peso=sc.nextDouble();
        miMascota.setPeso(peso);

        System.out.println(miMascota.toString());
    }
}

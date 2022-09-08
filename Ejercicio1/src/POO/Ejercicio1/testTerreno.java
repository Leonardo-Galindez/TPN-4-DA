
package POO.Ejercicio1;
import java.util.Scanner;

public class testTerreno {
    public static void main(String[] args) {
        int base,altura,codigo,manzana;
        Scanner sc= new Scanner(System.in);
        Terreno miTerreno= new Terreno();
        
        System.out.println("Ingrese codigo");
        codigo=sc.nextInt();
  
        System.out.println("Ingrese base");
        base=sc.nextInt();
        
        System.out.println("Ingrese altura");
        altura=sc.nextInt();
        
        System.out.println("Ingrese manzana");
        manzana=sc.nextInt();
        
        miTerreno.Terreno(codigo, base, altura, manzana);
        System.out.println(miTerreno.toString());
        
    }
}

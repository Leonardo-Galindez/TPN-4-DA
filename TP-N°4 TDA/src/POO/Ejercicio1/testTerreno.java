package POO.Ejercicio1;
import java.util.Scanner;
//\n
public class testTerreno {
    public static void main(String[] args) {
        int codigo,manzana;
        double base,altura,perimetro,perimetroCerco,superficie,pago;
        Scanner sc= new Scanner(System.in);
        Terreno miTerreno= new Terreno(0,0,0,0);
        
        System.out.println("Ingrese codigo");
        codigo=sc.nextInt();
  
        System.out.println("Ingrese base");
        base=sc.nextDouble();
        
        System.out.println("Ingrese altura");
        altura=sc.nextDouble();
        
        System.out.println("Ingrese manzana");
        manzana=sc.nextInt();
        
        System.out.println(miTerreno.toString());
        perimetro=miTerreno.perimetro(miTerreno.getBase(), miTerreno.getAltura());

        System.out.println("El perimetro del terreno:"+miTerreno.getCodigo()+" es de:"+perimetro);
        perimetroCerco=perimetro*3;
        System.out.println("La cantidad de metros de Alambre es:"+perimetroCerco);

        superficie=miTerreno.superficie(miTerreno.getBase(), miTerreno.getAltura());
        pago=superficie*150;
        System.out.println("El costo de limpieza del terreno es de:"+pago);
        
    }

    
}

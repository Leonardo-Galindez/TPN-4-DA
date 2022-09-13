package POO.Ejercicio6;

import POO.Ejercicio3.Ingrediente;
import java.util.Scanner;

import javax.sound.midi.MidiChannel;

//probar con un while o verificacion de longitud
public class Receta {
    public static void main(String[] args) {
        String nombre,BuscaIngre;
        int cantidad,medidaUnidad,cantIngrediente;
        double medidaLitro,medidaGramo;
        boolean valorIngre;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad ingrediente");
        cantIngrediente=sc.nextInt();
        
       Ingrediente []mIngrediente = new Ingrediente[cantIngrediente]; 
     CargaIngrediente(mIngrediente);
        MostrarIngrediente(mIngrediente);
        System.out.println("Ingrese ingrediente");
        BuscaIngre=sc.next();
        valorIngre=VerificarIngre(mIngrediente, BuscaIngre);
        if(valorIngre){
            System.out.println("El ingrediente esta en la receta");
        }else{
            System.out.println("El ingrediente no esta en la receta");
        }
    }

    public static boolean VerificarIngre(Ingrediente []mIngrediente,String ingre){
        boolean valorIngre;
        valorIngre=false;
        Ingrediente nuevoIngre = new Ingrediente(ingre);
        for(int i=0;i<mIngrediente.length;i++){
            if(nuevoIngre.equals(mIngrediente[i])){
                valorIngre=true;
            }
        }
        return valorIngre;
    } 

    public static void MostrarIngrediente(Ingrediente mIngrediente[]){
        for(int i=0;i<mIngrediente.length;i++){
            System.out.println(mIngrediente[i].toString());
        }
    }

    public static void CargaIngrediente(Ingrediente []mIngrediente){
        String nombre,medidaUnidad;
        int cantidad;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<mIngrediente.length;i++){
            System.out.println("Ingrese nombre");
            nombre=sc.next();
            System.out.println("ingrese cantidad");
            cantidad=sc.nextInt();
            System.out.println("Ingrese unidad");
            medidaUnidad=sc.next();

            mIngrediente[i] = new Ingrediente (nombre,cantidad,medidaUnidad);
        }
    }
}

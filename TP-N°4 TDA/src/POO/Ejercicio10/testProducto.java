package POO.Ejercicio10;


import java.util.Scanner;

public class testProducto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valorMenu;
        int cantPro,BuscoPro;
        double costo;
        valorMenu=false;
        Producto[] productosArray = new Producto[1];
        CargarArreglo(productosArray);
        
        do {
            System.out.println("Ingrese codigo producto");
            BuscoPro=sc.nextInt();
            System.out.println("Ingrese cantidad de Producto");
            cantPro=sc.nextInt();
            System.out.println();
            MostrarProducto(productosArray, BuscoPro);
            Stock(productosArray, BuscoPro, cantPro);
            MostrarProducto(productosArray,BuscoPro);
            costo=CalcularCosto(productosArray, BuscoPro, cantPro);
            System.out.println("El costo de la compra es:$"+costo);
            if(cantPro==0){
                valorMenu=true;
            }

        } while (!valorMenu);

    }
    public static double CalcularCosto(Producto[] productosArray,int codigo, int cant){
        double costo;
        Producto auxProducto;
        auxProducto = new Producto(codigo);
        costo=0;
        for(int i=0;i<productosArray.length;i++){
            if(productosArray[i].equals(auxProducto)){
                costo=productosArray[i].CalcularCosto(cant);
            }
        }
        return costo;
    }

    public static void Stock(Producto[] productosArray,int codigo,int cantPro ){
        Producto auxProducto;
        auxProducto = new Producto(codigo);
        for(int i=0;i<productosArray.length;i++){
            if(productosArray[i].equals(auxProducto)){
                productosArray[i].RestStock(cantPro);
            }
        }   
    }

    public static void MostrarProducto(Producto[] productosArray,int codigo){
        Producto auxProducto;
        auxProducto = new Producto(codigo);
        for(int i=0;i<productosArray.length;i++){
            if(productosArray[i].equals(auxProducto)){
                System.out.println(productosArray[i].toString());
            }
            System.out.println("");
        }
    }
    
    public static void CargarArreglo(Producto[] productosArray) {
        int codigo, stocKg;
        double precioKg;
        String descripcion;
        boolean valorClave;

        valorClave = false;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < productosArray.length; i++) {
            Producto miProducto;
            do {
                System.out.println("ingrese codigo");
                codigo = sc.nextInt();
                miProducto = new Producto(codigo);

                valorClave = VerificarCodigo(miProducto, productosArray);

            } while (valorClave);

            System.out.println("ingrese descripcion");
            descripcion = sc.next();
            System.out.println("ingrese precio por Kg");
            precioKg = sc.nextDouble();
            System.out.println("ingrese stock por kg");
            stocKg = sc.nextInt();
            miProducto.setDescipcion(descripcion);

            productosArray[i] = miProducto;
            productosArray[i].setDescipcion(descripcion);
            productosArray[i].setPrecioKg(precioKg);
            productosArray[i].setStocKg(stocKg);

        }
    }

    public static boolean VerificarCodigo(Producto p, Producto productoArray[]) {
        boolean repetido, noesNulo;
        int i;
        i = 0;
        repetido = false;
        noesNulo = false;

        while (i < productoArray.length && !repetido && !noesNulo) {
            noesNulo = productoArray[i] != null;
            if (noesNulo) {
                repetido = productoArray[i].equals(p);
            }
            i++;
        }

        return repetido;
    }

}

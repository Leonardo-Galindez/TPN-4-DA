package POO.Ejercicio10;

import java.util.Scanner;

public class testProducto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Producto[] productosArray = new Producto[2];
        CargarArreglo(productosArray);

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

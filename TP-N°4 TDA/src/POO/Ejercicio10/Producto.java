package POO.Ejercicio10;

public class Producto {

    // Atributos
    private int codigo;
    private String descripcion;
    private double precioKg;
    private int stocKg;

    // Constructores
    public Producto(int cod) {
        this.codigo = cod;
        this.descripcion = "";
        this.precioKg = 0;
        this.stocKg = 0;
    }

    public Producto(int cod, String desc, double preKg, int stKg) {
        this.codigo = cod;
        this.descripcion = desc;
        this.precioKg = preKg;
        this.stocKg = stKg;
    }

    // observadores

    public int getCodigo() {
        return codigo;
    }

    public String getDescipcion() {
        return descripcion;
    }

    public double getPrecioKg() {
        return precioKg;
    }

    public int getStocKg() {
        return stocKg;
    }

    public String toString() {
        return "Codigo:" + codigo + "\nDescripcion:" + descripcion + "\nPrecio Kg:" + precioKg + "\nStock Kg:" + stocKg;
    }

    // Modificadores

    public void setCodigo(int cod) {
        this.codigo = cod;
    }

    public void setDescipcion(String desc) {
        this.descripcion = desc;
    }

    public void setPrecioKg(double preKg) {
        this.precioKg = preKg;
    }

    public void setStocKg(int stKg) {
        this.stocKg = stKg;
    }

    // Comparadores

    

    public boolean equals(Producto p) {
        return this.codigo == p.codigo;
    }

    public int compareTo(Producto p) {
        return this.codigo - p.codigo;
    }

    // Propias del tipo


    public double CalcularCosto( int cant) {
        double costo;
        costo = this.precioKg * cant;
        return costo;
    }

    public void RestStock(int cant){
        this.stocKg=this.stocKg-cant;
    }

}

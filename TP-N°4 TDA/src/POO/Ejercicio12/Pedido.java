package POO.Ejercicio12;

public class Pedido {

    // Atributos
    private int codigo;
    private String descripcion;
    private float[] PreciosProductos = new float[10];
    private String direccion;
    private String nombrePersona;
    private int telefono;

    // Metodos

    // Constructores

    public Pedido(int cod) {
        this.codigo = cod;
        this.descripcion = "";
        for (int i = 0; i < PreciosProductos.length; i++) {

        }
        this.direccion = "";
        this.nombrePersona = "";
        this.telefono = 0;
    }

    public Pedido(int cod, String desc, String direc, String nomP, int telef) {
        this.codigo = cod;
        this.descripcion = desc;
        // Precio Productos como inicializar el arreglo
        this.direccion = direc;
        this.nombrePersona = nomP;
        this.telefono = telef;
    }

    // Observadores

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float[] getPreciosProductos() {
        return PreciosProductos;
    }

    public String getDireccion() {
        return descripcion;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public int getTelefono() {
        return telefono;
    }

    public String toString() {
        return "\nCodigo:" + codigo + "\ndescripcion:" + descripcion + "\ndireccion:" + direccion + "\nnombre Persona:"
                + nombrePersona + "\ntelefono:" + telefono;
        /*
         * for(int i=0;i<PreciosProductos.length;i++){//Como mostrar los precios??
         * System.out.println(PreciosProductos[i]);
         * };
         */

    }

    // Modificadores

    public void setDescripcion(String desc) {
        this.descripcion = desc;
    }

    public void setPreciosPedido() {

    }

    public void setDireccion(String direc) {
        this.direccion = direc;
    }

    public void setNombrePersona(String nomP) {
        this.nombrePersona = nomP;
    }

    public void setTelefono(int telef) {
        this.telefono = telef;
    }

    // Comparadores

    public boolean equasl(Pedido nuevoPedido) {
        return this.codigo == nuevoPedido.codigo;
    }

    public int compareTo(Pedido nuevoPedido) {
        return this.codigo - nuevoPedido.codigo;
    }

    //Propias del tipo

    public float  calcularCosto(float PreciosProductos[]){
        float totalPedido;
        totalPedido=0;
        for(int i=0;i<PreciosProductos.length;i++){
            totalPedido=totalPedido+PreciosProductos[i];
        }
        return totalPedido;
    }
}

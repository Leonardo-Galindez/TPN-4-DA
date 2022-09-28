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
    //metodo mostrar precios
    public Pedido(int cod) {
        this.codigo = cod;
        this.descripcion = "";
        
        this.direccion = "";
        this.nombrePersona = "";
        this.telefono = 0;
    }

    public Pedido(int cod, String desc, String direc, String nomP, int telef,float []precios ) {
        this.codigo = cod;
        this.descripcion = desc;
        this.PreciosProductos=precios;
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
    
    public void agregarItem(String producto,String Productos[]){
        for(int i=0;i<Productos.length;i++){

        }
    }

    private void definirPrecios(float []Precio){

        Precio[0]=0;
        Precio[1]=0;
        Precio[2]=0;
        Precio[3]=0;
        Precio[4]=0;
        Precio[5]=0;
        Precio[6]=0;
        Precio[7]=0;
        Precio[8]=0;
        Precio[9]=0;

        
    } 

    public float  calcularCosto(float PreciosProductos[]){
        float totalPedido;
        totalPedido=0;
        for(int i=0;i<PreciosProductos.length;i++){
            totalPedido=totalPedido+PreciosProductos[i];
        }
        return totalPedido;
    }
}

package POO.Ejercicio9;

public class Socio {

    // Atributos

    private int codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private int cantTorneos;
    protected int puntajeMAyor;

    // Contructores

    public Socio(int cod) {
        this.codigo = cod;
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.cantTorneos = 0;
        this.puntajeMAyor = 0;
    }

    public Socio(int cod, String nom, String ape, int ed, int cantT, int putMa) {
        this.codigo = cod;
        this.nombre = nom;
        this.apellido = ape;
        this.edad = ed;
        this.cantTorneos = cantT;
        this.puntajeMAyor = putMa;
    }

    // Obeservadores

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getCantTorneos() {
        return cantTorneos;
    }

    public int getPuntajeMayor() {
        return puntajeMAyor;
    }

    public boolean equals(Socio newSocio) {
        return this.codigo == newSocio.codigo;
    }

    public String toString() {
        return "Codigo:" + codigo +
                "\nNombre:" + nombre +
                "\nApellido" + apellido +
                "\nEdad:" + edad +
                "\nCantidad Torneos:" + cantTorneos +
                "\npuntajeMayor:" + puntajeMAyor;
    }

    // Modificadores

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setApellido(String ape) {
        this.apellido = ape;
    }

    public void setEdad(int ed) {
        this.edad = ed;
    }

    public void setCantTorneos(int cantT) {
        this.cantTorneos = cantT;
    }

    public void setPuntajeMayor(int putMa) {
        this.puntajeMAyor = putMa;
    }

    // Propios del tipo
}

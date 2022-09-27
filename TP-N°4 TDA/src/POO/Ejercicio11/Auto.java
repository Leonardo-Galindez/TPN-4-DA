package POO.Ejercicio11;

public class Auto {
    //Atributos
    private String patente;
    private String nombrePropietario;
    private int telefono;
    private String servicio;

    //Metodos

    //Constructores
    public Auto(String pat) {
        this.patente = pat;
        this.nombrePropietario = "";
        this.telefono = 299;
        this.servicio = "basico";
    }

    public Auto(String pat, String nomP, int telef, String servi) {
        this.patente = pat;
        this.nombrePropietario = nomP;
        this.telefono = telef;
        this.servicio = servi;
    }
    //Observadores
    public String getPatente() {
        return patente;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getServicio() {
        return servicio;
    }

    public String toString() {

        return "\nPatente:" + patente +
                "\nNombre Propietario:" + nombrePropietario +
                "\nTelefono:" + telefono +
                "Servicio:" + servicio;
    }

    //Modificadores
    public void setNombrePropietario(String nomP) {
        this.nombrePropietario = nomP;
    }

    public void setTelefono(int telef) {
        this.telefono = telef;
    }

    public void setServicio(String servi) {
        this.servicio = servi;
    }

    //Comparadores

    public boolean equals(Auto nuevoAuto){
        return this.patente.equals(nuevoAuto.patente);
    }

    public int compareTo(Auto nuevoAuto){
        return this.patente.compareTo(nuevoAuto.patente);
    }

    //Propias del tipo

    
}

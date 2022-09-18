package POO.Ejercicio5;
import POO.Ejercicio4.Fecha;

public class Avion {
    // Atributos

    private String idAvion;
    private int Modelo;
    private int CantAsientos;
    private int kilometros;
    private int velocidadPromedio;
    private Fecha fechaMan;
    
    // Constructores

    public Avion(String id) {

        this.idAvion = id;
        this.Modelo = 0;
        this.CantAsientos = 0;
        this.kilometros = 0;
        this.velocidadPromedio = 0;
    
    }

    public Avion(String id, int mod, int cantA, int km, int velProm,Fecha fechaMantenimiento) {

        this.idAvion = id;
        this.Modelo = mod;
        this.CantAsientos = cantA;
        this.kilometros = km;
        this.velocidadPromedio = velProm;
    }

    // Observadores

    public String getIdAvion() {
        return idAvion;
    }

    public int getModelo() {
        return Modelo;
    }

    public int getCantiAsientos() {
        return CantAsientos;
    }

    public int getKilometros() {
        return kilometros;
    }

    public int getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public String toString() {
        return "Id:" + idAvion +
                "\nModelo:" + Modelo +
                "\nCantidad de asientos:" + CantAsientos +
                "\nkilometraje:" + kilometros +
                "\nvelocidad promedio:" + velocidadPromedio;
    }

    public boolean equals(Avion a) {
        return this.idAvion.equals(a.idAvion);
    }

    // Modificadores

    public void setIdAvion(String id) {
        this.idAvion = id;
    }

    public void setModelo(int mod) {
        this.Modelo = mod;
    }

    public void setCantiAsientos(int cantA) {
        this.CantAsientos = cantA;
    }

    public void setKilometros(int km) {
        this.kilometros = km;
    }

    public void setVelocidadPromedio(int velProm) {
        this.velocidadPromedio = velProm;
    }

    public void setfechaMan(Fecha f){
        this.fechaMan=f;
    }

    // Propias del tipo

    public int Vuela(int hora, int velProm, int km) {

        return this.kilometros = this.kilometros + velProm * hora;
    }

    

}

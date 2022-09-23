package POO.Ejercicio5;
import POO.Ejercicio4.Fecha;

public class Avion {
    // Atributos

    private String idAvion;
    private String Modelo;
    private int CantAsientos;
    private int kilometros;
    private int velocidadPromedio;
    private Fecha fechaMan;
    
    // Constructores

    public Avion(String id) {

        this.idAvion = id;
        this.Modelo = "";
        this.CantAsientos = 0;
        this.kilometros = 0;
        this.velocidadPromedio = 0;
        this.fechaMan= new Fecha("0",1,1,1900);
    
    }

    public Avion(String id, String mod, int cantA, int km, int velProm,Fecha fechaMantenimiento) {

        this.idAvion = id;
        this.Modelo = mod;
        this.CantAsientos = cantA;
        this.kilometros = km;
        this.velocidadPromedio = velProm;
        this.fechaMan= new Fecha();
    }

    // Observadores

    public String getIdAvion() {
        return idAvion;
    }

    public String getModelo() {
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
    
    public Fecha getFechaMan() {
        return fechaMan;
    }

    public String toString() {
        return "Id:" + idAvion +
                "\nModelo:" + Modelo +
                "\nCantidad de asientos:" + CantAsientos +
                "\nkilometraje:" + kilometros +
                "\nvelocidad promedio:" + velocidadPromedio+
                "\nUltimo Mantenimiento:" +fechaMan;                
    }

    public boolean equals(Avion a) {
        return this.idAvion.equals(a.idAvion);
    }

    // Modificadores

    public void setIdAvion(String id) {
        this.idAvion = id;
    }

    public void setModelo(String mod) {
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

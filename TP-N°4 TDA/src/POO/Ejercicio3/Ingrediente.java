package POO.Ejercicio3;

public class Ingrediente {

    private String nombre;
    private int cantidad;
    private int medidaUnidad;
    private double medidaLitro;
    private double medidaGramo;


    //Constructores

    public void Ingrediente(String nom){
        this.nombre=nom;
    }

    public void Ingrediente(String nom,int cant,int medU,int medL,int medG){

        this.nombre=nom;
        this.cantidad=cant;
        this.medidaUnidad=medU;
        this.medidaLitro=medL;
        this.medidaGramo=medG;
    }

    //Observadores

    public String getNombre(){
        return nombre;
    }

    public int getCantidad(){
        return cantidad;
    }

    public int getMedidaUnidad(){
        return medidaUnidad;
    }

    public double getMedidaLitro(){
        return medidaLitro;
    }

    public double getMedidaGramo(){
        return medidaGramo;
    }

    public String toString(){
        return "nombre:"+nombre+
                "\ncantidad:"+cantidad+
                "\nUnidades:"+medidaUnidad+
                "\nLitros:"+medidaLitro+
                "\nGramos"+medidaGramo;
    }

    public boolean equals(Ingrediente ingre){
        return nombre.equals(ingre.nombre);
    }
    //\n

    //Modificadores

    public void setNombre(String nom){
        this.nombre=nom;
    }

    public void setCantidad(int cant){
        this.cantidad=cant;
    }

    public void setMedidaUnidad(int medU){
        this.medidaUnidad=medU;
    }

    public void setMedidaLitro(double medL){
        this.medidaLitro=medL;
    }

    public void setMedidaGramo(double medG){
        this.medidaGramo=medG;
    }

}

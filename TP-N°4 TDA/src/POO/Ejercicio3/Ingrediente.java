package POO.Ejercicio3;

public class Ingrediente {

    private String nombre;
    private int cantidad;
    private String medidaUnidad;
    


    //Constructores

    public Ingrediente(String nom){
        this.nombre=nom;
        this.cantidad=0;
        this.medidaUnidad="";
        

    }

    public Ingrediente(String nom,int cant,String medU){

        this.nombre=nom;
        this.cantidad=cant;
        this.medidaUnidad=medU;
        
    }

    
    //Observadores

    public String getNombre(){
        return nombre;
    }

    public int getCantidad(){
        return cantidad;
    }

    public String getMedidaUnidad(){
        return medidaUnidad;
    }

   
    
    public String toString(){
        return "nombre:"+nombre+
                "\ncantidad:"+cantidad+
                "\nUnidades:"+medidaUnidad;

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

    public void setMedidaUnidad(String medU){
        this.medidaUnidad=medU;
    }

    public void Ingrediente(String string) {
    }

    

}

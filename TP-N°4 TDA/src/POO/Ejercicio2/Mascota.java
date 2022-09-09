package POO.Ejercicio2;

public class Mascota {
    
    private int codigo;
    private String nombre;
    private double peso;
    private int edad;

    //Constructores
    public void Mascota(int cod){
        this.codigo=cod;
    }

    public void Mascota(int cod,String nn, double pe, int ed){
        this.codigo=cod;
        this.nombre=nn;
        this.peso=pe;
        this.edad=ed;
    }

    //Observadores

    public int getCodigo(){
        return codigo;
    } 
    public String getNombre( ){
        return nombre;
    } 
    public double getPeso(){
        return peso;
    } 
    public int getEdad(){
        return edad;
    } 
    public String toString(){
        return  "codigo:"+codigo+
                "\nnombre:"+nombre+
                "\npeso:"+peso+
                "\nedad:"+edad;
    }

    //Modificadores

    public void setCodigo(int cod){
        this.codigo=cod;
    }

    public void setNombre(String nn){
        this.nombre=nn;
    }

    public void setPeso(double pe){
        this.peso=pe;
    }

    public void setEdad(int ed){
        this.edad=ed;
    }

    //Propias del tipo

    public boolean Equals(Mascota otra){
        return codigo==otra.codigo;
    }

    public void cumpleMascota(){
        this.edad=edad+1;
    }
    
}

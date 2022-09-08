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

    public int getCodigo(int cod){
        return cod;
    } 
    public String getNombre(String nombre){
        return nombre;
    } 
    public double getPeso(double pe){
        return pe;
    } 
    public int getEdad(int edad){
        return edad;
    } 
    public String toString(){
        return  "codigo"+codigo+
                "\nnombre"+nombre+
                "\npedo"+peso+
                "\nedad"+edad;
    }
    
}

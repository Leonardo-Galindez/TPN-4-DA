package POO.Ejercicio5;

public class Avion {
    //Atributos

    
    private int idAvion;
    private int Modelo;
    private int CantAsientos;
    private int kilometros;
    private int velocidadPromedio;

    //Constructores

    public Avion(int id){

        this.idAvion=id;

    }

    public Avion(int id,int mod, int cantA, int km, int velProm){

        this.idAvion=id;
        this.Modelo=mod;
        this.CantAsientos=cantA;
        this.kilometros=km;
        this.velocidadPromedio=velProm;

    }

    //Observadores

    public int getIdAvion(){
        return idAvion;
    }

    public int getModelo(){
        return Modelo;
    }

    public int getCantiAsientos(){
        return CantAsientos;
    }

    public int getKilometros(){
        return kilometros;
    }

    public int getVelocidadPromedio(){
        return velocidadPromedio;
    }

    public String toString(){
        return "Id:"+idAvion+
                "\nModelo:"+Modelo+
                "\nCantidad de asientos:"+CantAsientos+
                "\nkilometraje:"+kilometros+
                "\nvelocidad promedio:"+velocidadPromedio;
    }

    public boolean equals(int id){
        return  this.idAvion==id;
    }


    //Modificadores

    public void setIdAvion(int id){
        this.idAvion=id;
    }

    public void setModelo(int mod){
       this.Modelo=mod;
    }

    public void setCantiAsientos(int cantA){
       this.CantAsientos=cantA;
    }

    public void setKilometros(int km){
        this.kilometros=km;
    }

    public void setVelocidadPromedio(int velProm){
        this.velocidadPromedio=velProm;
    }

    //Propias del tipo

    public int Vuela(int hora,int velProm,int km){

        return this.kilometros=this.kilometros+velProm*hora; 
    }



}

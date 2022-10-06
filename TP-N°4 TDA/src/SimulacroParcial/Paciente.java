
package SimulacroParcial;
public class Paciente {
    private int dni;

    public Paciente(int dni){
        this.dni=dni;
    }

    public boolean equals(Paciente p){
        return this.dni==p.dni;
    }
    public String toString(){
        return "DNI:"+dni;
    }   
}

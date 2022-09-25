package SimulacroParcial;

public class Salon {

    // Atributos

    private String nombre;
    private int disponibilidad;
    private boolean musica;
    private String direccion;
    private int telefono;

    // Constructores

    public Salon(String nom) {

        this.nombre = nom;
        this.disponibilidad = 0;
        this.musica = false;
        this.direccion = "";
        this.telefono = 0;
    }

    public Salon(String nom, int disp, boolean music, String direc, int telef) {

        this.nombre = nom;
        this.disponibilidad = disp;
        this.musica = music;
        this.direccion = direc;
        this.telefono = telef;
    }

    // Observadores

    public String getNombre() {
        return this.nombre;
    }

    public int getDisponibilidad() {
        return this.disponibilidad;
    }

    public boolean getMusica() {
        return this.musica;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public String toString() {
        return "Nombre:" + this.nombre +
                "\ndisponibilidad:" + this.disponibilidad +
                "\nmusica:" + this.musica +
                "\ndireccion:" + this.direccion +
                "\ntelefono:" + this.telefono;
    }

    // Modificadores

    public void setDisponibilidad(int disp) {
        this.disponibilidad = disp;
    }

    public void setMusica(boolean music) {
        this.musica = music;
    }

    public void setDireccion(String direc) {
        this.direccion = direc;
    }

    public void setTelefono(int telef) {
        this.telefono = telef;
    }

    // Comparadores

    public boolean equals(Salon s) {
        return this.nombre.equals(s.nombre);
    }

    public int compareTo(Salon s) {
        return this.nombre.compareTo(s.nombre);
    }

    // Propias del tipo

    public boolean adecuadoCantInvitados(int cantidad) {
        boolean valorDisp;
        valorDisp = false;
        if (cantidad <= this.disponibilidad * 0.85 && cantidad >= this.disponibilidad * 0.75) {
            valorDisp = true;
        }
        return valorDisp;
    }

    public boolean noApto(int cantidad) {
        boolean valorDisp;
        valorDisp = false;
        if (cantidad < this.disponibilidad * 0.05 || cantidad > this.disponibilidad) {
            valorDisp = true;
        }
        return valorDisp;
    }

    public static int MayorCapacidad(Salon[] Salones) {
        int posMayor, mayor;
        mayor = 0;
        posMayor = 0;
        for (int i = 0; i < Salones.length; i++) {
            if (Salones[i].getDisponibilidad() > mayor) {
                mayor = Salones[i].getDisponibilidad();
                posMayor = i;
            }
        }
        return posMayor;
    }

}

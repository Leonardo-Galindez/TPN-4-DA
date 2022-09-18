package POO.Ejercicio4;

public class Fecha {

    // Atributos

    private int codigo;
    private int dia;
    private int mes;
    private int anio;

    // Constructores

    public Fecha(int cod) {
        this.codigo = cod;
    }

    public Fecha(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.anio = a;
    }

    // Observadores

    public int getCodigo() {
        return codigo;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }

    /*
     * public boolean equals(){
     * return
     * }
     */

    // Modificadores

    public void setCodigo(int cod) {
        this.codigo = cod;
    }

    public void setDia(int d) {
        this.dia = d;
    }

    public void setMes(int m) {
        this.mes = m;
    }

    public void setAnio(int a) {
        this.anio = a;
    }

    // Propias del tipo

    public int diasTranscurridos(int d, int m, int a) {
        int diasTotal;

        diasTotal = 0;

        int[] Dias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (a % 4 == 0) {
            Dias[1] = 29;
        }

        for (int i = m - 1; i >= 0; i--) {
            diasTotal = diasTotal + Dias[i];
        }

        return diasTotal - d;
    }

    public boolean esFechaAnterio(int d, int m, int a) {

        boolean valorFecha;
        valorFecha = false;

        if (this.dia > d || this.mes > m || this.anio > a) {
            valorFecha = true;
        }

        return valorFecha;
    }

    public boolean esBisiesto(int a) {

        boolean valorBi;
        valorBi = false;

        if (a % 4 == 0) {
            valorBi = true;
        }

        return valorBi;
    }

    public void calcularFecha(int dia, int mes, int anio, int d) {
        int diasTotal;
        boolean valorFecha;
        valorFecha=false;

        int[] Dias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (anio % 4 == 0) {
            Dias[1] = 29;
        }

        diasTotal=dia+d;

        while(!valorFecha){
            
            diasTotal=diasTotal-Dias[mes-1];
            mes++;
            if(diasTotal<=Dias[mes-1]){
                valorFecha=true;
                this.dia=diasTotal;
                this.mes=mes-1;
            }

            if(mes>11){
                this.mes=1;
                this.anio=this.anio+1;
                mes=1;
            }

        }

        /*restoAnio = mes;
        dia = dia + d;
        cantMes = dia / 30;
        restoMes = dia % 30;

        if (dia > 31) {

            mes = mes + cantMes;

            if (mes > 12) {

                cantAnio = mes / 12;
                restoAnio = mes % 12;
                anio = anio + cantAnio;

            }

        if (restoMes == 0) {
            this.dia = 1;
        } else {
            this.dia = restoMes;
        }
        if (restoAnio == 0) {
            this.mes = 1;
        } else {
            this.mes = restoAnio;
        }
        this.anio = anio;*/
    }

}

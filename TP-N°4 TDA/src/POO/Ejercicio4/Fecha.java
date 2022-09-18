package POO.Ejercicio4;

public class Fecha {

    // Atributos

    private int dia;
    private int mes;
    private int anio;
    private boolean fechaCorrecta;

    // Constructores
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1;
        this.fechaCorrecta = true;
    }

    public Fecha(int elDia, int elMes, int elAnio) {
        fechaCorrecta = true;

        if (elAnio > 0 || elAnio < 10000)
            anio = elAnio;
        else
            anio = 0;

        if (elMes > 0 && elMes < 13)
            mes = elMes;
        else
            mes = 0;

        if (elDia > 31 || elDia < 1)
            dia = 0;
        else {
            if (elDia < 29)
                dia = elDia;
            else {
                switch (dia) {

                    case 29:
                        if (mes == 2) {
                            if (esBisiesto())
                                dia = elDia;
                            else
                                dia = 0;
                        } else
                            dia = elDia;
                        break;

                    case 30:
                        if (mes == 2)
                            dia = 0;
                        else
                            dia = elDia;
                        break;

                    case 31:
                        if (mes == 2 || mes == 11 || mes == 4 || mes == 6 || mes == 9)
                            dia = 0;
                        else
                            dia = elDia;
                        break;
                }
            }
        }

        // o bien
        if (anio == 0 || mes == 0 || anio == 0){
            fechaCorrecta = false;
        }

    }

    // Observadores

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

    // Modificadores

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

    public boolean esBisiesto() {

        boolean valorBi;
        valorBi = false;

        if (this.anio % 4 == 0) {
            valorBi = true;
        }

        return valorBi;
    }

    public void calcularFecha(int dia, int mes, int anio, int d) {
        int diasTotal;
        boolean valorFecha;
        valorFecha = false;

        int[] Dias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (anio % 4 == 0) {
            Dias[1] = 29;
        }

        diasTotal = dia + d;

        while (!valorFecha) {

            diasTotal = diasTotal - Dias[mes - 1];
            mes++;
            if (diasTotal <= Dias[mes - 1]) {
                valorFecha = true;
                this.dia = diasTotal;
                this.mes = mes - 1;
            }

            if (mes > 11) {
                this.mes = 1;
                this.anio = this.anio + 1;
                mes = 1;
            }

        }

    }

}

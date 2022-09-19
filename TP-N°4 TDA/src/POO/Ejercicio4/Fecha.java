package POO.Ejercicio4;

public class Fecha {

    // Atributos
    private String codigo;
    private int dia;
    private int mes;
    private int anio;
    private boolean fechaCorrecta;

    // Constructores
    public Fecha (){
        codigo="";
        dia=0;
        mes=0;
        anio=0;
    }

    public Fecha(String cod, int elDia, int elMes, int elAnio) {
        this.codigo = cod;
        this.fechaCorrecta = true;

        if (elAnio > 0 || elAnio < 10000) {
            this.anio = elAnio;
        } else {
            this.anio = 0;
        }

        if (elMes > 0 && elMes < 13) {
                this.mes = elMes;
            } else {
                this.mes = 0;
        }
        

        if (elDia > 31 || elDia < 1) {
            this.dia = 0;
        } else {
            if (elDia < 29) {

                this.dia = elDia;

            } else {
                switch (this.dia) {

                    case 29:
                        if (this.mes == 2) {
                            if (esBisiesto()) {
                                this.dia = elDia;
                            } else {

                                this.dia = 0;
                            }
                        } else {
                            this.dia = elDia;
                        }
                        break;

                    case 30:
                        if (this.mes == 2) {
                            this.dia = 0;
                        } else {
                            this.dia = elDia;
                        }
                        break;

                    case 31:
                        if (this.mes == 2 || this.mes == 11 || this.mes == 4 || this.mes == 6 || mes == 9) {
                            this.dia = 0;
                        } else {
                            this.dia = elDia;
                        }
                        break;
                }
            }
        }

        if (this.dia == 0 || mes == 0 || anio == 0) {
            this.fechaCorrecta = false;
        }

    }

    // Observadores

    public String getCodigo() {
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

    public boolean esFechaCorrecta() {
        return fechaCorrecta == true;
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
       
            while (!valorFecha ) {
                if(diasTotal>31){
                    diasTotal = diasTotal - Dias[mes - 1];
                }
                
                if(diasTotal<0){
                    diasTotal=diasTotal*-1;
                }
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

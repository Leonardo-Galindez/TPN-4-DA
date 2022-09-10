package POO.Ejercicio4;

public class Fecha {

    //Atributos

    private int dia;
    private int mes;
    private int anio;

    //Constructores

    public void Fecha(int d, int m, int a){

        this.dia=d;
        this.mes=m;
        this.anio=a;
    }

    //Observadores

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAnio(){
        return anio;
    }

    public String toString(){
        return dia+"/"+mes+"/"+anio;
    }
    
    /*public boolean equals(){  
        return 
    }*/

    //Modificadores

    public void setDia(int d){
        this.dia=d;
    }

    public void setMes(int m){
        this.mes=m;
    }

    public void setAnio(int a){
        this.anio=a;
    }

    //Propias del tipo

    public int diasTranscurridos(int d, int m, int a){
        int diasTotal;
        diasTotal=0;
        int [] Dias={31,28,31,30,31,30,31,31,30,31,30,31};
        if(a % 4==0){
            Dias[1]=29;
        }
        for(int i=m-1;i>=0;i--){
            diasTotal=diasTotal+Dias[i];
        }
        return diasTotal-d;
    }

    public boolean esFechaAnterio(int d, int m, int a){
        boolean valorFecha;
        valorFecha=false;

        if(this.dia>d || this.mes>m || this.anio>a){
            valorFecha=true;
        }
        return valorFecha;
    }

    public boolean esBisiesto(int a){
        boolean valorBi;
        valorBi=false;
        if(a % 4==0){
            valorBi=true;
        }
        return valorBi;
    }

    //falta hacer el calculo fecha
}

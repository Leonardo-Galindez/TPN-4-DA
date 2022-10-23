package SimulacroParcial;

public class EjercicioRecursividad {
    public static void main(String[] args) {
        int num=3;

    }
    public static int algo (int n){ //precondicion: n es un entero positivo
        int aux;
        if (n==1)
            aux = 1;
        else
            aux= algo(n-1) + 1;
        return aux;
    }
}

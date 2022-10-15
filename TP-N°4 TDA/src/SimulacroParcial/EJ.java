package SimulacroParcial;

import java.util.Scanner;

public class EJ {
    public static void main(String[] args) {
        int cont;
        cont=ContarMult3();
        System.out.println(cont);

    }

    public static int ContarMult3() {
        Scanner sc = new Scanner(System.in);
        int num;
        int cont = 0;
        System.out.println("Ingrese numero");
        num = sc.nextInt();
        if (num != 0) {
            if (num % 3 == 0) {
                cont = 1 + ContarMult3();
            } else {
                cont = 0 + ContarMult3();
            }

        }
        return cont;
    }
}

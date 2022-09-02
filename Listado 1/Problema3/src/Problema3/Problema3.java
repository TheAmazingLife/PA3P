package problema3;

public class Problema3 {
    public static void main(String[] args) {
        int sum, aux, cont;
        sum = 0;
        aux = 1;
        cont = 1;
        do {
            if (aux%2 != 0) {
                sum = sum + aux;
                cont = cont + 1;
            }
            aux = aux + 1;
        } while (cont <=100);
        System.out.println("La suma es: "+sum);
    }  
}
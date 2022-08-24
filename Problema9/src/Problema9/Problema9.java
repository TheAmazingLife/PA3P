package problema9;

public class Problema9 {
    public static void main(String[] args) {
        ComoStruct cs = new ComoStruct();
        int cont = 1;
        int primero = cs.ar[0], longitud = cs.ar.length;
        for (int i = 0; i < longitud - 1; i++) {
            cs.ar[i] = cs.ar[i+1];
        }
         cs.ar[longitud - 1] = primero;
        for (int i = 0; i < longitud; i++) {
            if (cont == 0) {
                System.out.print("," + cs.ar[i]);
                }else{
                System.out.print(cs.ar[i]);
                cont = cont - 1;
                }
        }
        System.out.println();
    }
}

class ComoStruct {
       int ar[]={3,2,1,5,7,3,0,10,5};
}
package problema8;

public class Problema8 {
    public static void main(String[] args) {
        ComoStruct cs = new ComoStruct();
        int aux = 1;
        for (int i = 0; i < cs.ar.length; i++) {
            if (cs.ar[i]%2 == 0) {
                if (aux == 0) {
                System.out.print(","+cs.ar[i]);
                }else{
                System.out.print(cs.ar[i]);
                aux = aux - 1;
                }
            }
        }
        System.out.println();
    }
}

class ComoStruct {
       int ar[]={3,2,1,5,7,3,0,10,5};
}
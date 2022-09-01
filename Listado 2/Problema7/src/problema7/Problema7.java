package problema7;

public class Problema7 {

    public static void main(String[] args) {
        ComoStructM cs = new ComoStructM();
        int aux;
        int largo = cs.ar[0].length;
        int num = cs.ar.length - 1;
        
        for (int i = 0; i < largo; i++) {
            aux = cs.ar[0][i];
            cs.ar[0][i] = cs.ar[num][i];
            cs.ar[num][i] = aux;
        }
        
        for (int i = 0; i < cs.ar.length; i++) {
            for (int j = 0; j < largo; j++) {
                if (j != 0) {
                    System.out.print("," + cs.ar[i][j]);
                } else {
                    System.out.print(cs.ar[i][j]);
                }
            }
            System.out.println();
        }
    }
}
class ComoStructM {
       int ar[][]={{3,2,0,-1,-2},{4,8,1,-3,-4},{6,9,5,-9,-7}};
    }

package problema6;

public class Problema6 {
    public static void main(String[] args) {
        int R[]={3,2,1,5,7,3,0,10,5};
        int aux;
        for (int i = 0; i < R.length/2; i++) {
            aux = R[i];
            R[i] = R[R.length - 1 -i];
            R[R.length - 1 -i] = aux;
        }
        for (int i = 0; i < R.length; i++) {
            if (i != R.length-1) {
                System.out.print(R[i]+",");
            }else{
                System.out.println(R[i]);
            }
        }
    }  
}
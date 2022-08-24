package problema4;

public class Problema4 {
    public static void main(String[] args) {
        int R[]={3,2,1,5,7,3,0,10};
        int max = 0;
        for (int i = 0; i < R.length; i++) {
            if (R[i] > R[max]) {
                max = i;
            }
        }
        System.out.println(R[max]);
    }  
}
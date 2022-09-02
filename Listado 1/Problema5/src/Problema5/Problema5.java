package problema5;

public class Problema5 {
    public static void main(String[] args) {
        int b[]={3,2,1,5,7,3,0,10,5};
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum = sum + b[i];
        }
        float prom = (float)sum / (float)b.length;
        System.out.println(prom);
    }  
}
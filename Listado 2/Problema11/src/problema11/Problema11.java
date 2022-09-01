package problema11;

public class Problema11 {

    public static void main(String[] args) {
        OtraClase n = new OtraClase(10);
        int num = n.sacaDato();
        System.out.println(num);
    }
}

class OtraClase{
    private int num;
    public OtraClase(int n) {
        num = n;
    }
    public int sacaDato(){
        return num;
    }
}